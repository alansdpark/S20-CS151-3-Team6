package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;
import edu.sjsu.cs.tinnitus.view.frames.util.AlertBox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Controller for the Log in of a Patient
 */
public class LogInController implements Controller {


    /**
     * Creates a LogInController Object
     * @param logInView - view for the log in screen
     * @param clinicController - clinicController
     */
    public LogInController(LogInView logInView, ClinicController clinicController) {
        this.logInView = logInView;
        this.clinicController = clinicController;
        initController();
        clinicController.setHeaderContent("Log In");
    }

    /**
     * Constructs a Log In Controller with a patient already set
     * @param logInView - log in view
     * @param patient - patient to log in
     * @param clinicController - clinic controller
     */
    public LogInController(LogInView logInView, Patient patient, ClinicController clinicController) {
        this.logInView = logInView;
        this.patient = patient;
        this.clinicController = clinicController;
        initController();
        setPatientInfo();
        clinicController.setHeaderContent("Log In");
    }

    /**
     * Sets Action Listeners in the LogInView
     */
    @Override
    public void initController() {
        logInView.getSaveButton().addActionListener(e -> {
            save();
        });

        logInView.getBackButton().addActionListener(e ->{
            back();
        });
    }

    public void setPatientInfo(){
        logInView.getPatientIdField().setText(patient.getPatientId().toString());
        logInView.getPatientIdField().setEditable(false);
    }

    /**
     * Saves information and creates a Visit
     * Switches Control to VisitController
     */
    public void save(){
        JFrame frame = clinicController.getFrame();
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
                    new VisitController(visit, visitView, clinicController);
            frame.add(visitView.getPanel(), BorderLayout.CENTER);
            frame.validate();
            frame.repaint();
        }
    }

    /**
     * Switches control to Navigation Controller without saving anything
     */
    public void back(){
        JFrame frame = clinicController.getFrame();
        frame.remove(logInView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, clinicController);
        frame.add(navigationView.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();
    }

    /**
     * Creates a visit from the patient Id Field and current date field
     * @return - returns the visit that is creates. Returns null if visit was not able to be
     *  created
     */
    public Visit createVisit(){
        Visit visit = null;
        int patientId = -1;
        if(logInView.getPatientIdField().getText().length() != 0){
            patientId = Integer.parseInt(logInView.getPatientIdField().getText());
        }

        String date = logInView.getCurrentDateField().getText();
        Patient patient = clinicController.getPatientTable().findPatient(patientId);

        if(patient != null){
            visit = new Visit(patient, date);
        }
        visit.setVisitNumber(patient.getVisitList().size());
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
     * Getter for logInView
     *
     * @return logInView
     */
    public LogInView getLogInView() {
        return logInView;
    }

    /**
     * Setter for logInView
     *
     * @param logInView - logInView
     */
    public void setLogInView(LogInView logInView) {
        this.logInView = logInView;
    }

    /**
     * Getter for patient
     *
     * @return patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Setter for patient
     *
     * @param patient - patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Getter for clinicController
     *
     * @return clinicController
     */
    public ClinicController getClinicController() {
        return clinicController;
    }

    /**
     * Setter for clinicController
     *
     * @param clinicController - clinicController
     */
    public void setClinicController(ClinicController clinicController) {
        this.clinicController = clinicController;
    }

    /**
     * Getter for visit
     *
     * @return visit
     */
    public Visit getVisit() {
        return visit;
    }

    /**
     * Setter for visit
     *
     * @param visit - visit
     */
    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    private LogInView logInView;
    private Patient patient;
    private ClinicController clinicController;
    private Visit visit;
}
