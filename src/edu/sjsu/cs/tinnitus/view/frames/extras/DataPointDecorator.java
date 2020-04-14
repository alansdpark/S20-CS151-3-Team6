package edu.sjsu.cs.tinnitus.view.frames.extras;

import javax.swing.*;
import java.awt.*;

/**
 * Decorates a GraphDataPoint object with a color and a label
 */
public class DataPointDecorator implements Icon {
    /**
     * Constructor to create a DataPointDecorator
     * @param dataPoint - dataPoint to be decorated
     * @param color - color of the datapoint
     * @param label - label of the point
     */
    public DataPointDecorator(Icon dataPoint, Color color, String label) {
        this.dataPoint = dataPoint;
        this.color = color;
        this.label = label;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    private Icon dataPoint;
    private Color color;
    private String label;
}
