package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;

/**
 * Controller for the Log in of a Patient
 */
public class LogInController implements Controller {


    /**
     * Creates a LogInController Object
     * @param logInView - view for the log in screen
     * @param patientTable - patientTable that stores the list of patients from which the
     *               patient id will be found
     */
    public LogInController(LogInView logInView, PatientTable patientTable) {
        this.logInView = logInView;
        this.patientTable = patientTable;
    }

    @Override
    public void initController() {

    }

    /**
     * Searches patientTable for the patient related to patientId
     * @param patientId - patientId to be found
     * @return returns true if the patient is found
     */
    public boolean retrievePatientFromPatientTable(String patientId){
        return false;
    }

    /**
     * Creates a new Visit from patient and date, then proceeds to
     * VisitController
     */
    public void goToVisit(){

    }


    private LogInView logInView;
    private Patient patient;
    private PatientTable patientTable;
    private Visit visit;
}
