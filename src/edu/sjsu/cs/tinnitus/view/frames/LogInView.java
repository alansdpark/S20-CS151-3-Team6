package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;

public class LogInView {

    /**
     * Constructor for log in view
     */
    public LogInView() {
        setLayout(new BorderLayout);
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new GridLayout(0,2));

        //patient ID
        eastPanel.add(patientIdLabel);
        eastPanel.add(patientIdField);
        //Current Date for visit
        eastPanel.add(currentDateLabel);
        eastPanel.add(currentDateField);
        //Buttons
        add(saveButton, BorderLayout.SOUTH);
        add(cancelButton, BorderLayout.SOUTH);
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
     * Setter for save button action listener
     * @param listener
     */
    public void setSaveButtonAction(ActionListener listener) {
        saveButton.setActionListener(listener);
    }

    /**
     * Setter for cancel button action listener
     * @param listener
     */
    public void setCancelButton(ActionListener listener) {
        cancelButton.setActionListener(listener);
    }

    private JLabel patientIdLabel;
    private JLabel currentDateLabel;

    private JTextField patientIdField;
    private JTextField currentDateField;

    private JButton saveButton;
    private JButton cancelButton;
}
