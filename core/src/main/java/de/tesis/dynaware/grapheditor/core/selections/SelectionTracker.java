package de.tesis.dynaware.grapheditor.core.selections;

import de.tesis.dynaware.grapheditor.GConnectionSkin;
import de.tesis.dynaware.grapheditor.GGroupSkin;
import de.tesis.dynaware.grapheditor.GJointSkin;
import de.tesis.dynaware.grapheditor.GNodeSkin;
import de.tesis.dynaware.grapheditor.GTextSkin;
import de.tesis.dynaware.grapheditor.SkinLookup;
import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GGroup;
import de.tesis.dynaware.grapheditor.model.GJoint;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.model.GText;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Provides observable lists of selected nodes and joints for convenience.
 */
public class SelectionTracker {

    ObservableList<GNode> selectedNodes = FXCollections.observableArrayList();
    ObservableList<GConnection> selectedConnections = FXCollections.observableArrayList();
    ObservableList<GJoint> selectedJoints = FXCollections.observableArrayList();
    ObservableList<GText> selectedTexts = FXCollections.observableArrayList();
    ObservableList<GGroup> selectedGroups = FXCollections.observableArrayList();

    private final SkinLookup skinLookup;

    /**
     * Creates a new {@link SelectionTracker} instance.
     *
     * @param skinLookup the {@link SkinLookup} for this graph editor instance
     */
    public SelectionTracker(final SkinLookup skinLookup) {
        this.skinLookup = skinLookup;
    }

    /**
     * Initializes the selection tracker for the given model.
     *
     * @param model the {@link GModel} instance being edited
     */
    public void initialize(final GModel model) {
        trackNodes(model);
        trackConnectionsAndJoints(model);
        trackTexts(model);
        trackGroups(model);
    }

    /**
     * Gets the observable list of selected nodes.
     *
     * @return the list of selected nodes
     */
    public ObservableList<GNode> getSelectedNodes() {
        return selectedNodes;
    }

    public ObservableList<GText> getSelectedTexts() {
        return selectedTexts;
    }

    public ObservableList<GGroup> getSelectedGroups() {
        return selectedGroups;
    }

    /**
     * Gets the observable list of selected connections.
     *
     * @return the list of selected connections
     */
    public ObservableList<GConnection> getSelectedConnections() {
        return selectedConnections;
    }

    /**
     * Gets the observable list of selected joints.
     *
     * @return the list of selected joints
     */
    public ObservableList<GJoint> getSelectedJoints() {
        return selectedJoints;
    }

    /**
     * Creates listeners to keep track of selected nodes.
     *
     * @param model the {@link GModel} instance being edited
     */
    private void trackNodes(final GModel model) {

        selectedNodes.clear();

        for (final GNode node : model.getNodes()) {

            final GNodeSkin nodeSkin = skinLookup.lookupNode(node);

            if (nodeSkin.isSelected()) {
                selectedNodes.add(node);
            }

            nodeSkin.selectedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue && !selectedNodes.contains(node)) {
                    selectedNodes.add(node);
                } else if (!newValue && selectedNodes.contains(node)) {
                    selectedNodes.remove(node);
                }
            });
        }
    }

    private void trackTexts(final GModel model) {

        selectedTexts.clear();

        for (final GText text : model.getTexts()) {

            final GTextSkin textSkin = skinLookup.lookupText(text);

            if (textSkin.isSelected()) {
                selectedTexts.add(text);
            }

            textSkin.selectedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue && !selectedTexts.contains(text)) {
                    selectedTexts.add(text);
                } else if (!newValue && selectedTexts.contains(text)) {
                    selectedTexts.remove(text);
                }
            });
        }
    }

    private void trackGroups(final GModel model) {

        selectedTexts.clear();

        for (final GGroup group : model.getGroups()) {

            final GGroupSkin groupSkin = skinLookup.lookupGroup(group);

            if (groupSkin.isSelected()) {
                selectedGroups.add(group);
            }

            groupSkin.selectedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue && !selectedGroups.contains(group)) {
                    selectedGroups.add(group);
                } else if (!newValue && selectedGroups.contains(group)) {
                    selectedGroups.remove(group);
                }
            });
        }
    }

    /**
     * Creates listeners to keep track of selected connections and joints.
     *
     * @param model the {@link GModel} instance being edited
     */
    private void trackConnectionsAndJoints(final GModel model) {

        selectedConnections.clear();
        selectedJoints.clear();

        for (final GConnection connection : model.getConnections()) {

            final GConnectionSkin connectionSkin = skinLookup.lookupConnection(connection);

            if (connectionSkin.isSelected()) {
                selectedConnections.add(connection);
            }

            connectionSkin.selectedProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue && !selectedConnections.contains(connection)) {
                    selectedConnections.add(connection);
                } else if (!newValue && selectedConnections.contains(connection)) {
                    selectedConnections.remove(connection);
                }
            });

            for (final GJoint joint : connection.getJoints()) {

                final GJointSkin jointSkin = skinLookup.lookupJoint(joint);

                if (jointSkin.isSelected()) {
                    selectedJoints.add(joint);
                }

                jointSkin.selectedProperty().addListener((observable, oldValue, newValue) -> {
                    if (newValue && !selectedJoints.contains(joint)) {
                        selectedJoints.add(joint);
                    } else if (!newValue && selectedJoints.contains(joint)) {
                        selectedJoints.remove(joint);
                    }
                });
            }
        }
    }
}
