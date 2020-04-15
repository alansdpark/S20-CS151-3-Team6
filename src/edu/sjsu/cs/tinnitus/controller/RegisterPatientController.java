package edu.sjsu.cs.tinnitus.controller;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.PatientTable;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

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
    public RegisterPatientController(PatientTable patientTable, RegisterPatientView view) {
        this.patientTable = patientTable;
        this.view = view;
    }

    @Override
    public void initController() {

    }

    /**
     * Closes current frame and opens up frame for new visit
     */
    public void createNewVisit(){

    }

    /**
     * Saves patient to the patientList in patientTable
     */
    public void savePatient(){

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
}
