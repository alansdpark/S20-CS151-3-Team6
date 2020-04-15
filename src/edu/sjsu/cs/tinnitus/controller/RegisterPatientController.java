package edu.sjsu.cs.tinnitus.controller;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

public class RegisterPatientController implements Controller {


    /**
     * Constructor for Register Patient View. Creates a new Patient object to later be added
     * to system
     * @param system - system that holds the list of patients
     * @param view - view of the register patient
     */
    public RegisterPatientController(System system, RegisterPatientView view) {
        this.system = system;
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
     * Saves patient to the patientList in system
     */
    public void savePatient(){

    }

    /**
     * Getter for system
     *
     * @return system
     */
    public System getSystem() {
        return system;
    }

    /**
     * Setter for system
     *
     * @param system - system
     */
    public void setSystem(System system) {
        this.system = system;
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

    private System system;
    private RegisterPatientView view;
    private Patient patient;
}
