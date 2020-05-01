package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;

import javax.swing.*;

/**
 * Controller for communicating with PatientTable and PatientListView
 */
public class PatientListController implements Controller {


    /**
     * Constructs a patient list controller
     * @param patientTable - PatientTable where patient list is stored
     * @param patientListView - View for the patient list
     */
    public PatientListController(PatientTable patientTable, PatientListView patientListView, JFrame frame) {
        this.patientTable = patientTable;
        this.patientListView = patientListView;
        this.frame = frame;
    }

    @Override
    public void initController() {

    }

    /**
     * returns to the navigation page
     */
    private void save(){

    }

    /**
     * Proceeds to go to the Patient Info page of the patient
     * @param patient - patient whose page will be displayed
     */
    private void goToPatient(Patient patient){

    }

    /**
     * Getter for patientTable
     *
     * @return patientTable
     */
    public PatientTable getPatientTable() {
        return patientTable;
    }

    /**
     * Setter for patientTable
     *
     * @param patientTable - patientTable
     */
    public void setPatientTable(PatientTable patientTable) {
        this.patientTable = patientTable;
    }

    /**
     * Getter for patientListView
     *
     * @return patientListView
     */
    public PatientListView getPatientListView() {
        return patientListView;
    }

    /**
     * Setter for patientListView
     *
     * @param patientListView - patientListView
     */
    public void setPatientListView(PatientListView patientListView) {
        this.patientListView = patientListView;
    }

    /**
     * Getter for frame
     *
     * @return frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Setter for frame
     *
     * @param frame - frame
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    private PatientTable patientTable;
    private PatientListView patientListView;
    JFrame frame;
}
