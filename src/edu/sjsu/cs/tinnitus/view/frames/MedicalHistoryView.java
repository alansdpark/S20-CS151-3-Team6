package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

/**
 * View for Medical History Page.
 */
public class MedicalHistoryView extends JPanel
{

    /**
     * Default Constructor
     */
    public MedicalHistoryView() {
        medicalHistory = new JLabel();
        currentMedication = new JLabel();
    }

    /**
     * Constructor with medical history and current medication already created.
     * @param medHistory
     * @param currentMed
     */
    public MedicalHistoryView(String medHistory, String currentMed)
    {
        medicalHistory = new JLabel(medHistory);
        currentMedication = new JLabel(currentMed);
    }

    /**
     * loads in data from the Medical History model to view
     */
    public load() {

    }

    /**
     * sets actions listener to the edit medical history button
     * through the controller
     * @param listener
     */
    public void setEditMedicalHistory(AcionListener listener) {
        editMedicalHistory.setActionListener(listener);
    }

    /**
     * sets action listener to edit the medication through the controller
     * @param listener
     */
    public void setEditMedication(ActionListener listener) {
        editMedication.setActionListener(listener);
    }

    private MedicalHistory data;
    private JLabel medicalHistory;
    private JLabel currentMedication;
    private JTextArea medHistory_area;
    // Edit buttons
    private JButton editMedicalHistory;
    private JButton editMedication;
}