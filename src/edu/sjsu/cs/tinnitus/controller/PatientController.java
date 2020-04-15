package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.PatientView;

/**
 * Controller that communicates with Patient and PatientView
 */
public class PatientController implements Controller
{
    /**
     * Default Constructor for Patient Controller
     */
    public PatientController()
    {

    }

    /**
     * Constructor for Patient Controller
     * @param patient - patient model
     * @param patientView - patient view
     */
    public PatientController(Patient patient, PatientView patientView) {
        this.patient = patient;
        this.patientView = patientView;
    }


    /**
     * Saves any edits made in the textFields to the patient
     */
    public void saveEdits()
    {

    }

    /**
     * Logs a new visit.
     */
    public void logVisit()
    {

    }

    /**
     * Opens frame to selected Visit
     * @param visit - visit to be edited
     */
    public void editVisit(Visit visit){}


    @Override
    public void initController() {

    }

    private Patient patient;
    private PatientView patientView;


}