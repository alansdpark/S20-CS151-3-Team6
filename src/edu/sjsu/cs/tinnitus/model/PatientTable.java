package edu.sjsu.cs.tinnitus.model;

import edu.sjsu.cs.tinnitus.model.Patient;

import java.util.ArrayList;

public class PatientTable 
{
    // Reference to all patients.
    private ArrayList<Patient> patients;

    public PatientTable()
    {
        patients = new ArrayList<>();
    }

    /**
     * Constructor for the Patient Table
     * @param patientList - list of patients
     */
    public PatientTable(ArrayList<Patient> patientList) {
        this.patients = patientList;
    }

    /**
     * Getter for all patients.
     * @return - patients
     */
    public ArrayList<Patient> getPatientList() {
        return patients;
    }

    /**
     * Setter for patients
     * @param patientList - ArrayList<Patient>
     */
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patients = patientList;
    }

    /**
     * Adds a patient to the arraylist of patients.
     */
    public void addPatient(Patient patient){
        patients.add(patient);
    }
}