package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.Controller;
import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.model.Medication;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.MedicationView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

import javax.swing.*;

/**
 * Controller that communicates with Medication and MedicationView
 */
public class MedicationController implements Controller
{

    /**
     * Constructs the medication controller
     * @param medicalHistory - medical history where this medication will be added
     * @param medicationView  - GUI view of the medication
     * @param medication - medication that can be edited
     */
    public MedicationController(MedicalHistory medicalHistory, MedicationView medicationView, Medication medication, JFrame frame, Visit visit) {
        this.medicalHistory = medicalHistory;
        this.medicationView = medicationView;
        this.medication = medication;
        this.frame = frame;
    }

    /**
     * Adds listeners to the GUI components in medicationView
     */
    public void initController(){

    }

    /**
     * Updates the fields in medication with the current information
     * stored in the respective jTextFields..
     */
    public void saveInfoToMedication(){}

    /**
     * Adds current medication to the MedicalHistory
     */
    public void saveAndReturn(){

    }


    private MedicalHistory medicalHistory;
    private MedicationView medicationView;
    private Medication medication;
    private JFrame frame;
    
}