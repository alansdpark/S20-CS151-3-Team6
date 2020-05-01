package edu.sjsu.cs.tinnitus.model;

import java.util.ArrayList;

/**
 * Class that represents the complete medical history of a patient
 */
public class MedicalHistory {

    /**
     * Default constructor.
     */
    public MedicalHistory()
    {
        medHistoryTable = new MedicalHistoryTable();
    }

    // Reference to medical history table.
    private MedicalHistoryTable medHistoryTable;
}
