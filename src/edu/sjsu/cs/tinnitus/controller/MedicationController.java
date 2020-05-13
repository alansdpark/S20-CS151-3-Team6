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
    public MedicationController(MedicalHistory medicalHistory, MedicationView medicationView,
                                Medication medication, MedicalHistoryController medicalHistoryController) {
        this.medicalHistory = medicalHistory;
        this.medicationView = medicationView;
        this.medication = medication;
        this.medicalHistoryController = medicalHistoryController;
        initFields();
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
     * Initializes the fields with the values from medication
     * Used when editing a medication
     */
    public void initFields(){
        Double dose = medication.getDose();
        Double duration = medication.getDuration();
        Double usualDose = medication.getUsualDose();
        Boolean inducesTinnitus = medication.inducesTinnitus();

        medicationView.getNameField().setText(medication.getName());
        medicationView.getGenericField().setText(medication.getGenericName());
        medicationView.getDoseField().setText(dose.toString());
        medicationView.getDurationField().setText(duration.toString());
        medicationView.getChemicalCategoryField().setText(medication.getChemicalCategory());
        medicationView.getActionField().setText(medication.getAction());
        medicationView.getApplicationField().setText(medication.getApplication());
        medicationView.getUsualDoseField().setText(usualDose.toString());
        medicationView.getInducesTinnitusField().setText(inducesTinnitus.toString());
    }

    /**
     * Updates the fields in medication with the current information
     * stored in the respective jTextFields..
     */
    public void saveInfoToMedication(){
        String name = medicationView.getNameField().getText();
        String generic = medicationView.getGenericField().getText();
        String dose = medicationView.getDoseField().getText();
        String duration = medicationView.getDurationField().getText();
        String chemicalCategory = medicationView.getChemicalCategoryField().getText();
        String action = medicationView.getActionField().getText();
        String application = medicationView.getApplicationField().getText();
        String usualDose = medicationView.getUsualDoseField().getText();
        String inducesTinnitus = medicationView.getInducesTinnitusField().getText();

        //TODO VALIDATE INPUT

        medication.setName(name);
        medication.setGenericName(generic);
        medication.setDose(Double.parseDouble(dose));
        medication.setDuration(Double.parseDouble(duration));
        medication.setChemicalCategory(chemicalCategory);
        medication.setAction(action);
        medication.setApplication(application);
        medication.setUsualDose(Double.parseDouble(usualDose));
        medication.setInducesTinnitus(Boolean.parseBoolean(inducesTinnitus));       // may not work

        //medicalHistory.getMedHistoryTable().addToMedicationList(medication);
    }

    /**
     * Adds current medication to the MedicalHistory
     */
    public void saveAndReturn(){
        saveInfoToMedication();
        medicalHistoryController.initTable();
        medicationView.getFrame().dispose();

    }

    /**
     * Getter for medicalHistory
     *
     * @return medicalHistory
     */
    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }

    /**
     * Setter for medicalHistory
     *
     * @param medicalHistory - medicalHistory
     */
    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     * Getter for medicationView
     *
     * @return medicationView
     */
    public MedicationView getMedicationView() {
        return medicationView;
    }

    /**
     * Setter for medicationView
     *
     * @param medicationView - medicationView
     */
    public void setMedicationView(MedicationView medicationView) {
        this.medicationView = medicationView;
    }

    /**
     * Getter for medication
     *
     * @return medication
     */
    public Medication getMedication() {
        return medication;
    }

    /**
     * Setter for medication
     *
     * @param medication - medication
     */
    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    /**
     * Getter for medicalHistoryController
     *
     * @return medicalHistoryController
     */
    public MedicalHistoryController getMedicalHistoryController() {
        return medicalHistoryController;
    }

    /**
     * Setter for medicalHistoryController
     *
     * @param medicalHistoryController - medicalHistoryController
     */
    public void setMedicalHistoryController(MedicalHistoryController medicalHistoryController) {
        this.medicalHistoryController = medicalHistoryController;
    }

    private MedicalHistory medicalHistory;
    private MedicationView medicationView;
    private Medication medication;
    private MedicalHistoryController medicalHistoryController;
    
}