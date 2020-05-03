package edu.sjsu.cs.tinnitus.controller;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;

/**
 * Controller for communicating with RegisterPatientView and PatientTable
 */
public class RegisterPatientController implements Controller {


    /**
     * Constructor for Register Patient View. Creates a new Patient object to later be added
     * to patientTable
     * @param patientTable - patientTable that holds the list of patients
     * @param view - view of the register patient
     */
    public RegisterPatientController(PatientTable patientTable, RegisterPatientView view, JFrame frame) {
        this.patientTable = patientTable;
        this.view = view;
        this.frame = frame;
        initController();
    }

    @Override
    public void initController() {
        view.getSaveButton().addActionListener(e ->{
            savePatient();
        });
        view.getInitialVisitButtion().addActionListener(e ->{
            createNewVisit();
        });
        view.getBackButton().addActionListener(e -> {
            back();
        });
    }

    public void back(){
        frame.remove(view.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, frame, patientTable);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Closes current frame and opens up frame for new visit
     */
    public void createNewVisit(){
        addPatient();
        frame.remove(view.getPanel());
        LogInView logInView = new LogInView();
        LogInController logInController = new LogInController(logInView, patientTable, frame);
        frame.add(logInView.getPanel());
        frame.validate();
        frame.repaint();
    }

    /**
     * Saves patient to the patientList in patientTable
     */
    public void savePatient(){
        addPatient();
        frame.remove(view.getPanel());
        NavigationView navigationView = new NavigationView();
        NavigationController navigationController =
                new NavigationController(navigationView, frame, patientTable);
        frame.add(navigationView.getPanel());
        frame.validate();
        frame.repaint();
    }
    
    public boolean addPatient(){
        Patient patient = new Patient();
         String firstName = view.getFirstNameField().getText();
         String lastName = view.getLastNameField().getText();
         String address1 = view.getAddress1Field().getText();
         String address2 = view.getAddress2Field().getText();
         String city = view.getCityField().getText();
         String state = view.getStateField().getText();
         String zipCode = view.getZipCodeField().getText();
         String country = view.getCountryField().getText();
         String birthday = view.getBirthdayField().getText();
         String gender = view.getGenderField().getText();
         String phoneNumber = view.getPhoneNumberField().getText();
         String ssn = view.getSsnField().getText();
         String insuranceNo = view.getInsuranceNoField().getText();
         String occupation = view.getOccupationField().getText();
         String workStatus = view.getWorkStatusField().getText();
         String educationalDegree = view.getEducationalDegreeField().getText();
         //TODO VALIDATE INPUT - RETURN FALSE IF INPUT IS NOT CORRECT
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setAddress1(address1);
        patient.setAddress2(address2);
        patient.setCity(city);
        patient.setState(state);
        patient.setZipCode(zipCode);
        patient.setCountry(country);
        patient.setBirthday(birthday);
        patient.setGender(gender);
        patient.setPhoneNumber(phoneNumber);
        patient.setSsn(ssn);
        patient.setInsuranceNo(insuranceNo);
        patient.setOccupation(occupation);
        patient.setWorkStatus(workStatus);
        patient.setEducationalDegree(educationalDegree);

        patient.setPatientId(patientTable.getHighestId() + 1);

        patientTable.addPatient(patient);
        return true;
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
     * Getter for view
     *
     * @return view
     */
    public RegisterPatientView getView() {
        return view;
    }

    /**
     * Setter for view
     *
     * @param view - view
     */
    public void setView(RegisterPatientView view) {
        this.view = view;
    }

    private PatientTable patientTable;
    private RegisterPatientView view;
    private Patient patient;
    private JFrame frame;
}
