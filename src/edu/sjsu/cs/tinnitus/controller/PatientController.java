package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.*;
import sun.rmi.runtime.Log;

import javax.swing.*;

/**
 * Controller that communicates with Patient and PatientView
 */
public class PatientController implements Controller
{
    /**
     * Default Constructor for Patient Controller
     */
    public PatientController()
    {

    }

    /**
     * Constructor for Patient Controller
     * @param patient - patient model
     * @param patientView - patient view
     */
    public PatientController(Patient patient, PatientView patientView, JFrame frame, PatientTable patientTable) {
        this.patient = patient;
        this.patientView = patientView;
        this.frame = frame;
        this.patientTable = patientTable;
        addPatientInfo();
        initController();
        //initTable(); TODO
    }


    /**
     * Saves any edits made in the textFields to the patient
     */
    public void saveEdits()
    {
        savePatientInfo();
        frame.remove(patientView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController = new NavigationController(navigationView, frame, patientTable);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Logs a new visit.
     */
    public void logVisit()
    {
        savePatientInfo();
        frame.remove(patientView.getPanel());
        LogInView logInView = new LogInView();
        LogInController logInController = new LogInController(logInView, patientTable, frame);
        frame.add(logInView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void viewMedicalHistory(){
        savePatientInfo();
        frame.remove(patientView.getPanel());
        MedicalHistoryView medicalHistoryView = new MedicalHistoryView();
        MedicalHistoryController medicalHistoryController =
                new MedicalHistoryController(medicalHistoryView, patient.getMedicalHistory(), frame, patient, patientTable);
        frame.add(medicalHistoryView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void addPatientInfo(){
        patientView.getFirstNameField().setText(patient.getFirstName());
        //TODO REPEAT FOR ALL FIELDS
    }

    public void savePatientInfo(){
        patient.setFirstName(patientView.getFirstNameField().getText());
        //TODO REPEAT FOR ALL FIELDS
    }

    /**
     * Opens frame to selected Visit
     * @param visit - visit to be edited
     */
    public void editVisit(Visit visit)
	{

	}

	public void initTable(){
        Object[][] data = new Object[patient.getVisitList().size()][2];
        String [] columnNames = {"Visit ID", "Date"};
        int i = 0;

        for(Visit visit : patient.getVisitList()){
            data[i][0] = visit.getVisitNumber();
            data[i][1] = visit.getDate();
            i++;
        }

        // TODO
        JTable table = new JTable(data, columnNames);
        patientView.setVisitTable(table);
        JScrollPane scrollPane = new JScrollPane(table);
        patientView.setScrollPane(scrollPane);
        initController();           // must call init controller again to update the table
        frame.validate();
        frame.repaint();
    }

    @Override
    public void initController() {
        patientView.getSaveButton().addActionListener(e ->{
            saveEdits();
        });

        patientView.getMedicalHistoryButton().addActionListener(e -> {
            viewMedicalHistory();
        });

        patientView.getNewVisitButton().addActionListener( e -> {
            logVisit();
        });
    }


    /**
     * Getter for patient
     *
     * @return patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Setter for patient
     *
     * @param patient - patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Getter for patientView
     *
     * @return patientView
     */
    public PatientView getPatientView() {
        return patientView;
    }

    /**
     * Setter for patientView
     *
     * @param patientView - patientView
     */
    public void setPatientView(PatientView patientView) {
        this.patientView = patientView;
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

    private Patient patient;
    private PatientView patientView;
    private JFrame frame;
    private PatientTable patientTable;


}
