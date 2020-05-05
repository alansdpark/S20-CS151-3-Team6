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
     * @param patientListView - View for the patient list
     * @param clinicController - clinicController
     */
    public PatientListController(PatientListView patientListView, ClinicController clinicController) {
        this.patientListView = patientListView;
        this.clinicController = clinicController;
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
            goToPatient(clinicController.getPatientTable().getPatientList().get(row));

        });
    }

    /**
     * returns to the navigation page
     */
    public void save(){
        JFrame frame = clinicController.getFrame();
        frame.remove(patientListView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, clinicController);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Proceeds to go to the Patient Info page of the patient
     * @param patient - patient whose page will be displayed
     */
    public void goToPatient(Patient patient){
        JFrame frame = clinicController.getFrame();
        frame.remove(patientListView.getPanel());
        PatientView patientView = new PatientView();
        PatientController patientController = new PatientController(patient, patientView, clinicController);
        frame.add(patientView.getPanel());
        frame.validate();
        frame.repaint();
    }

    private void initTable(){
        PatientTable patientTable = clinicController.getPatientTable();
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
        clinicController.getFrame().validate();
        clinicController.getFrame().repaint();


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
     * Getter for clinicController
     *
     * @return clinicController
     */
    public ClinicController getClinicController() {
        return clinicController;
    }

    /**
     * Setter for clinicController
     *
     * @param clinicController - clinicController
     */
    public void setClinicController(ClinicController clinicController) {
        this.clinicController = clinicController;
    }

    private PatientListView patientListView;
    private ClinicController clinicController;
}
