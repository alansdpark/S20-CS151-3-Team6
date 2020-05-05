package edu.sjsu.cs.tinnitus.model;

import edu.sjsu.cs.tinnitus.model.Medication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Similar to PatientTable.java
 * Acts as object to hold medical history.
 */
public class MedicalHistoryTable implements Serializable
{

    private ArrayList<Medication> medicationList;
    private String medicalHistoryDescription;
    /**
     * Default constructor.
     */
    public MedicalHistoryTable()
    {
        medicationList = new ArrayList<>();
        medicalHistoryDescription = "";
    }

    /**
     * Constructor with medication list and medical history.
     * @param medList arraylist(medication)
     * @param medHistoryDesc medical history description
     */
    public MedicalHistoryTable(ArrayList<Medication> medList, String medHistoryDesc)
    {
        this.medicationList = medList;
        this.medicalHistoryDescription = medHistoryDesc;
    }

    /**
     * Sets medication list to parameter.
     * @param medList medication arraylist
     */
    public void setMedicationList(ArrayList<Medication> medList)
    {
        this.medicationList = medList;
    }

    /**
     * Adds to medication list.
     * @param med medicine
     */
    public void addToMedicationList(Medication med)
    {
        this.medicationList.add(med);
    }

    /**
     * Returns medication list.
     * @return medication arraylist
     */
    public ArrayList<Medication> getMedicationList()
    {
        return this.medicationList;
    }

    /**
     * Sets medical history description.
     * @param desc String medical history description.
     */
    public void setMedHistoryDescription(String desc)
    {
        this.medicalHistoryDescription = desc;
    }

    /**
     * Returns medical history description.
     * @return String of medical history description.
     */
    public String getMedHistoryDescription()
    {
        return this.medicalHistoryDescription;
    }


}