package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.*;
import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

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
        clinicController.setHeaderContent("Patient");
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
        frame.add(navigationView.getPanel(), BorderLayout.CENTER);
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
        frame.add(logInView.getPanel(), BorderLayout.CENTER);
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
        frame.add(medicalHistoryView.getPanel(), BorderLayout.CENTER);
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
        frame.add(visitView.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();

    }

    public void addPatientInfo(){
        patientView.getFirstNameField().setText(patient.getFirstName());
        patientView.getLastNameField().setText(patient.getLastName());
        patientView.getAddress1Field().setText(patient.getAddress1());
        patientView.getAddress2Field().setText(patient.getAddress2());
        patientView.getCityField().setText(patient.getCity());
        patientView.getStateField().setText(patient.getState());
        patientView.getZipCodeField().setText(patient.getZipCode());
        patientView.getCountryField().setText(patient.getCountry());
        patientView.getBirthdayField().setText(patient.getBirthday());
        patientView.getGenderField().setText(patient.getGender());
        patientView.getPhoneNumberField().setText(patient.getPhoneNumber());
        patientView.getSsnField().setText(patient.getSsn());
        patientView.getInsuranceNoField().setText(patient.getInsuranceNo());
        patientView.getOccupationField().setText(patient.getOccupation());
        patientView.getWorkStatusField().setText(patient.getWorkStatus());
        patientView.getEducationalDegreeField().setText(patient.getEducationalDegree());
        patientView.getTinnitusCategoryField().setText(patient.getTinnitusCategory().toString());
        patientView.getTreatmentProtocolField().setText(patient.getTinnitusCategory().toString());
        patientView.getNextVisitField().setText(patient.getNextVisit());
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
