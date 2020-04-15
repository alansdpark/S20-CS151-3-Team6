package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;

public class LogInView {


    public LogInView() {
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

    private JLabel patientIdLabel;
    private JLabel currentDateLabel;

    private JTextField patientIdField;
    private JTextField currentDateField;
}
