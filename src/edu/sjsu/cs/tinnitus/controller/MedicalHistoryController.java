package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;
import edu.sjsu.cs.tinnitus.view.frames.PatientView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;

public class MedicalHistoryController implements Controller {


    /**
     * Constructor for a controller
     * @param medicalHistoryView - view that is being controlled
     * @param medicalHistory - model
     */
    public MedicalHistoryController(MedicalHistoryView medicalHistoryView, MedicalHistory medicalHistory,
                                     Visit visit, ClinicController clinicController) {
        this.medicalHistoryView = medicalHistoryView;
        this.medicalHistory = medicalHistory;
        this.visit = visit;
        this.patient = null;
        this.clinicController = clinicController;
        initController();

    }

    public MedicalHistoryController(MedicalHistoryView medicalHistoryView, MedicalHistory medicalHistory,
                                     Patient patient, ClinicController clinicController) {
        this.medicalHistoryView = medicalHistoryView;
        this.medicalHistory = medicalHistory;
        this.visit = null;
        this.patient = patient;
        this.clinicController = clinicController;
        initController();

    }

    @Override
    public void initController() {
        medicalHistoryView.getSaveButton().addActionListener(e-> {
            if(visit == null){
                returnToPatient();
            }
            else{
                returnToVisit();
            }
        });
        medicalHistoryView.getAddMedication().addActionListener(e->{
            addMedication();
        });
    }

    public void returnToPatient(){
        // TODO TESTING
        JFrame frame = clinicController.getFrame();
        frame.remove(medicalHistoryView.getPanel());
        PatientView view = new PatientView();
        PatientController patientController = new PatientController(patient, view, clinicController);
        frame.add(view.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void returnToVisit(){
        JFrame frame = clinicController.getFrame();
        frame.remove(medicalHistoryView.getPanel());
        VisitView view = new VisitView();
        VisitController visitController = new VisitController(visit, view, clinicController);
        frame.add(view.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * adds a new medication to the model
     */
    public void addMedication(){
        //TODO
    }

    /**
     * Save any updates to the medical information from textFields in View
     */
    public void updateMedication(){
        //TODO
    }

    /**
     * Getter for medicalHistoryView
     *
     * @return medicalHistoryView
     */
    public MedicalHistoryView getMedicalHistoryView() {
        return medicalHistoryView;
    }

    /**
     * Setter for medicalHistoryView
     *
     * @param medicalHistoryView - medicalHistoryView
     */
    public void setMedicalHistoryView(MedicalHistoryView medicalHistoryView) {
        this.medicalHistoryView = medicalHistoryView;
    }

    /**
     * Getter for medicalHistory
     *
     * @return medicalHistory
     */
    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * Setter for medicalHistory
     *
     * @param medicalHistory - medicalHistory
     */
    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
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

    private MedicalHistoryView medicalHistoryView;
    private MedicalHistory medicalHistory;
    private ClinicController clinicController;
    private Visit visit;
    private Patient patient;
}
