package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Audiology graph.
 */
public class AudiologyGraph extends JPanel {

	/**
	 * Audiology Graph Controller
	 */
    public void AudiologyGraph(){
        backButton = new JButton("Back");
        leftEar = new ArrayList<>();
        rightEar = new ArrayList<>();
        setLayout(new BorderLayout());
        add(backButton, BorderLayout.NORTH);
        setVisible(true);
    }

    /**
     * Getter for backButton
     *
     * @return backButton
     */
    public JButton getBackButton() {
        return backButton;
    }

    /**
     * Setter for backButton
     *
     * @param backButton - backButton
     */
    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    /**
     * Getter for rightEar
     *
     * @return rightEar
     */
    public ArrayList<Point> getRightEar() {
        return rightEar;
    }

    /**
     * Setter for rightEar
     *
     * @param rightEar - rightEar
     */
    public void setRightEar(ArrayList<Point> rightEar) {
        this.rightEar = rightEar;
    }

    /**
     * Getter for leftEar
     *
     * @return leftEar
     */
    public ArrayList<Point> getLeftEar() {
        return leftEar;
    }

    /**
     * Setter for leftEar
     *
     * @param leftEar - leftEar
     */
    public void setLeftEar(ArrayList<Point> leftEar) {
        this.leftEar = leftEar;
    }

    @Override
    protected void paintComponent(Graphics g) {
        leftEar = convertArrayScale(leftEar);
        rightEar = convertArrayScale(rightEar);

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // create x and y axes
        g2.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, BORDER_GAP, BORDER_GAP);
        g2.drawLine(BORDER_GAP, BORDER_GAP, getWidth() - BORDER_GAP,  BORDER_GAP);

        // create hatch marks for y axis.
        for (int i = 0; i < Y_HATCH_CNT; i++) {
            int x0 = BORDER_GAP;
            int x1 = GRAPH_POINT_WIDTH + BORDER_GAP;
            int y0 =(((i + 1) * (getHeight() - BORDER_GAP * 2)) / Y_HATCH_CNT + BORDER_GAP);
            int y1 = y0;
            g2.drawLine(x0, y0, x1, y1);
            g2.drawString((i + 1) * 10 + " dB", x0 - BORDER_GAP, y0);
        }

        // and for x axis
        for (int i = 0; i < X_HATCH_CNT; i++) {
            int x0 = (i + 1) * (getWidth() - BORDER_GAP * 2) / X_HATCH_CNT + BORDER_GAP;
            int x1 = x0;
            int y0 =  BORDER_GAP;
            int y1 = y0 + GRAPH_POINT_WIDTH;
            g2.drawLine(x0, y0, x1, y1);
            g2.drawString((i+1)*1000 + "Hz", x0 - BORDER_GAP , y0);
        }
        printLine(leftEar, g2, true);
        printLine(rightEar, g2, false);
    }

    /**
     * Prints a line for either leftEar or Right Ear
     * @param graphPoints - data for the location of the points
     * @param g2 - graphics
     * @param isLeft - boolean for either left or right ear data
     */
    public void printLine(ArrayList<Point> graphPoints, Graphics2D g2, boolean isLeft){
        Color graphColor = Color.BLACK;
        if(isLeft) {
            graphColor = LEFT_COLOR;
        }else{
            graphColor = RIGHT_COLOR;
        }
        Stroke oldStroke = g2.getStroke();
        g2.setStroke(GRAPH_STROKE);
        g2.setColor(graphColor);

        for (int i = 0; i < graphPoints.size() - 1; i++) {
            int x1 = graphPoints.get(i).x;
            int y1 = graphPoints.get(i).y;
            int x2 = graphPoints.get(i + 1).x;
            int y2 = graphPoints.get(i + 1).y;
            g2.drawLine(x1, y1, x2, y2);
        }

        g2.setStroke(oldStroke);
        g2.setColor(graphColor);
        for (int i = 0; i < graphPoints.size(); i++) {
            int x = graphPoints.get(i).x - GRAPH_POINT_WIDTH / 2;
            int y = graphPoints.get(i).y - GRAPH_POINT_WIDTH / 2;;
            int ovalW = GRAPH_POINT_WIDTH;
            int ovalH = GRAPH_POINT_WIDTH;
            g2.fillOval(x, y, ovalW, ovalH);
        }
    }

    /**
     * Converts the scale to fit on the graph
     * @param arr - arraylist of data points to scale
     * @return - correctly scaled arrayList
     */
    public ArrayList<Point> convertArrayScale(ArrayList<Point> arr){
        ArrayList<Point> arrToReturn = new ArrayList<>();
        int width = getWidth() - 2 * BORDER_GAP;
        int height = getHeight() - 2 * BORDER_GAP;

        double xScale = (double)width / (double)MAX_HZ;
        double yScale = (double)height / (double)MAX_DB;
        for(Point point : arr){
            double x = point.getX();
            double y = point.getY();

            Point p = new Point((int)(BORDER_GAP + (x * xScale)), (BORDER_GAP +(int)(y * yScale)));
            arrToReturn.add(p);

        }
        return arrToReturn;
    }

    /**
     * Getter for MAX_DB
     *
     * @return MAX_DB
     */
    public static int getMaxDb() {
        return MAX_DB;
    }

    /**
     * Getter for MAX_HZ
     *
     * @return MAX_HZ
     */
    public static int getMaxHz() {
        return MAX_HZ;
    }

    /**
     * Getter for X_HATCH_CNT
     *
     * @return X_HATCH_CNT
     */
    public static int getxHatchCnt() {
        return X_HATCH_CNT;
    }

    /**
     * Getter for BORDER_GAP
     *
     * @return BORDER_GAP
     */
    public static int getBorderGap() {
        return BORDER_GAP;
    }

    /**
     * Getter for LEFT_COLOR
     *
     * @return LEFT_COLOR
     */
    public static Color getLeftColor() {
        return LEFT_COLOR;
    }

    /**
     * Getter for RIGHT_COLOR
     *
     * @return RIGHT_COLOR
     */
    public static Color getRightColor() {
        return RIGHT_COLOR;
    }

    /**
     * Getter for GRAPH_STROKE
     *
     * @return GRAPH_STROKE
     */
    public static Stroke getGraphStroke() {
        return GRAPH_STROKE;
    }

    /**
     * Getter for GRAPH_POINT_WIDTH
     *
     * @return GRAPH_POINT_WIDTH
     */
    public static int getGraphPointWidth() {
        return GRAPH_POINT_WIDTH;
    }

    /**
     * Getter for Y_HATCH_CNT
     *
     * @return Y_HATCH_CNT
     */
    public static int getyHatchCnt() {
        return Y_HATCH_CNT;
    }

    private JButton backButton;
    private static final int MAX_DB = 120;
    private static final int MAX_HZ = 12000;
    private static final int BORDER_GAP = 30;
    private static final Color LEFT_COLOR = Color.GREEN;
    private static final Color RIGHT_COLOR = Color.BLUE;
    private static final Stroke GRAPH_STROKE = new BasicStroke(3f);
    private static final int GRAPH_POINT_WIDTH = 12;
    private static final int Y_HATCH_CNT = 12;
    private static final int X_HATCH_CNT = 12;
    private ArrayList<Point> rightEar;
    private ArrayList<Point> leftEar;
}
