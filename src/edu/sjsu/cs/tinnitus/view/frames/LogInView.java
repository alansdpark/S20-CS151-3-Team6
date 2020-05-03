package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;
import java.awt.*;

/**
 * This class allows for the user to view the GUI for logging in a patient
 */
public class LogInView {

	/**
	 * Default Constructor
	 */
    public LogInView() {
        initComponents();
        addComponents();
        panel.setVisible(true);
    }

    /**
     * Getter for patientIdLabel
     *
     * @return patientIdLabel
     */
    public JLabel getPatientIdLabel() {
        return patientIdLabel;
    }

    /**
     * Setter for patientIdLabel
     *
     * @param patientIdLabel - patientIdLabel
     */
    public void setPatientIdLabel(JLabel patientIdLabel) {
        this.patientIdLabel = patientIdLabel;
    }

    /**
     * Getter for currentDateLabel
     *
     * @return currentDateLabel
     */
    public JLabel getCurrentDateLabel() {
        return currentDateLabel;
    }

    /**
     * Setter for currentDateLabel
     *
     * @param currentDateLabel - currentDateLabel
     */
    public void setCurrentDateLabel(JLabel currentDateLabel) {
        this.currentDateLabel = currentDateLabel;
    }

    /**
     * Getter for patientIdField
     *
     * @return patientIdField
     */
    public JTextField getPatientIdField() {
        return patientIdField;
    }

    /**
     * Setter for patientIdField
     *
     * @param patientIdField - patientIdField
     */
    public void setPatientIdField(JTextField patientIdField) {
        this.patientIdField = patientIdField;
    }

    /**
     * Getter for currentDateField
     *
     * @return currentDateField
     */
    public JTextField getCurrentDateField() {
        return currentDateField;
    }

    /**
     * Setter for currentDateField
     *
     * @param currentDateField - currentDateField
     */
    public void setCurrentDateField(JTextField currentDateField) {
        this.currentDateField = currentDateField;
    }

    /**
     * Getter for saveButton
     *
     * @return saveButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }

    /**
     * Setter for saveButton
     *
     * @param saveButton - saveButton
     */
    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
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

    private void initComponents(){
        patientIdLabel = new JLabel("Patient ID No.", SwingConstants.RIGHT);
        currentDateLabel = new JLabel("Current Date", SwingConstants.RIGHT);

        patientIdField = new JTextField(10);
        currentDateField = new JTextField(10);

        saveButton = new JButton("Save");
        backButton = new JButton("Back");
        panel = new JPanel();
    }

    private void addComponents(){
        JPanel infoPanel = new JPanel(new GridLayout(0,2, 10,10));

        infoPanel.add(patientIdLabel);
        infoPanel.add(patientIdField);
        infoPanel.add(currentDateLabel);
        infoPanel.add(currentDateField);

        infoPanel.add(backButton);
        infoPanel.add(saveButton);


        panel.add(infoPanel);
    }

    private JLabel patientIdLabel;
    private JLabel currentDateLabel;

    private JTextField patientIdField;
    private JTextField currentDateField;

    private JButton saveButton;
    private JButton backButton;
    private JPanel panel;
}
