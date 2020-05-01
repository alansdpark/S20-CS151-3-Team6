package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;

import javax.swing.*;

public class MedicalHistoryController implements Controller {


    /**
     * Constructor for a controller
     * @param medicalHistoryView - view that is being controlled
     * @param medicalHistory - model
     */
    public MedicalHistoryController(MedicalHistoryView medicalHistoryView, MedicalHistory medicalHistory, JFrame frame) {
        this.medicalHistoryView = medicalHistoryView;
        this.medicalHistory = medicalHistory;
        this.frame = frame;
    }

    @Override
    public void initController() {

    }

    /**
     * adds a new medication to the model
     */
    public void addMedication(){}

    /**
     * Saves information in the textArea in View to the appropriate
     * field in the model. Then closes the panel
     */
    public void save(){

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

    private MedicalHistoryView medicalHistoryView;
    private MedicalHistory medicalHistory;
    private JFrame frame;
}
