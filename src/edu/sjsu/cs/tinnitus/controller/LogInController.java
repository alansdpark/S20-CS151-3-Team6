package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;

public class LogInController implements Controller {


    /**
     * Creates a LogInController Object
     * @param logInView - view for the log in screen
     * @param system - system that stores the list of patients from which the
     *               patient id will be found
     */
    public LogInController(LogInView logInView, System system) {
        this.logInView = logInView;
        this.system = system;
    }

    @Override
    public void initController() {

    }

    /**
     * Searches system for the patient related to patientId
     * @param patientId - patientId to be found
     * @return returns true if the patient is found
     */
    public boolean retrievePatientFromSystem(String patientId){
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
    private System system;
    private Visit visit;
}
