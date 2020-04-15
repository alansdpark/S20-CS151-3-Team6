package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;

public class PatientListController implements Controller {


    /**
     * Constructs a patient list controller
     * @param system - System where patient list is stored
     * @param patientListView - View for the patient list
     */
    public PatientListController(System system, PatientListView patientListView) {
        this.system = system;
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

    private System system;
    private PatientListView patientListView;
}
