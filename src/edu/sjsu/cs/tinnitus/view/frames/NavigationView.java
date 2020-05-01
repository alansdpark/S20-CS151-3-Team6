package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

/**
 * This class is the view for the default Navigation Page of the entire system
 */
public class NavigationView {



    /**
     * Constructs the view for Navigation.
     */
    public NavigationView()
    {
        registerNewPatient = new JButton("Register a new patient");
        viewPatients = new JButton("View all patients");
        logVisit = new JButton("Log a new visit");
        exit = new JButton("Exit");
        panel = new JPanel();

        addComponents();
    }



    /**
     * Getter for registerNewPatient
     *
     * @return registerNewPatient
     */
    public JButton getRegisterNewPatient() {
        return registerNewPatient;
    }

    /**
     * Setter for registerNewPatient
     *
     * @param registerNewPatient - registerNewPatient
     */
    public void setRegisterNewPatient(JButton registerNewPatient) {
        this.registerNewPatient = registerNewPatient;
    }

    /**
     * Getter for viewPatients
     *
     * @return viewPatients
     */
    public JButton getViewPatients() {
        return viewPatients;
    }

    /**
     * Setter for viewPatients
     *
     * @param viewPatients - viewPatients
     */
    public void setViewPatients(JButton viewPatients) {
        this.viewPatients = viewPatients;
    }

    /**
     * Getter for logVisit
     *
     * @return logVisit
     */
    public JButton getLogVisit() {
        return logVisit;
    }

    /**
     * Setter for logVisit
     *
     * @param logVisit - logVisit
     */
    public void setLogVisit(JButton logVisit) {
        this.logVisit = logVisit;
    }

    /**
     * Getter for exit
     *
     * @return exit
     */
    public JButton getExit() {
        return exit;
    }

    /**
     * Setter for exit
     *
     * @param exit - exit
     */
    public void setExit(JButton exit) {
        this.exit = exit;
    }

    /**
     * Getter for panel
     *
     * @return panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * Setter for panel
     *
     * @param panel - panel
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }


    private void addComponents(){
        panel.add(registerNewPatient);
        panel.add(viewPatients);
        panel.add(logVisit);
        panel.add(exit);
    }



    /**
     * Navigation Buttons
     */
    private JButton registerNewPatient;
    private JButton viewPatients;
    private JButton logVisit;
    private JButton exit;
    private JPanel panel;
}