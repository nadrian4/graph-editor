/*
 * Copyright (C) 2005 - 2014 by TESIS DYNAware GmbH
 */
package de.tesis.dynaware.grapheditor;

import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.window.AutoScrollingWindow;
import de.tesis.dynaware.grapheditor.window.GraphEditorMinimap;
import de.tesis.dynaware.grapheditor.window.NeighbourhoodContainer;
import javafx.beans.value.ChangeListener;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

/**
 * A container for the graph editor.
 *
 * <p>
 * This is intended for graphs that can be larger than the space available in the scene. The user can pan around by
 * right-clicking and dragging. A minimap can be shown to help with navigation.
 * </p>
 *
 * <p>
 * Example:
 *
 * <pre>
 * <code>GraphEditorContainer graphEditorContainer = new GraphEditorContainer();
 * GraphEditor graphEditor = new DefaultGraphEditor();
 *
 * graphEditorContainer.setGraphEditor(graphEditor);
 * graphEditorContainer.getMinimap().setVisible(true);</code>
 * </pre>
 * <p>
 * The graph editor container is a {@link Region} and can be added to the JavaFX scene graph in the usual way.
 * </p>
 *
 * <p>
 * When a {@link GraphEditor} is set inside this container, its view becomes <b>unmanaged</b> and its width and height
 * values are set to those in the {@link GModel} instance.
 * </p>
 */
public class GraphEditorContainer extends AutoScrollingWindow {

    // Minimap height is not specified here, the minimap's aspect ratio is fixed by the aspect ratio of the content.
    private static final double MINIMAP_WIDTH = 250;
    private static final double MINIMAP_RIGHT_INDENT = 10;
    private static final double MINIMAP_TOP_INDENT = 10;

    private static final double NEIGHBOURHOOD_CONTAINER_WIDTH = 300;
    private static final double NEIGHBOURHOOD_CONTAINER_RIGHT_INDENT = 400;
    private static final double NEIGHBOURHOOD_CONTAINER_TOP_INDENT = 400;

    private final GraphEditorMinimap minimap = new GraphEditorMinimap(MINIMAP_WIDTH);
    private final NeighbourhoodContainer neighbourhoodContainer = new NeighbourhoodContainer(NEIGHBOURHOOD_CONTAINER_WIDTH);

    private GraphEditor graphEditor;
    private ChangeListener<GModel> modelChangeListener;

    /**
     * Creates a new {@link GraphEditorContainer}.
     */
    public GraphEditorContainer() {
        initializeMinimap();
        createModelChangeListener();
    }

    /**
     * Sets the graph editor to be displayed in this container.
     *
     * @param graphEditor a {@link GraphEditor} instance
     */
    public void setGraphEditor(final GraphEditor graphEditor) {

        if (this.graphEditor != null) {
            this.graphEditor.modelProperty().removeListener(modelChangeListener);
            this.graphEditor.getView().setOnScroll(null);
        }

        this.graphEditor = graphEditor;

        if (graphEditor != null) {

            graphEditor.modelProperty().addListener(modelChangeListener);

            final Region view = graphEditor.getView();
            final GModel model = graphEditor.getModel();
            final SkinLookup skinLookup = graphEditor.getSkinLookup();

            if (model != null) {
                view.resize(model.getContentWidth(), model.getContentHeight());
            }

            setContent(view);
            minimap.setContent(view);
            minimap.setModel(model);
            minimap.setSkinLookup(skinLookup);

            neighbourhoodContainer.setContent(view);
            neighbourhoodContainer.setModel(model);
            neighbourhoodContainer.setSkinLookup(skinLookup);

            view.toBack();
//            sceneProperty().addListener((observable, oldValue, newValue) -> {
//                newValue.setOnScroll(event -> {
//                    if (!event.isControlDown()) {
//                        panBy(-event.getDeltaX(), -event.getDeltaY());
//                    }
//                });
//            });
            view.setOnScroll(event -> {
                if (!event.isControlDown()) {
                    panBy(-event.getDeltaX(), -event.getDeltaY());
                }
            });

        } else {
            minimap.setContent(null);
            minimap.setModel(null);
            neighbourhoodContainer.setContent(null);
            neighbourhoodContainer.setModel(null);
        }
    }

    /**
     * Gets the {@link Pane} representing the graph editor minimap.
     *
     * <p>
     * <b>Note:</b> customisation of the minimap's content and layout has not been extensively tested.
     * </p>
     * <p>
     * the graph editor minimap
     */
    public Pane getMinimap() {
        return minimap;
    }

    public Pane getNeighbourhoodContainer() {
        return neighbourhoodContainer;
    }

    /**
     * Initializes the minimap, adding it as a child of the container and setting its position.
     */
    private void initializeMinimap() {

        getChildren().add(minimap);

        minimap.setWindow(this);
        minimap.layoutXProperty().bind(widthProperty().subtract(MINIMAP_WIDTH + MINIMAP_RIGHT_INDENT));
        minimap.setLayoutY(MINIMAP_TOP_INDENT);
        minimap.setVisible(false);

        getChildren().add(neighbourhoodContainer);

        neighbourhoodContainer.setWindow(this);
        neighbourhoodContainer.layoutXProperty().bind(widthProperty().subtract(NEIGHBOURHOOD_CONTAINER_WIDTH + NEIGHBOURHOOD_CONTAINER_RIGHT_INDENT));
        neighbourhoodContainer.setLayoutY(NEIGHBOURHOOD_CONTAINER_TOP_INDENT);
        neighbourhoodContainer.setVisible(false);
    }

    /**
     * This listener updates the minimap with the new model each time one is set in the {@link GraphEditor} instance.
     */
    private void createModelChangeListener() {

        modelChangeListener = (ChangeListener<GModel>) (observable, oldValue, newValue) -> {
            if (newValue == null || (newValue != null && !newValue.equals(oldValue))) {
                graphEditor.getView().resize(newValue.getContentWidth(), newValue.getContentHeight());
                checkWindowBounds();
                minimap.setModel(newValue);
                neighbourhoodContainer.setModel(newValue);
            }
        };
    }
}
