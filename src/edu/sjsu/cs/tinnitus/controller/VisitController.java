package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;
import edu.sjsu.cs.tinnitus.view.frames.util.AlertBox;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Controller for Visit.
 */
public class VisitController implements Controller
{

    public VisitController(Visit visit, VisitView visitView, ClinicController clinicController) {
        this.visit = visit;
        this.visitView = visitView;
        this.clinicController = clinicController;
        initController();
    }


    public void editMedicalHistory(){
        JFrame frame = clinicController.getFrame();
        frame.remove(visitView.getPanel());
        MedicalHistoryView medicalHistoryView = new MedicalHistoryView();
        MedicalHistoryController medicalHistoryController =
                new MedicalHistoryController(medicalHistoryView, visit.getPatient().getMedicalHistory(), visit, clinicController);
        frame.add(medicalHistoryView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void editAudiologicalEvaluation(){
        //TODO
    }

    public void save(){
        JFrame frame = clinicController.getFrame();
        if(!visit.getPatient().getVisitList().contains(visit)){
            visit.getPatient().addVisit(visit);
        }
        frame.remove(visitView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, clinicController);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void notImplemented(){
        ArrayList<String> errMsgs = new ArrayList<>();
        errMsgs.add("Feature Not Yet Implemented");
        AlertBox alertBox = new AlertBox(errMsgs);
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

    private Visit visit;
    private VisitView visitView;
    private ClinicController clinicController;
}