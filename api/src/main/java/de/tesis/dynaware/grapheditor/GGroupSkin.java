/*
 * Copyright (C) 2005 - 2014 by TESIS DYNAware GmbH
 */
package de.tesis.dynaware.grapheditor;

import de.tesis.dynaware.grapheditor.model.GGroup;
import de.tesis.dynaware.grapheditor.model.GGroup;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.utils.ResizableBox;
import javafx.geometry.Point2D;

import java.util.List;

/**
 * The skin class for a {@link GGroup}. Responsible for visualizing nodes in the graph editor.
 *
 * <p>
 * A custom node skin must extend this class. It <b>must</b> also provide a constructor taking exactly one {@link GGroup}
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
public abstract class GGroupSkin extends GSkin {

    private final GGroup group;

    private boolean visible = true;

    private final ResizableBox root = new ResizableBox() {

        @Override
        protected void layoutChildren() {
            super.layoutChildren();
            GGroupSkin.this.layoutConnectors();
        }
    };

    /**
     * Creates a new {@link GGroupSkin}.
     *
     * @param group the {@link GGroup} represented by the skin
     */
    public GGroupSkin(final GGroup group) {
        this.group = group;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setText() {

    }

    public void setColor() {

    }

    /**
     * Gets the node model element represented by the skin.
     *
     * @return the {@link GGroup} represented by the skin
     */
    public GGroup getGroup() {
        return group;
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
     * The skin's layout values, e.g. its x and y position, are loaded from the {@link GGroup} at this point.
     * </p>
     */
    public void initialize() {

        getRoot().setLayoutX(getGroup().getX());
        getRoot().setLayoutY(getGroup().getY());

        getRoot().resize(getGroup().getWidth(), getGroup().getHeight());
    }


    public abstract void layoutConnectors();

    public abstract List<GNodeSkin> getChildren();

    public abstract void addChild(GNode node);

    public abstract void removeChild(GNode node);
}
