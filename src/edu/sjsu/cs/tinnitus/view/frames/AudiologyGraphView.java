package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

/**
 * View for Audiology Graph.
 */
public class AudiologyGraphView {

	/**
	 * Constructor
	 */
    public AudiologyGraphView() {
        initComponents();
        addComponents();
        panel.setVisible(true);

    }

    /**
     * Initiates all part of this JPanel.
     */
    public void initComponents(){
        panel = new JPanel(new BorderLayout());
        audiologyGraph = new AudiologyGraph();
        backButton = new JButton("Back");
        key = new JPanel(new GridLayout(5, 1, 10, 10));
        rightLabel = new JLabel("Right Ear: BLUE");
        leftLabel = new JLabel("Left Ear: GREEN");



    }

    /**
     * Adds all J components to view panel.
     */
    public void addComponents(){
        panel.add(audiologyGraph, BorderLayout.CENTER);
        key.add(new JLabel("KEY"));
        key.add(rightLabel);
        key.add(leftLabel);
        panel.add(key, BorderLayout.EAST);
        panel.add(backButton, BorderLayout.SOUTH);
    }


    /**
     * Getter for audiologyGraph
     *
     * @return audiologyGraph
     */
    public AudiologyGraph getAudiologyGraph() {
        return audiologyGraph;
    }

    /**
     * Setter for audiologyGraph
     *
     * @param audiologyGraph - audiologyGraph
     */
    public void setAudiologyGraph(AudiologyGraph audiologyGraph) {
        this.audiologyGraph = audiologyGraph;
    }

    /**
     * Getter for panel
     *
     * @return panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * Setter for panel
     *
     * @param panel - panel
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
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
     * Getter for key
     *
     * @return key
     */
    public JPanel getKey() {
        return key;
    }

    /**
     * Setter for key
     *
     * @param key - key
     */
    public void setKey(JPanel key) {
        this.key = key;
    }

    /**
     * Getter for rightLabel
     *
     * @return rightLabel
     */
    public JLabel getRightLabel() {
        return rightLabel;
    }

    /**
     * Setter for rightLabel
     *
     * @param rightLabel - rightLabel
     */
    public void setRightLabel(JLabel rightLabel) {
        this.rightLabel = rightLabel;
    }

    /**
     * Getter for leftLabel
     *
     * @return leftLabel
     */
    public JLabel getLeftLabel() {
        return leftLabel;
    }

    /**
     * Setter for leftLabel
     *
     * @param leftLabel - leftLabel
     */
    public void setLeftLabel(JLabel leftLabel) {
        this.leftLabel = leftLabel;
    }

    private AudiologyGraph audiologyGraph;
    private JPanel panel;
    private JButton backButton;
    private JPanel key;
    private JLabel rightLabel;
    private JLabel leftLabel;
}
