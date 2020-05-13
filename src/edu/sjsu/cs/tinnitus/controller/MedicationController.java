package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.Controller;
import edu.sjsu.cs.tinnitus.model.MedicalHistory;
import edu.sjsu.cs.tinnitus.model.Medication;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;
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
    public MedicationController(MedicalHistory medicalHistory, MedicationView medicationView, Medication medication, ClinicController clinicController) {
        this.medicalHistory = medicalHistory;
        this.medicationView = medicationView;
        this.clinicController = clinicController;
        initController();
    }

    /**
     * Adds listeners to the GUI components in medicationView
     */
    public void initController(){
        medicationView.getSaveButton().addActionListener( e -> {
            saveAndReturn();
        });
    }

    /**
     * Updates the fields in medication with the current information
     * stored in the respective jTextFields..
     */
    public void saveInfoToMedication(){
        Medication medication = new Medication();
        String name = medicationView.getNameField().getText();
        String generic = medicationView.getGenericField().getText();
        String dose = medicationView.getDoseField().getText();
        String duration = medicationView.getDurationField().getText();
        String chemicalCategory = medicationView.getChemicalCategoryField().getText();
        String action = medicationView.getActionField().getText();
        String application = medicationView.getApplicationField().getText();
        String usualDose = medicationView.getUsualDoseField().getText();
        String inducesTinnitus = medicationView.getInducesTinnitusField().getText();

        //TODO VALIDATE

        medication.setName(name);
        medication.setGenericName(generic);
        medication.setDose(Double.parseDouble(dose));
        medication.setDuration(Double.parseDouble(duration));
        medication.setChemicalCategory(chemicalCategory);
        medication.setAction(action);
        medication.setApplication(application);
        medication.setUsualDose(Double.parseDouble(usualDose));
        medication.setInducesTinnitus(Boolean.parseBoolean(inducesTinnitus));       // may not work
    }

    /**
     * Adds current medication to the MedicalHistory
     */
    public void saveAndReturn(){
        saveInfoToMedication();
        medicationView.getFrame().dispose();

    }


    private MedicalHistory medicalHistory;
    private MedicationView medicationView;
    private Medication medication;
    private ClinicController clinicController;
    
}