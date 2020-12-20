package de.tesis.dynaware.grapheditor.core.selections;

import de.tesis.dynaware.grapheditor.GGroupSkin;
import de.tesis.dynaware.grapheditor.GNodeSkin;
import de.tesis.dynaware.grapheditor.GTextSkin;
import de.tesis.dynaware.grapheditor.SkinLookup;
import de.tesis.dynaware.grapheditor.core.utils.GModelUtils;
import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GGroup;
import de.tesis.dynaware.grapheditor.model.GJoint;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.model.GText;
import de.tesis.dynaware.grapheditor.model.GraphPackage;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Manages cut, copy, & paste actions on the current selection.
 *
 * <p>
 * The rules for what is copied are as follows:
 * <ol>
 * <li>All selected nodes and their connectors (containment references) are copied.</li>
 * <li>If a connection's source and target nodes are <b>both</b> copied, the connection and its joints are also copied.</li>
 * </ol>
 * </p>
 */
public class SelectionCopier {

    private static final EReference NODES = GraphPackage.Literals.GMODEL__NODES;
    private static final EReference CONNECTIONS = GraphPackage.Literals.GMODEL__CONNECTIONS;
    private static final EReference TEXTS = GraphPackage.Literals.GMODEL__TEXTS;
    private static final EReference GROUPS = GraphPackage.Literals.GMODEL__GROUPS;

    private static final double BASE_PASTE_OFFSET = 20;

    private final SkinLookup skinLookup;
    private final SelectionTracker selectionTracker;
    private final SelectionCreator selectionCreator;
    private final SelectionDeleter selectionDeleter;

    private final List<GNode> copiedNodes = new ArrayList<>();
    private final List<GConnection> copiedConnections = new ArrayList<>();
    private final List<GText> copiedTexts = new ArrayList<>();
    private final List<GGroup> copiedGroups = new ArrayList<>();

    private Parent parentAtTimeOfCopy;
    private double parentSceneXAtTimeOfCopy;
    private double parentSceneYAtTimeOfCopy;

    private GModel model;

    /**
     * Creates a new {@link SelectionCopier} instance.
     *
     * @param skinLookup       the {@link SkinLookup} instance for the graph editor
     * @param selectionTracker the {@link SelectionTracker} instance for the graph editor
     * @param selectionCreator the {@link SelectionCreator} instance for the graph editor
     * @param selectionDeleter the {@link SelectionDeleter} instance for the graph editor
     */
    public SelectionCopier(final SkinLookup skinLookup, final SelectionTracker selectionTracker,
                           final SelectionCreator selectionCreator, final SelectionDeleter selectionDeleter) {

        this.skinLookup = skinLookup;
        this.selectionTracker = selectionTracker;
        this.selectionCreator = selectionCreator;
        this.selectionDeleter = selectionDeleter;
    }

    /**
     * Initializes the selection copier for the current model.
     *
     * @param model the {@link GModel} currently being edited
     */
    public void initialize(final GModel model) {
        this.model = model;
    }

    /**
     * Cuts the current selection and stores it in memory.
     *
     * @param handler a {@link CommandAppender} to allow custom commands to be appended to the cut command
     */
    public void cut(final BiConsumer<List<GNode>, CompoundCommand> consumer) {

        if (selectionTracker.getSelectedNodes().isEmpty() && selectionTracker.getSelectedTexts().isEmpty()) {
            return;
        }

        copy();
        selectionDeleter.deleteSelection(model, consumer);
    }

    /**
     * Copies the current selection and stores it in memory.
     */
    public void copy() {

        if (selectionTracker.getSelectedNodes().isEmpty() && selectionTracker.getSelectedTexts().isEmpty()) {
            return;
        }

        copiedNodes.clear();
        copiedConnections.clear();
        copiedTexts.clear();

        final Map<GNode, GNode> copyStorage = new HashMap<>();

        // Don't iterate directly over selectionTracker.getSelectedNodes() because that will not preserve ordering.
        for (final GNode node : model.getNodes()) {
            if (selectionTracker.getSelectedNodes().contains(node)) {

                final GNode copiedNode = EcoreUtil.copy(node);
                copiedNodes.add(copiedNode);
                copyStorage.put(node, copiedNode);
            }
        }

        for (final GText text : model.getTexts()) {
            if (selectionTracker.getSelectedTexts().contains(text)) {

                final GText copiedText = EcoreUtil.copy(text);
                copiedTexts.add(copiedText);
            }
        }

        for (final GGroup group : model.getGroups()) {
            if (selectionTracker.getSelectedGroups().contains(group)) {

                final GGroup copiedGroup = EcoreUtil.copy(group);
                copiedGroups.add(copiedGroup);
            }
        }

        copiedConnections.addAll(GModelUtils.copyConnections(copyStorage));
        saveParentPositionInScene();
    }

    /**
     * Pastes the most-recently-copied selection.
     *
     * <p>
     * After the paste operation, the newly-pasted elements will be selected.
     * </p>
     *
     * @param consumer a consumer to allow custom commands to be appended to the paste command
     * @return the list of new {@link GNode} instances created by the paste operation
     */
    public List<GNode> paste(final BiConsumer<List<GNode>, CompoundCommand> consumer) {

        selectionCreator.deselectAll();

        final List<GNode> pastedNodes = new ArrayList<>();
        final List<GConnection> pastedConnections = new ArrayList<>();
        final List<GText> pastedTexts = new ArrayList<>();
        final List<GGroup> pastedGroups = new ArrayList<>();

        preparePastedElements(pastedNodes, pastedConnections, pastedTexts, pastedGroups);
        addPasteOffset(pastedNodes, pastedConnections, pastedTexts, pastedGroups);
        checkWithinBounds(pastedNodes, pastedConnections, pastedTexts, pastedGroups);
        addPastedElements(pastedNodes, pastedConnections, pastedTexts, pastedGroups, consumer);

        for (final GNode pastedNode : pastedNodes) {
            skinLookup.lookupNode(pastedNode).setSelected(true);
        }

        for (final GConnection pastedConnection : pastedConnections) {
            for (final GJoint pastedJoint : pastedConnection.getJoints()) {
                skinLookup.lookupJoint(pastedJoint).setSelected(true);
            }
        }

        for (final GText pastedText : pastedTexts) {
            skinLookup.lookupText(pastedText).setSelected(true);
        }

        for (final GGroup pastedGroup : pastedGroups) {
            skinLookup.lookupGroup(pastedGroup).setSelected(true);
        }

        return pastedNodes;
    }

    /**
     * Clears the memory of what was cut / copied. Future paste operations will do nothing.
     */
    public void clearMemory() {
        copiedNodes.clear();
        copiedConnections.clear();
        copiedTexts.clear();
        copiedGroups.clear();
    }

    /**
     * Prepares the lists of pasted nodes and connections.
     *
     * @param pastedNodes       an empty list to be filled with pasted nodes
     * @param pastedConnections an empty list to be filled with pasted connections
     */
    private void preparePastedElements(final List<GNode> pastedNodes, final List<GConnection> pastedConnections, final List<GText> pastedTexts, final List<GGroup> pastedGroups) {

        final Map<GNode, GNode> pasteStorage = new HashMap<>();

        for (final GNode copiedNode : copiedNodes) {

            final GNode pastedNode = EcoreUtil.copy(copiedNode);
            pastedNodes.add(pastedNode);

            pasteStorage.put(copiedNode, pastedNode);
        }

        pastedConnections.addAll(GModelUtils.copyConnections(pasteStorage));

        for (final GText copiedText : copiedTexts) {

            final GText pastedText = EcoreUtil.copy(copiedText);
            pastedTexts.add(pastedText);
        }

        for (final GGroup copiedGroup : copiedGroups) {

            final GGroup pastedGroup = EcoreUtil.copy(copiedGroup);
            pastedGroups.add(pastedGroup);
        }
    }

    /**
     * Adds an x and y offset to all nodes and connections that are about to be pasted.
     *
     * @param pastedNodes       the nodes that are going to be pasted
     * @param pastedConnections the connections that are going to be pasted
     * @param pastedGroups
     */
    private void addPasteOffset(final List<GNode> pastedNodes, final List<GConnection> pastedConnections, final List<GText> pastedTexts, List<GGroup> pastedGroups) {

        final Point2D pasteOffset = determinePasteOffset();

        for (final GNode node : pastedNodes) {
            node.setX(node.getX() + pasteOffset.getX());
            node.setY(node.getY() + pasteOffset.getY());
        }

        for (final GConnection connection : pastedConnections) {
            for (final GJoint joint : connection.getJoints()) {
                joint.setX(joint.getX() + pasteOffset.getX());
                joint.setY(joint.getY() + pasteOffset.getY());
            }
        }

        for (final GText text : pastedTexts) {
            text.setX(text.getX() + pasteOffset.getX());
            text.setY(text.getY() + pasteOffset.getY());
        }

        for (final GGroup group : pastedGroups) {
            group.setX(group.getX() + pasteOffset.getX());
            group.setY(group.getY() + pasteOffset.getY());
        }
    }

    /**
     * Checks that the pasted node and joints will be inside the bounds of their parent.
     *
     * <p>
     * Corrects the x and y positions accordingly if they will be outside the bounds.
     * </p>
     *
     * @param pastedNodes       the nodes that are going to be pasted
     * @param pastedConnections the connections that are going to be pasted
     * @param pastedGroups
     */
    private void checkWithinBounds(final List<GNode> pastedNodes, final List<GConnection> pastedConnections, final List<GText> pastedTexts, List<GGroup> pastedGroups) {

        if (parentAtTimeOfCopy instanceof Region) {

            final Region parentRegion = (Region) parentAtTimeOfCopy;

            final Bounds parentBounds = getBounds(parentRegion);
            final Bounds contentBounds = getContentBounds(pastedNodes, pastedConnections, pastedTexts, pastedGroups);

            double xCorrection = 0;
            double yCorrection = 0;

            if (contentBounds.startX < parentBounds.startX) {
                xCorrection = parentBounds.startX - contentBounds.startX;
            } else if (contentBounds.endX > parentBounds.endX) {
                xCorrection = parentBounds.endX - contentBounds.endX;
            }

            if (contentBounds.startY < parentBounds.startY) {
                yCorrection = parentBounds.startY - contentBounds.startY;
            } else if (contentBounds.endY > parentBounds.endY) {
                yCorrection = parentBounds.endY - contentBounds.endY;
            }

            if (xCorrection != 0 || yCorrection != 0) {

                for (final GNode node : pastedNodes) {
                    node.setX(node.getX() + xCorrection);
                    node.setY(node.getY() + yCorrection);
                }

                for (final GConnection connection : pastedConnections) {
                    for (final GJoint joint : connection.getJoints()) {
                        joint.setX(joint.getX() + xCorrection);
                        joint.setY(joint.getY() + yCorrection);
                    }
                }

                for (final GText text : pastedTexts) {
                    text.setX(text.getX() + xCorrection);
                    text.setY(text.getY() + yCorrection);
                }

                for (final GGroup group : pastedGroups) {
                    group.setX(group.getX() + xCorrection);
                    group.setY(group.getY() + yCorrection);
                }
            }
        }
    }

    /**
     * Adds the pasted elements to the graph editor via a single EMF command.
     *
     * @param pastedNodes       the pasted nodes to be added
     * @param pastedConnections the pasted connections to be added
     * @param consumer          a consumer to allow custom commands to be appended to the paste command
     */
    private void addPastedElements(final List<GNode> pastedNodes, final List<GConnection> pastedConnections, List<GText> pastedTexts, List<GGroup> pastedGroups,
                                   final BiConsumer<List<GNode>, CompoundCommand> consumer) {

        final EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(model);
        final CompoundCommand command = new CompoundCommand();

        for (final GNode pastedNode : pastedNodes) {
            command.append(AddCommand.create(editingDomain, model, NODES, pastedNode));
        }

        for (final GConnection pastedConnection : pastedConnections) {
            command.append(AddCommand.create(editingDomain, model, CONNECTIONS, pastedConnection));
        }

        for (final GText pastedText : pastedTexts) {
            command.append(AddCommand.create(editingDomain, model, TEXTS, pastedText));
        }

        for (final GGroup pastedGroup : pastedGroups) {
            command.append(AddCommand.create(editingDomain, model, GROUPS, pastedGroup));
        }

        if (command.canExecute()) {
            editingDomain.getCommandStack().execute(command);
        }

        if (consumer != null) {
            consumer.accept(pastedNodes, command);
        }

    }

    /**
     * Saves the position in the scene of the JavaFX {@link Parent} of the node skins.
     */
    private void saveParentPositionInScene() {
        Parent parent = null;
        if (!selectionTracker.getSelectedNodes().isEmpty()) {

            final GNode firstSelectedNode = selectionTracker.getSelectedNodes().get(0);
            final GNodeSkin firstSelectedNodeSkin = skinLookup.lookupNode(firstSelectedNode);

            final Node root = firstSelectedNodeSkin.getRoot();
            parent = root.getParent();

        } else if (!selectionTracker.getSelectedTexts().isEmpty()) {

            final GText firstSelectedText = selectionTracker.getSelectedTexts().get(0);
            final GTextSkin firstSelectedTextSkin = skinLookup.lookupText(firstSelectedText);

            final Node root = firstSelectedTextSkin.getRoot();
            parent = root.getParent();
        } else if (!selectionTracker.getSelectedGroups().isEmpty()) {

            final GGroup firstSelectedGroup = selectionTracker.getSelectedGroups().get(0);
            final GGroupSkin firstSelectedGroupSkin = skinLookup.lookupGroup(firstSelectedGroup);

            final Node root = firstSelectedGroupSkin.getRoot();
            parent = root.getParent();
        }
        if (parent != null) {

            parentAtTimeOfCopy = parent;

            final Point2D localToScene = parent.localToScene(0, 0);

            parentSceneXAtTimeOfCopy = localToScene.getX();
            parentSceneYAtTimeOfCopy = localToScene.getY();
        }
    }

    /**
     * Determines the offset by which the new nodes and joints should be positioned relative to the nodes and joints
     * they were copied from.
     *
     * <p>
     * The aim here is to paste the new nodes and joints into a <b>visible</b> area on the screen, even if the user has
     * panned around in the graph editor container since the copy-action took place.
     * </p>
     *
     * @return a {@link Point2D} containing the x and y offsets
     */
    private Point2D determinePasteOffset() {

        double offsetX = BASE_PASTE_OFFSET;
        double offsetY = BASE_PASTE_OFFSET;

        if (parentAtTimeOfCopy != null) {

            final Point2D localToScene = parentAtTimeOfCopy.localToScene(0, 0);

            final double parentSceneXAtTimeOfPaste = localToScene.getX();
            final double parentSceneYAtTimeOfPaste = localToScene.getY();

            offsetX += parentSceneXAtTimeOfCopy - parentSceneXAtTimeOfPaste;
            offsetY += parentSceneYAtTimeOfCopy - parentSceneYAtTimeOfPaste;
        }

        return new Point2D(offsetX, offsetY);
    }

    /**
     * Gets the start and end x- and y-positions of the given region (including insets).
     *
     * @param region a {@link Region}
     * @return the bounds of the given region
     */
    private Bounds getBounds(final Region region) {

        final Bounds bounds = new Bounds();

        bounds.startX = region.getInsets().getLeft();
        bounds.startY = region.getInsets().getTop();

        bounds.endX = region.getWidth() - region.getInsets().getRight();
        bounds.endY = region.getHeight() - region.getInsets().getBottom();

        return bounds;
    }

    /**
     * Gets the start and end x- and y-positions of the given group of nodes and joints.
     *
     * @param nodes       a list of nodes
     * @param connections a list of connections
     * @return the start and end x- and y-positions of the given nodes and joints.
     */
    private Bounds getContentBounds(final List<GNode> nodes, final List<GConnection> connections, List<GText> texts, List<GGroup> groups) {

        final Bounds contentBounds = new Bounds();

        contentBounds.startX = Double.MAX_VALUE;
        contentBounds.startY = Double.MAX_VALUE;

        contentBounds.endX = 0;
        contentBounds.endY = 0;

        for (final GNode node : nodes) {

            if (node.getX() < contentBounds.startX) {
                contentBounds.startX = node.getX();
            }
            if (node.getY() < contentBounds.startY) {
                contentBounds.startY = node.getY();
            }
            if (node.getX() + node.getWidth() > contentBounds.endX) {
                contentBounds.endX = node.getX() + node.getWidth();
            }
            if (node.getY() + node.getHeight() > contentBounds.endY) {
                contentBounds.endY = node.getY() + node.getHeight();
            }
        }

        for (final GConnection connection : connections) {
            for (final GJoint joint : connection.getJoints()) {

                if (joint.getX() < contentBounds.startX) {
                    contentBounds.startX = joint.getX();
                }
                if (joint.getY() < contentBounds.startY) {
                    contentBounds.startY = joint.getY();
                }
                if (joint.getX() > contentBounds.endX) {
                    contentBounds.endX = joint.getX();
                }
                if (joint.getY() > contentBounds.endY) {
                    contentBounds.endY = joint.getY();
                }
            }
        }

        for (final GText text : texts) {

            if (text.getX() < contentBounds.startX) {
                contentBounds.startX = text.getX();
            }
            if (text.getY() < contentBounds.startY) {
                contentBounds.startY = text.getY();
            }
            if (text.getX() + text.getWidth() > contentBounds.endX) {
                contentBounds.endX = text.getX() + text.getWidth();
            }
            if (text.getY() + text.getHeight() > contentBounds.endY) {
                contentBounds.endY = text.getY() + text.getHeight();
            }
        }

        for (final GGroup group : groups) {

            if (group.getX() < contentBounds.startX) {
                contentBounds.startX = group.getX();
            }
            if (group.getY() < contentBounds.startY) {
                contentBounds.startY = group.getY();
            }
            if (group.getX() + group.getWidth() > contentBounds.endX) {
                contentBounds.endX = group.getX() + group.getWidth();
            }
            if (group.getY() + group.getHeight() > contentBounds.endY) {
                contentBounds.endY = group.getY() + group.getHeight();
            }
        }

        return contentBounds;
    }

    /**
     * Stores start and end x- and y-positions of a rectangular object.
     */
    private class Bounds {

        public double startX;
        public double startY;
        public double endX;
        public double endY;
    }
}
