/*
 * Copyright (C) 2005 - 2014 by TESIS DYNAware GmbH
 */
package de.tesis.dynaware.grapheditor;

import java.util.List;

import javafx.geometry.Point2D;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.utils.ResizableBox;
import javafx.scene.paint.Color;

/**
 * The skin class for a {@link GNode}. Responsible for visualizing nodes in the graph editor.
 *
 * <p>
 * A custom node skin must extend this class. It <b>must</b> also provide a constructor taking exactly one {@link GNode}
 * parameter.
 * </p>
 *
 * <p>
 * The node skin is responsible for adding its connectors to the scene graph and laying them out.
 * </p>
 *
 * <p>
 * The root JavaFX node of this skin is a {@link ResizableBox}.
 * </p>
 */
public abstract class GNodeSkin extends GSkin {

    private final GNode node;

    private final ResizableBox root = new ResizableBox() {

        @Override
        protected void layoutChildren() {
            super.layoutChildren();
            GNodeSkin.this.layoutConnectors();
        }
    };

    /**
     * Creates a new {@link GNodeSkin}.
     *
     * @param node the {@link GNode} represented by the skin
     */
    public GNodeSkin(final GNode node) {
        this.node = node;
    }

    public void setColor(Color color) {

    }

    /**
     * Gets the node model element represented by the skin.
     *
     * @return the {@link GNode} represented by the skin
     */
    public GNode getNode() {
        return node;
    }

    /**
     * Gets the root JavaFX node of the skin.
     *
     * @return a {@link ResizableBox} containing the skin's root JavaFX node
     */
    @Override
    public ResizableBox getRoot() {
        return root;
    }

    /**
     * Initializes the node skin.
     *
     * <p>
     * The skin's layout values, e.g. its x and y position, are loaded from the {@link GNode} at this point.
     * </p>
     */
    public void initialize() {

        getRoot().setLayoutX(getNode().getX());
        getRoot().setLayoutY(getNode().getY());

        getRoot().resize(getNode().getWidth(), getNode().getHeight());
    }

    /**
     * Sets the node's connector skins.
     *
     * <p>
     * This will be called as the node is created, or if a connector is added or removed. The connector skin's regions
     * should be added to the scene graph.
     * </p>
     *
     * @param connectorSkins a list of {@link GConnectorSkin} objects for each of the node's connectors
     */
    public abstract void setConnectorSkins(List<GConnectorSkin> connectorSkins);

    /**
     * Lays out the node's connectors.
     */
    public abstract void layoutConnectors();

    /**
     * Gets the position of the <b>center</b> of a connector relative to the node region.
     *
     * <p>
     * This will be the point where a connection will attach to.
     * </p>
     *
     * @param connectorSkin a {@link GConnectorSkin} instance
     *
     * @return the x and y coordinates of the connector
     */
    public abstract Point2D getConnectorPosition(GConnectorSkin connectorSkin);
}
