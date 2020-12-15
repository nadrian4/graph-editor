package de.tesis.dynaware.grapheditor.core.skins.defaults;

import de.tesis.dynaware.grapheditor.GTextSkin;
import de.tesis.dynaware.grapheditor.model.GText;
import javafx.beans.property.SimpleStringProperty;
import javafx.css.PseudoClass;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class DefaultTextSkin extends GTextSkin {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultNodeSkin.class);

    //    private static final String STYLE_CLASS_BORDER = "default-node-border";
//    private static final String STYLE_CLASS_BACKGROUND = "default-node-background";
    private static final String STYLE_CLASS_SELECTION_HALO = "default-node-selection-halo";

    private static final PseudoClass PSEUDO_CLASS_SELECTED = PseudoClass.getPseudoClass("selected");

    private static final double HALO_OFFSET = 5;
    private static final double HALO_CORNER_SIZE = 10;

    private static final double MIN_WIDTH = 20;
    private static final double MIN_HEIGHT = 20;

    private final Rectangle selectionHalo = new Rectangle();


    // Border and background are separated into 2 rectangles so they can have different effects applied to them.
    private final Rectangle border = new Rectangle();
    private final Rectangle background = new Rectangle();
    private final Label label = new Label();


    public DefaultTextSkin(GText text) {
        super(text);

        background.widthProperty().bind(border.widthProperty().subtract(border.strokeWidthProperty().multiply(2)));
        background.heightProperty().bind(border.heightProperty().subtract(border.strokeWidthProperty().multiply(2)));

        border.widthProperty().bind(getRoot().widthProperty());
        border.heightProperty().bind(getRoot().heightProperty());

//        border.getStyleClass().setAll(STYLE_CLASS_BORDER);
//        background.getStyleClass().setAll(STYLE_CLASS_BACKGROUND);

//        border.setStroke(Color.rgb(0, 0, 0, 0.2));
        border.setStroke(Color.TRANSPARENT);
        border.setStyle("-fx-background-radius: 4");
        border.setFill(Color.TRANSPARENT);
        background.setFill(Color.TRANSPARENT);

        getRoot().getChildren().addAll(border, background, label);
        getRoot().setMinSize(MIN_WIDTH, MIN_HEIGHT);

        background.addEventFilter(MouseEvent.MOUSE_DRAGGED, this::filterMouseDragged);

        addSelectionHalo();
        addSelectionListener();
        setText();
    }

    @Override
    public void setText() {
        Font font = new Font("Times New Roman", 10);
        final Text text = new Text(Optional.ofNullable(getText().getText()).orElse(""));
        text.setFont(font);
        new Scene(new Group(text));
        text.applyCss();
        final double width = text.getLayoutBounds().getWidth();
        final double height = text.getLayoutBounds().getHeight();

        label.setMinWidth(width);
        label.setMaxWidth(width);
        label.setMinHeight(height);
        label.setMaxHeight(height);
        label.setFont(font);
        label.setTextAlignment(TextAlignment.CENTER);
        label.textProperty().bind(new SimpleStringProperty(Optional.ofNullable(getText().getText()).orElse("")));

        super.setText();
    }


    /**
     * Adds the selection halo and initializes some of its values.
     */
    private void addSelectionHalo() {

        getRoot().getChildren().add(selectionHalo);

        selectionHalo.setManaged(false);
        selectionHalo.setMouseTransparent(false);
        selectionHalo.setVisible(false);

        selectionHalo.setLayoutX(-HALO_OFFSET);
        selectionHalo.setLayoutY(-HALO_OFFSET);

        selectionHalo.getStyleClass().add(STYLE_CLASS_SELECTION_HALO);
    }

    @Override
    public void layoutElements() {
        layoutSelectionHalo();
    }

    /**
     * Lays out the selection halo based on the current width and height of the node skin region.
     */


    private void layoutSelectionHalo() {

        if (selectionHalo.isVisible()) {

            selectionHalo.setWidth(border.getWidth() + 2 * HALO_OFFSET);
            selectionHalo.setHeight(border.getHeight() + 2 * HALO_OFFSET);

            final double cornerLength = 2 * HALO_CORNER_SIZE;
            final double xGap = border.getWidth() - 2 * HALO_CORNER_SIZE + 2 * HALO_OFFSET;
            final double yGap = border.getHeight() - 2 * HALO_CORNER_SIZE + 2 * HALO_OFFSET;

            selectionHalo.setStrokeDashOffset(HALO_CORNER_SIZE);
            selectionHalo.getStrokeDashArray().setAll(cornerLength, yGap, cornerLength, xGap);
        }
    }

    /**
     * Adds a listener to react to whether the node is selected or not and change the CSS classes accordingly.
     */
    private void addSelectionListener() {

        selectedProperty().addListener((v, o, n) -> {

            if (n) {
                selectionHalo.setVisible(true);
                layoutSelectionHalo();
                background.pseudoClassStateChanged(PSEUDO_CLASS_SELECTED, true);
                getRoot().toFront();
            } else {
                selectionHalo.setVisible(false);
                background.pseudoClassStateChanged(PSEUDO_CLASS_SELECTED, false);
            }
        });
    }


    private void filterMouseDragged(final MouseEvent event) {
        if (event.isPrimaryButtonDown() && !isSelected()) {
            event.consume();
        }
    }
}