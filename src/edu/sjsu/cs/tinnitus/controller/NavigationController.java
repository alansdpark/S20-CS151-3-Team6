package edu.sjsu.cs.tinnitus.controller;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

/**
 * Controller for Navigation.
 * Should hold references to all other controllers.
 */
public class NavigationController implements Controller
{

    public NavigationController(NavigationView nv)
    {
        navigationView = nv;
    }

    /**
     * Registers a new patient.
     */
    public void registerPatient()
    {

    }

    /**
     * Views patients.
     */
    public void viewPatients()
    {

    }

    /**
     * Logs a new visit.
     */
    public void logVisit()
    {

    }

    /**
     * Exits the runtime.
     */
    public void exit()
    {

    }

    @Override
    public void initController() {

    }

    // Reference to navigation JPanel.
    private NavigationView navigationView;
}