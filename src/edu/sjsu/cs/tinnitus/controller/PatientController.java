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
    public PatientController(Patient patient, PatientView patientView, ClinicController clinicController) {
        this.patient = patient;
        this.patientView = patientView;
        this.clinicController = clinicController;
        addPatientInfo();
        initTable();
        initController();
    }


    /**
     * Saves any edits made in the textFields to the patient
     */
    public void saveEdits()
    {
        JFrame frame = clinicController.getFrame();
        savePatientInfo();
        frame.remove(patientView.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController = new NavigationController(navigationView, clinicController);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Logs a new visit.
     */
    public void logVisit()
    {
        JFrame frame = clinicController.getFrame();
        savePatientInfo();
        frame.remove(patientView.getPanel());
        LogInView logInView = new LogInView();
        LogInController logInController = new LogInController(logInView, clinicController);
        frame.add(logInView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void viewMedicalHistory(){
        JFrame frame = clinicController.getFrame();
        savePatientInfo();
        frame.remove(patientView.getPanel());
        MedicalHistoryView medicalHistoryView = new MedicalHistoryView();
        MedicalHistoryController medicalHistoryController =
                new MedicalHistoryController(medicalHistoryView, patient.getMedicalHistory(), patient, clinicController);
        frame.add(medicalHistoryView.getPanel());
        frame.validate();
        frame.repaint();
    }

    public void goToVisit(Visit visit){
        JFrame frame = clinicController.getFrame();
        savePatientInfo();
        frame.remove(patientView.getPanel());
        VisitView visitView = new VisitView();
        VisitController visitController =
                new VisitController(visit, visitView, clinicController);
        frame.add(visitView.getPanel());
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
        //initController();           // must call init controller again to update the table
        clinicController.getFrame().validate();
        clinicController.getFrame().repaint();
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

        patientView.getVisitTable().getSelectionModel().addListSelectionListener( e->{
            int row = e.getFirstIndex();
            goToVisit(patient.getVisitList().get(row));

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

    private Patient patient;
    private PatientView patientView;
    private ClinicController clinicController;


}
