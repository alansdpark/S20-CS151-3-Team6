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
        initController();
    }

    /**
     * Registers a new patient. Moves toward patient controller.
     */
    public void registerPatient()
    {

    }

    /**
     * Views patients. Moves toward patient controller
     */
    public void viewPatients()
    {

    }

    /**
     * Logs a new visit. Moves toward visit controller.
     */
    public void logVisit()
    {

    }

    /**
     * Exits the runtime.
     */
    public void exit()
    {
        navigationView.getPanel().setVisible(false);
    }

    @Override
    public void initController() {
        navigationView.getExit().addActionListener(e ->{
            exit();
        });
    }

    // Reference to navigation JPanel.
    private NavigationView navigationView;
}