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
        medicalHistory = new JLabel();
        currentMedication = new JLabel();
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

    private JLabel medicalHistory;
    private JLabel currentMedication;

    private JTable medicationTable;
    private JTextArea medicalHistoryArea;

    private JButton addMedication;
}