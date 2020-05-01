package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;

/**
 * Controller for Visit.
 */
public class VisitController implements Controller
{

    public VisitController(Visit visit, VisitView visitView, JFrame frame, PatientTable patientTable) {
        this.visit = visit;
        this.visitView = visitView;
        this.frame = frame;
        this.patientTable = patientTable;
        initController();
    }


    public void editMedicalHistory(){
        frame.remove(visitView.getPanel());
        MedicalHistoryView medicalHistoryView = new MedicalHistoryView();
        MedicalHistoryController medicalHistoryController =
                new MedicalHistoryController(medicalHistoryView, visit.getPatient().getMedicalHistory(), frame);
        frame.add(medicalHistoryView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void editAudiologicalEvaluation(){

    }

    public void save(){
        
    }

    public void notImplemented(){
        //TODO ADD AN ALERT BOX TO ALERT USER THIS BUTTON IS NOT IMPLEMENTED
    }

    @Override
    public void initController() {
        visitView.getSaveButton().addActionListener(e ->{
            save();
        });

        visitView.getAudiologicalEvaluationButton().addActionListener(e -> {
            editAudiologicalEvaluation();
        });

        visitView.getMedicalHistoryButton().addActionListener(e ->{
            editMedicalHistory();
        });

        visitView.getQuestionarreButton().addActionListener(e ->{
            notImplemented();
        });

        visitView.getRegisterTreatmentButton().addActionListener(e ->{
            notImplemented();
        });

        visitView.getTreatmentButton().addActionListener(e ->{
            notImplemented();
        });
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
     * Getter for visitView
     *
     * @return visitView
     */
    public VisitView getVisitView() {
        return visitView;
    }

    /**
     * Setter for visitView
     *
     * @param visitView - visitView
     */
    public void setVisitView(VisitView visitView) {
        this.visitView = visitView;
    }

    /**
     * Getter for frame
     *
     * @return frame
     */
    public JFrame getframe() {
        return frame;
    }

    /**
     * Setter for frame
     *
     * @param frame - frame
     */
    public void setframe(JFrame frame) {
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

    Visit visit;
    VisitView visitView;
    JFrame frame;
    PatientTable patientTable;
}