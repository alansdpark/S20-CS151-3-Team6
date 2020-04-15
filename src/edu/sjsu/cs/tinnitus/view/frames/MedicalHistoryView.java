package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

/**
 * View for Medical History Page.
 */
public class MedicalHistoryView extends JPanel
{
    private JLabel medicalHistory;
    private JLabel currentMedication;
    // Edit buttons
    private JButton editMedicalHistory;
    private JButton editMedication;

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
}