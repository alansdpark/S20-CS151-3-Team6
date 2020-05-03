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
                                    JFrame frame, Visit visit, PatientTable patientTable) {
        this.medicalHistoryView = medicalHistoryView;
        this.medicalHistory = medicalHistory;
        this.frame = frame;
        this.visit = visit;
        this.patientTable = patientTable;
        this.patient = null;
        initController();

    }

    public MedicalHistoryController(MedicalHistoryView medicalHistoryView, MedicalHistory medicalHistory,
                                    JFrame frame, Patient patient,PatientTable patientTable) {
        this.medicalHistoryView = medicalHistoryView;
        this.medicalHistory = medicalHistory;
        this.frame = frame;
        this.visit = null;
        this.patient = patient;
        this.patientTable = patientTable;
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
        frame.remove(medicalHistoryView.getPanel());
        PatientView view = new PatientView();
        PatientController patientController = new PatientController(patient, view, frame, patientTable);
        frame.add(view.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void returnToVisit(){
        frame.remove(medicalHistoryView.getPanel());
        VisitView view = new VisitView();
        VisitController visitController = new VisitController(visit, view, frame, patientTable);
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
    private PatientTable patientTable;
    private JFrame frame;
    private Visit visit;
    private Patient patient;
}
