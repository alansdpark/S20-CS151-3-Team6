package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

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
        medicalHistory = new JLabel("Medical History");
        currentMedication = new JLabel(" Current Medication");

        medicationTable = new JTable();
        medicalHistoryArea = new JTextArea();

        addMedication = new JButton("Add New Medication");
        saveButton = new JButton("Save");
    }

    private void addComponents(){
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(medicalHistory);
        panel.add(medicalHistoryArea);
        panel.add(currentMedication);
        JScrollPane scrollPane = new JScrollPane(medicationTable);
        panel.add(scrollPane);
        panel.add(addMedication);
        panel.add(saveButton);
    }

    private JLabel medicalHistory;
    private JLabel currentMedication;

    private JTable medicationTable;
    private JTextArea medicalHistoryArea;

    private JButton addMedication;
    private JButton saveButton;
    private JPanel panel;
}