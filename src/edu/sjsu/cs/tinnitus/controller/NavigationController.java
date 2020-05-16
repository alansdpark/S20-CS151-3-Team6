package edu.sjsu.cs.tinnitus.controller;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;
import java.awt.*;

/**
 * Controller for Navigation.
 * Should hold references to all other controllers.
 */
public class NavigationController implements Controller
{

    /**
     * Constructor for NavigationController
     * @param nv - navigation view
     * @param clinicController - clinic Controller
     */
    public NavigationController(NavigationView nv, ClinicController clinicController)
    {
        navigationView = nv;
        this.clinicController = clinicController;
        initController();
        clinicController.setHeaderContent("Navigation");

    }
    

    /**
     * Registers a new patient. Moves toward patient controller.
     */
    public void registerPatient()
    {
        clinicController.getFrame().remove(navigationView.getPanel());
        RegisterPatientView registerPatientView = new RegisterPatientView();
        RegisterPatientController registerPatientController =
                new RegisterPatientController(clinicController, registerPatientView);
        clinicController.getFrame().add(registerPatientView.getPanel(), BorderLayout.CENTER);
        clinicController.getFrame().validate();
        clinicController.getFrame().repaint();
    }

    /**
     * Views patients. Moves toward patient controller
     */
    public void viewPatients()
    {
        clinicController.getFrame().remove(navigationView.getPanel());
        PatientListView patientListView = new PatientListView();
        PatientListController patientListController =
                new PatientListController(patientListView, clinicController);
        clinicController.getFrame().add(patientListView.getPanel());
        clinicController.getFrame().validate();
        clinicController.getFrame().repaint();
    }

    /**
     * Logs a new visit. Moves toward visit controller.
     */
    public void logVisit()
    {
        clinicController.getFrame().remove(navigationView.getPanel());
        LogInView logInView = new LogInView();
        LogInController logInController = 
                new LogInController(logInView, clinicController);
        clinicController.getFrame().add(logInView.getPanel());
        clinicController.getFrame().validate();
        clinicController.getFrame().repaint();

    }

    /**
     * Exits the runtime.
     */
    public void exit()
    {
        clinicController.saveAllData();
        clinicController.getFrame().dispose();
    }

    /**
     * Sets the action listeners in the NavigationView
     */
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

    // Reference to navigation JPanel.
    private NavigationView navigationView;
    private ClinicController clinicController;
}