package edu.sjsu.cs.tinnitus.controller;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;

/**
 * Controller for Navigation.
 * Should hold references to all other controllers.
 */
public class NavigationController implements Controller
{

    public NavigationController(NavigationView nv, JFrame frame)
    {
        navigationView = nv;
        this.frame = frame;
        this.patientTable = new PatientTable();
        initController();

    }

    public NavigationController(NavigationView nv, JFrame frame, PatientTable patientTable)
    {
        navigationView = nv;
        this.frame = frame;
        this.patientTable = patientTable;
        initController();
    }

    /**
     * Registers a new patient. Moves toward patient controller.
     */
    public void registerPatient()
    {
        frame.remove(navigationView.getPanel());
        RegisterPatientView registerPatientView = new RegisterPatientView();
        RegisterPatientController registerPatientController =
                new RegisterPatientController(patientTable,registerPatientView,  frame);
        frame.add(registerPatientView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Views patients. Moves toward patient controller
     */
    public void viewPatients()
    {
        frame.remove(navigationView.getPanel());
        PatientListView patientListView = new PatientListView();
        PatientListController patientListController =
                new PatientListController(patientTable, patientListView, frame);
        frame.add(patientListView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Logs a new visit. Moves toward visit controller.
     */
    public void logVisit()
    {
        frame.remove(navigationView.getPanel());
        LogInView logInView = new LogInView();
        LogInController logInController = new LogInController(logInView, patientTable, frame);
        frame.add(logInView.getPanel());
        frame.validate();
        frame.repaint();

    }

    /**
     * Exits the runtime.
     */
    public void exit()
    {
        frame.dispose();
    }

    @Override
    public void initController() {
        navigationView.getExit().addActionListener(e ->{
            exit();
        });

        navigationView.getRegisterNewPatient().addActionListener(e -> {
            registerPatient();
        });

        navigationView.getViewPatients().addActionListener(e -> {
            viewPatients();
        });

        navigationView.getLogVisit().addActionListener(e -> {
            logVisit();
        });
    }

    /**
     * Getter for navigationView
     *
     * @return navigationView
     */
    public NavigationView getNavigationView() {
        return navigationView;
    }

    /**
     * Setter for navigationView
     *
     * @param navigationView - navigationView
     */
    public void setNavigationView(NavigationView navigationView) {
        this.navigationView = navigationView;
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

    // Reference to navigation JPanel.
    private NavigationView navigationView;
    private JFrame frame;
    private PatientTable patientTable;
}