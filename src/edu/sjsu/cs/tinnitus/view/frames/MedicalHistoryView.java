package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * View for Medical History Page.
 */
public class MedicalHistoryView extends JPanel
{

    /**
     * Constructor creates all GUI objects and places them on the panel
     */
    public MedicalHistoryView() {
        initComponents();
        addComponents();
        panel.setVisible(true);
    }

    /**
     * Updates the ScrollPane containing the table
     * @param scrollPane - scrollPane containing the table
     */
    public void setScrollPane(JScrollPane scrollPane) {
        // TODO see if moving the buttons around can be removed
       // panel.remove(this.scrollPane);
        //panel.remove(saveButton);
        //panel.remove(addMedication);
        this.scrollPane = scrollPane;
        panel.add(scrollPane, BorderLayout.CENTER);
        //panel.add(addMedication, BorderLayout.SOUTH);
        //panel.add(saveButton, BorderLayout.SOUTH);
    }


    /**
     * Getter for medicalHistory
     *
     * @return medicalHistory
     */
    public JLabel getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * Setter for medicalHistory
     *
     * @param medicalHistory - medicalHistory
     */
    public void setMedicalHistory(JLabel medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     * Getter for currentMedication
     *
     * @return currentMedication
     */
    public JLabel getCurrentMedication() {
        return currentMedication;
    }

    /**
     * Setter for currentMedication
     *
     * @param currentMedication - currentMedication
     */
    public void setCurrentMedication(JLabel currentMedication) {
        this.currentMedication = currentMedication;
    }

    /**
     * Getter for medicationTable
     *
     * @return medicationTable
     */
    public JTable getMedicationTable() {
        return medicationTable;
    }

    /**
     * Setter for medicationTable
     *
     * @param medicationTable - medicationTable
     */
    public void setMedicationTable(JTable medicationTable) {
        this.medicationTable = medicationTable;
    }

    /**
     * Getter for medicalHistoryArea
     *
     * @return medicalHistoryArea
     */
    public JTextArea getMedicalHistoryArea() {
        return medicalHistoryArea;
    }

    /**
     * Setter for medicalHistoryArea
     *
     * @param medicalHistoryArea - medicalHistoryArea
     */
    public void setMedicalHistoryArea(JTextArea medicalHistoryArea) {
        this.medicalHistoryArea = medicalHistoryArea;
    }

    /**
     * Getter for addMedication
     *
     * @return addMedication
     */
    public JButton getAddMedication() {
        return addMedication;
    }

    /**
     * Setter for addMedication
     *
     * @param addMedication - addMedication
     */
    public void setAddMedication(JButton addMedication) {
        this.addMedication = addMedication;
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

    /**
     * Getter for saveButton
     *
     * @return saveButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }

    /**
     * Setter for saveButton
     *
     * @param saveButton - saveButton
     */
    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    private void initComponents(){
        panel = new JPanel();
        medicalHistory = new JLabel("Medical History Description", SwingConstants.LEFT);
        currentMedication = new JLabel(" Current Medication", SwingConstants.LEFT);

        medicationTable = new JTable();
        medicalHistoryArea = new JTextArea();
        medicalHistoryArea.setRows(10);

        addMedication = new JButton("Add New Medication");
        saveButton = new JButton("Save");
    }

    private void addComponents(){

        panel.setLayout(new BorderLayout());
        JPanel historyPanel = new JPanel(new BorderLayout());
        historyPanel.add(medicalHistory, BorderLayout.NORTH);
        historyPanel.add(medicalHistoryArea, BorderLayout.CENTER);
        historyPanel.add(currentMedication, BorderLayout.SOUTH);
        panel.add(historyPanel, BorderLayout.NORTH);

        scrollPane = new JScrollPane(medicationTable);
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addMedication);
        buttonPanel.add(saveButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);


        /**
        panel.add(medicalHistory);
        panel.add(medicalHistoryArea);

        panel.add(currentMedication);
        scrollPane = new JScrollPane(medicationTable);
        panel.add(scrollPane);

        panel.add(addMedication);
        panel.add(saveButton);
         */

    }

    private JLabel medicalHistory;
    private JLabel currentMedication;

    private JTable medicationTable;
    private JTextArea medicalHistoryArea;

    private JButton addMedication;
    private JButton saveButton;
    private JPanel panel;

    private JScrollPane scrollPane;
}