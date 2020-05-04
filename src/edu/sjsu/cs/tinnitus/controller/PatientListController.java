package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;
import edu.sjsu.cs.tinnitus.view.frames.PatientView;

import javax.swing.*;

/**
 * Controller for communicating with PatientTable and PatientListView
 */
public class PatientListController implements Controller {


    /**
     * Constructs a patient list controller
     * @param patientTable - PatientTable where patient list is stored
     * @param patientListView - View for the patient list
     */
    public PatientListController(PatientTable patientTable, PatientListView patientListView, JFrame frame) {
        this.patientTable = patientTable;
        this.patientListView = patientListView;
        this.frame = frame;
        initTable();
        initController();

    }

    @Override
    public void initController() {

        patientListView.getSaveButton().addActionListener(e ->{
            save();
        });

        patientListView.getPatientTable().getSelectionModel().addListSelectionListener( e->{
            int row = e.getFirstIndex();
            goToPatient(patientTable.getPatientList().get(row));

        });
    }

    /**
     * returns to the navigation page
     */
    public void save(){
        frame.remove(patientListView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, frame, patientTable);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Proceeds to go to the Patient Info page of the patient
     * @param patient - patient whose page will be displayed
     */
    public void goToPatient(Patient patient){
        frame.remove(patientListView.getPanel());
        PatientView patientView = new PatientView();
        PatientController patientController = new PatientController(patient, patientView, frame, patientTable);
        frame.add(patientView.getPanel());
        frame.validate();
        frame.repaint();
    }

    private void initTable(){
        Object[][] data = new Object[patientTable.getPatientList().size()][2];
        String[] columnNames = {"Patient ID", "Patient Name"};
        int i = 0;
        for(Patient patient : patientTable.getPatientList()){
            data[i][0] = patient.getPatientId();
            data[i][1] = patient.getFirstName() + " " + patient.getLastName();
            i++;
        }
        //TODO CANT FIGURE OUT WHY USING THE SETTER IS NECESSARY
        //TODO MAKE ROWS NOT EDITABLE

        JTable table = new JTable(data, columnNames);
        patientListView.setPatientTable(table);
        JScrollPane scrollPane = new JScrollPane(table);
        patientListView.setScrollPane(scrollPane);
        frame.validate();
        frame.repaint();


    }

    /**
     * Getter for patientTable
     *
     * @return patientTable
     */
    public PatientTable getPatientTable() {
        return patientTable;
    }

    /**
     * Setter for patientTable
     *
     * @param patientTable - patientTable
     */
    public void setPatientTable(PatientTable patientTable) {
        this.patientTable = patientTable;
    }

    /**
     * Getter for patientListView
     *
     * @return patientListView
     */
    public PatientListView getPatientListView() {
        return patientListView;
    }

    /**
     * Setter for patientListView
     *
     * @param patientListView - patientListView
     */
    public void setPatientListView(PatientListView patientListView) {
        this.patientListView = patientListView;
    }

    /**
     * Getter for frame
     *
     * @return frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Setter for frame
     *
     * @param frame - frame
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    private PatientTable patientTable;
    private PatientListView patientListView;
    JFrame frame;
}
