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
        screenTitle = new JLabel("MEDICAL HISTORY");
        columnTitle = new Vector<String>();
        rowMedication = new Vector<Vector>();

        columnTitle.add("Name");
        columnTitle.add("Generic");
        columnTitle.add("Dose");
        columnTitle.add("Duration");
        columnTitle.add("Chemical Category");
        columnTitle.add("Action");
        columnTitle.add("Application");
        columnTitle.add("Usual Dose");
        columnTitle.add("Induces Tinnitus");

        medicalHistoryTable = new JTable(rowMedication,);

    }

    /**
     *
     * @param action
     */
    public void setAddMedicationAction(ActionListener action) {
        addMedication.setActionListener(action);
    }
    public void addMed
    private JLabel screenTitle;
    //Vectors for table
    private Vector<String> columnTitle;
    private Vector<Vector> rowMedication;
    //Table
    private JTable medicalHistoryTable;
    //Buttons
    private JButton addMedication;
}