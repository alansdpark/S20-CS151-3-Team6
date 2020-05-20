package edu.sjsu.cs.tinnitus;
import edu.sjsu.cs.tinnitus.controller.ClinicController;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

import javax.swing.JFrame;

/**
 * Main runtime file.
 * CS 151 - Subtopic 3 - Team 6
 * @author Team 6
 */
public class MainApp
{
    /**
     * Run project.
     * Starts by displaying navigation page, which has menu for:
     * - registering new patient
     * - view patients
     * - log a new visit
     * - Exit
     */
    public static void main(String[] args)
    {
        ClinicController clinic = new ClinicController();
    }
}
