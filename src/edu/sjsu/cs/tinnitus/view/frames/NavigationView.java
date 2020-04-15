package view.frames;
import javax.swing.*;

public class NavigationView extends JPanel {

    /**
     * Navigation Buttons
     */
    private JButton registerNewPatient;
    private JButton viewPatients;
    private JButton logVisit;
    private JButton exit;

    /**
     * 
     */
    public NavigationView()
    {
        registerNewPatient = new JButton("Register a new patient");
        viewPatients = new JButton("View all patients");
        logVisit = new JButton("Log a new visit");
        exit = new JButton("Exit");
    }
}