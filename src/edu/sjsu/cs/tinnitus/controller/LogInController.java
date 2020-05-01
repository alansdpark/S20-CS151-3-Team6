package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;

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
    public LogInController(LogInView logInView, PatientTable patientTable, JFrame frame) {
        this.logInView = logInView;
        this.patientTable = patientTable;
        this.frame = frame;
        initController();
    }

    @Override
    public void initController() {
        logInView.getSaveButton().addActionListener(e -> {
            save();
        });
    }

    public void save(){
        //TODO create visit
        Visit visit = createVisit();
        frame.remove(logInView.getPanel());
        VisitView visitView = new VisitView();
        VisitController visitController =
                new VisitController(visit, visitView, frame, patientTable);
        frame.add(visitView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public Visit createVisit(){
        int patientId = Integer.parseInt(logInView.getPatientIdField().getText());
        String date = logInView.getCurrentDateField().getText();
        //TODO VALIDATE INPUTS

        Patient patient = patientTable.findPatient(patientId);
        Visit visit = new Visit(patient, date);
        return visit;
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
    private JFrame frame;
}
