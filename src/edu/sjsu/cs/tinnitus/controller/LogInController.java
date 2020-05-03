package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;
import edu.sjsu.cs.tinnitus.view.frames.util.AlertBox;

import javax.swing.*;
import java.util.ArrayList;

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

        logInView.getBackButton().addActionListener(e ->{
            back();
        });
    }

    public void save(){
        Visit visit = createVisit();
        if(visit == null){
            // Create an Alert Box
            ArrayList<String> errMsgs = new ArrayList<>();
            errMsgs.add("Invalid Patient ID");
            AlertBox alertBox = new AlertBox(errMsgs);
        }
        else{
            frame.remove(logInView.getPanel());
            VisitView visitView = new VisitView();
            VisitController visitController =
                    new VisitController(visit, visitView, frame, patientTable);
            frame.add(visitView.getPanel());
            frame.validate();
            frame.repaint();
        }
    }

    public void back(){
        frame.remove(logInView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, frame, patientTable);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public Visit createVisit(){
        Visit visit = null;
        int patientId = -1;
        if(logInView.getPatientIdField().getText().length() != 0){
            patientId = Integer.parseInt(logInView.getPatientIdField().getText());
        }

        String date = logInView.getCurrentDateField().getText();
        Patient patient = patientTable.findPatient(patientId);

        if(patient != null){
            visit = new Visit(patient, date);
        }
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
