package edu.sjsu.cs.tinnitus.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class that represents the complete medical history of a patient
 */
public class MedicalHistory implements Serializable {

    /**
     * Default constructor.
     */
    public MedicalHistory()
    {
        medHistoryTable = new MedicalHistoryTable();
    }

    /**
     * Getter for medHistoryTable
     *
     * @return medHistoryTable
     */
    public MedicalHistoryTable getMedHistoryTable() {
        return medHistoryTable;
    }

    /**
     * Setter for medHistoryTable
     *
     * @param medHistoryTable - medHistoryTable
     */
    public void setMedHistoryTable(MedicalHistoryTable medHistoryTable) {
        this.medHistoryTable = medHistoryTable;
    }

    // Reference to medical history table.
    private MedicalHistoryTable medHistoryTable;
}
