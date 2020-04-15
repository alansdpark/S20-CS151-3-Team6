package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;

public class PatientListController implements Controller {


    /**
     * Constructs a patient list controller
     * @param patientTable - PatientTable where patient list is stored
     * @param patientListView - View for the patient list
     */
    public PatientListController(PatientTable patientTable, PatientListView patientListView) {
        this.patientTable = patientTable;
        this.patientListView = patientListView;
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

    private PatientTable patientTable;
    private PatientListView patientListView;
}
