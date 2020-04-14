package edu.sjsu.cs.tinnitus.model;

import java.util.ArrayList;

public class MedicalHistory {

    public MedicalHistory(String medicalHistoryDescription, ArrayList<Medication> medicationList) {
        this.medicalHistoryDescription = medicalHistoryDescription;
        this.medicationList = medicationList;
    }

    /**
     * getter for medicalHistoryDescription
     * @return - medicalHistoryDescription
     */
    public String getMedicalHistoryDescription() {
        return medicalHistoryDescription;
    }

    /**
     * setter for medicalHistoryDescription
     * @param medicalHistoryDescription - medicalHistoryDescription
     */
    public void setMedicalHistoryDescription(String medicalHistoryDescription) {
        this.medicalHistoryDescription = medicalHistoryDescription;
    }

    /**
     * getter for medication list
     * @return - medicationList
     */
    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }

    /**
     * setter for medicationList
     * @param medicationList - medicationList
     */
    public void setMedicationList(ArrayList<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    /**
     * Adds a new medication to the medication list
     * @param medication - medication to be added
     */
    public void addMedication(Medication medication) {
        medicationList.add(medication);
    }

    private String medicalHistoryDescription;
    private ArrayList<Medication> medicationList;
}
