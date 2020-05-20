package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.*;
import edu.sjsu.cs.tinnitus.view.frames.util.AlertBox;
import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

/**
 * Controller that communicates with Patient and PatientView
 */
public class PatientController implements Controller
{

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
        if(savePatientInfo()) {
            frame.remove(patientView.getPanel());
            NavigationView navigationView = new NavigationView();
            NavigationController navigationController = new NavigationController(navigationView, clinicController);
            frame.add(navigationView.getPanel(), BorderLayout.CENTER);
            frame.validate();
            frame.repaint();
        }
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
        LogInController logInController = new LogInController(logInView, patient, clinicController);
        frame.add(logInView.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();
    }

    /**
     * Switches control to medicalHistoryController
     */
    public void viewMedicalHistory(){
        JFrame frame = clinicController.getFrame();
        if(savePatientInfo()) {
            frame.remove(patientView.getPanel());
            MedicalHistoryView medicalHistoryView = new MedicalHistoryView();
            MedicalHistoryController medicalHistoryController =
                    new MedicalHistoryController(medicalHistoryView, patient.getMedicalHistory(), patient, clinicController);
            frame.add(medicalHistoryView.getPanel(), BorderLayout.CENTER);
            frame.validate();
            frame.repaint();
        }
    }

    /**
     * Switches control to the Visit Controller of visit
     * @param visit - visit to switch to
     */
    public void goToVisit(Visit visit){
        JFrame frame = clinicController.getFrame();
        if(savePatientInfo()) {
            frame.remove(patientView.getPanel());
            VisitView visitView = new VisitView();
            VisitController visitController =
                    new VisitController(visit, visitView, clinicController);
            frame.add(visitView.getPanel(), BorderLayout.CENTER);
            frame.validate();
            frame.repaint();
        }

    }

    /**
     * Loads all the currently stored information in patient to the
     * JTextFields
     */
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
        patientView.getPatientIdField().setText(patient.getPatientId().toString());

    }

    /**
     * Saves all new information to the patient.
     * Also does validation for the information and creates an AlertBox
     * if there is problems
     * @return - returns true if the info is successfully saved
     * otherwise returns false
     */
    public boolean savePatientInfo(){
        ArrayList<String> errMsgs = new ArrayList<>();

        // input collection
        String firstName = patientView.getFirstNameField().getText();
        String lastName = patientView.getLastNameField().getText();
        String address1 = patientView.getAddress1Field().getText();
        String address2 = patientView.getAddress2Field().getText();
        String city = patientView.getCityField().getText();
        String zipCode = patientView.getZipCodeField().getText();
        String country = patientView.getCountryField().getText();
        String birthday = patientView.getBirthdayField().getText();
        String gender = patientView.getGenderField().getText();
        String phoneNumber = patientView.getPhoneNumberField().getText();
        String ssn = patientView.getSsnField().getText();
        String insuranceNo = patientView.getInsuranceNoField().getText();
        String occupation = patientView.getOccupationField().getText();
        String workStatus = patientView.getWorkStatusField().getText();
        String educationalDegree = patientView.getEducationalDegreeField().getText();
        String tinnitusCategory = patientView.getTinnitusCategoryField().getText();
        String treatmentProtocol = patientView.getTreatmentProtocolField().getText();
        String nextVisit = patientView.getNextVisitField().getText();
        String patientId = patientView.getPatientIdField().getText();

        // input validation
        if(firstName.length() == 0){
            errMsgs.add("First Name must not be blank");
        }
        if(lastName.length() == 0){
            errMsgs.add("Last Name must not be blank");
        }
        if(address1.length() == 0){
            errMsgs.add("Address1 must not be blank");
        }
        if(city.length() == 0){
            errMsgs.add("City must not be blank");
        }
        if(zipCode.length() == 0){
            errMsgs.add("Zip Code must not be blank");
        }
        if(country.length() == 0){
            errMsgs.add("Country must not be blank");
        }
        if(birthday.length() == 0){
            errMsgs.add("Birthday must not be blank");
        }
        if(gender.length() == 0){
            errMsgs.add("Gender must not be blank");
        }
        if(phoneNumber.length() == 0){
            errMsgs.add("Phone Number must not be blank");
        }
        if(ssn.length() == 0){
            errMsgs.add("SSN must not be blank");
        }
        if(insuranceNo.length() == 0){
            errMsgs.add("Insurance No. must not be blank");
        }
        try{
            Integer in = Integer.parseInt(tinnitusCategory);
        } catch( NumberFormatException e){
            errMsgs.add("Tinnitus Category must be an integer.");
        }
        try{
            Integer in = Integer.parseInt(treatmentProtocol);
        } catch( NumberFormatException e){
            errMsgs.add("Treatment Protocol must be an integer.");
        }
        try{
            Integer in = Integer.parseInt(patientId);
        } catch( NumberFormatException e){
            errMsgs.add("Patient ID must be an integer.");
        }

        if(errMsgs.size() != 0){
            AlertBox alertBox = new AlertBox(errMsgs);
            return false;
        }

        // save all info to patient
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setAddress1(address1);
        patient.setAddress2(address2);
        patient.setCity(city);
        patient.setZipCode(zipCode);
        patient.setCountry(country);
        patient.setBirthday(birthday);
        patient.setGender(gender);
        patient.setPhoneNumber(phoneNumber);
        patient.setOccupation(occupation);
        patient.setWorkStatus(workStatus);
        patient.setEducationalDegree(educationalDegree);
        patient.setTinnitusCategory(Integer.parseInt(tinnitusCategory));
        patient.setTreatmentProtocol(Integer.parseInt(treatmentProtocol));
        patient.setNextVisit(nextVisit);
        patient.setPatientId(Integer.parseInt(patientId));
        return true;
    }

    /**
     * Creates the table will all information currently stored in patient's
     * visit List
     */
	public void initTable(){
        Object[][] data = new Object[patient.getVisitList().size()][2];
        String [] columnNames = {"Visit ID", "Date"};
        int i = 0;

        for(Visit visit : patient.getVisitList()){
            data[i][0] = visit.getVisitNumber();
            data[i][1] = visit.getDate();
            i++;
        }

        JTable table = new JTable(data, columnNames);
        patientView.setVisitTable(table);
        JScrollPane scrollPane = new JScrollPane(table);
        patientView.setScrollPane(scrollPane);
        //initController();           // must call init controller again to update the table
        clinicController.getFrame().validate();
        clinicController.getFrame().repaint();
    }

    /**
     * Sets the action listeners in the PatientView
     */
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
