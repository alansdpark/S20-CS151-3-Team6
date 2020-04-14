package edu.sjsu.cs.tinnitus.model;

import java.util.ArrayList;

public class System {

    /**
     * Default Constructor for System
     * Creates an empty arraylist of patients
     */
    public System(){
        patientList = new ArrayList<>();
    }

    /**
     * Constructor for the System
     * @param patientList - list of patients
     */
    public System(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    /**
     * Getter for patientList
     * @return - patientList
     */
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    /**
     * Setter for patientList
     * @param patientList - patientList
     */
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    /**
     * Adds a patient to the patientList
     */
    public void addPatient(Patient patient){
        patientList.add(patient);
    }
    private ArrayList<Patient> patientList;
}
