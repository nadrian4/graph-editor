package de.tesis.dynaware.grapheditor;

import de.tesis.dynaware.grapheditor.model.GText;
import de.tesis.dynaware.grapheditor.utils.ResizableBox;

public abstract class GTextSkin extends GSkin {

    private final GText text;

    private boolean visible = true;

    private final ResizableBox root = new ResizableBox() {
        @Override
        protected void layoutChildren() {
            super.layoutChildren();
            layoutElements();
        }
    };

    @Override
    public ResizableBox getRoot() {
        return root;
    }

    public void setText() {

    }


    public GTextSkin(final GText text) {
        this.text = text;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    public GText getText() {
        return text;
    }

    public void initialize() {

        getRoot().setLayoutX(getText().getX());
        getRoot().setLayoutY(getText().getY());

        getRoot().resize(getText().getWidth(), getText().getHeight());
    }

    public abstract void layoutElements();
}