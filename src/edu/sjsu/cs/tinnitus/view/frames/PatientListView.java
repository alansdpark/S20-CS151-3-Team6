package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;

/**
 * This class allows the user to view the list of patients controlled by PatientListController
 */
public class PatientListView {


    /**
     * Creates the Patient List View and
     * constructs all GUI objects and places them
     */
    public PatientListView() {
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
     * Getter for patientTable
     *
     * @return patientTable
     */
    public JTable getPatientTable() {
        return patientTable;
    }

    /**
     * Setter for patientTable
     *
     * @param patientTable - patientTable
     */
    public void setPatientTable(JTable patientTable) {
        this.patientTable = patientTable;
    }

    private JButton saveButton;
    private JTable patientTable;
}
