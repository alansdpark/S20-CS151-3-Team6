package edu.sjsu.cs.tinnitus.view.frames.extras;

import javax.swing.*;
import java.awt.*;

/**
 * Class represents a datapoint on an audiological graph. This is a circular point that is not filled
 * with any color
 */
public class GraphDataPoint implements Icon {


    /**
     * Constructs a GraphDataPoint object
     * @param x - x pos
     * @param y - y pos
     * @param width - width of icon
     * @param height - height of icon
     */
    public GraphDataPoint(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    private int x;
    private int y;
    private int width;
    private int height;
}
