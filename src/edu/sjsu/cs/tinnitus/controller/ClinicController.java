package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.NavigationController;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

import javax.swing.*;
import java.awt.*;

public class ClinicController {

    public ClinicController() {
        patientTable = new PatientTable();
        frame = new JFrame();
        NavigationView view = new NavigationView();
        NavigationController controller = new NavigationController(view, this);
        frame.add(view.getPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    public ClinicController(PatientTable patientTable) {
        this.patientTable = patientTable;
        frame = new JFrame();
        NavigationView view = new NavigationView();
        NavigationController controller = new NavigationController(view, this);
        frame.add(view.getPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
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

    private PatientTable patientTable;
    JFrame frame;
}

