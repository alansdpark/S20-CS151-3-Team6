package edu.sjsu.cs.tinnitus;
import javax.swing.JFrame;

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
        // Starts with the navigation view.
        JFrame window = new JFrame("Team 6 - Project 3 (Audiology)");
        NavigationView navigationView = new NavigationView();
        window.setContentPane(navigationView);
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}