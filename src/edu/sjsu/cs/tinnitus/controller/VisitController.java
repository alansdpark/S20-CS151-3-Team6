package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;

/**
 * Controller for Visit.
 */
public class VisitController implements Controller
{

    public VisitController(Visit visit, VisitView visitView, JFrame jFrame, PatientTable patientTable) {
        this.visit = visit;
        this.visitView = visitView;
        this.jFrame = jFrame;
        this.patientTable = patientTable;
        initController();
    }

    /**
     * Logs a new visit.
     */
    public void logVisit()
    {

    }

    /**
     * Edits a visit.
     */
    public void editVisit()
    {
        
    }

    @Override
    public void initController() {

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
     * Getter for jFrame
     *
     * @return jFrame
     */
    public JFrame getjFrame() {
        return jFrame;
    }

    /**
     * Setter for jFrame
     *
     * @param jFrame - jFrame
     */
    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
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
    JFrame jFrame;
    PatientTable patientTable;
}