package edu.sjsu.cs.tinnitus.model;

import edu.sjsu.cs.tinnitus.model.Patient;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class that represents a full list of patients that have attended the clinic before
 */
public class PatientTable implements Serializable
{


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

    /**
     *  Finds a patient based ont their patientID
     * @param patientId
     * @return patient - if patient with matching ID is found
     * @return null - if no patient with matching ID is found
     */
    public Patient findPatient(int patientId){
        for(Patient patient: patients){
            if(patient.getPatientId() == patientId){
                return patient;
            }
        }
        return null;
    }

    /**
     *  Getter for the highest patient ID value in the patients arraylist
     * @return max - int
     */
    public int getHighestId(){
        int max = -1;
        for(Patient patient: patients){
            if(patient.getPatientId() > max){
                max = patient.getPatientId();
            }
        }
        return max;
    }

    // Reference to all patients.
    private ArrayList<Patient> patients;
}