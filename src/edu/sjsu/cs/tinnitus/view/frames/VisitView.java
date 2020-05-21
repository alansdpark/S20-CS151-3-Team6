package edu.sjsu.cs.tinnitus.view.frames;

import javax.swing.*;

/**
 * View class for Visit.
 */
public class VisitView {

    /**
     * Constructor
     */
    public VisitView() {
        initComponents();
        addComponents();
        panel.setVisible(true);
    }

    /**
     * Getter for questionarreButton
     *
     * @return questionarreButton
     */
    public JButton getQuestionarreButton() {
        return questionarreButton;
    }

    /**
     * Setter for questionarreButton
     *
     * @param questionarreButton - questionarreButton
     */
    public void setQuestionarreButton(JButton questionarreButton) {
        this.questionarreButton = questionarreButton;
    }

    /**
     * Getter for medicalHistoryButton
     *
     * @return medicalHistoryButton
     */
    public JButton getMedicalHistoryButton() {
        return medicalHistoryButton;
    }

    /**
     * Setter for medicalHistoryButton
     *
     * @param medicalHistoryButton - medicalHistoryButton
     */
    public void setMedicalHistoryButton(JButton medicalHistoryButton) {
        this.medicalHistoryButton = medicalHistoryButton;
    }

    /**
     * Getter for audiologicalEvaluationButton
     *
     * @return audiologicalEvaluationButton
     */
    public JButton getAudiologicalEvaluationButton() {
        return audiologicalEvaluationButton;
    }

    /**
     * Setter for audiologicalEvaluationButton
     *
     * @param audiologicalEvaluationButton - audiologicalEvaluationButton
     */
    public void setAudiologicalEvaluationButton(JButton audiologicalEvaluationButton) {
        this.audiologicalEvaluationButton = audiologicalEvaluationButton;
    }

    /**
     * Getter for treatmentButton
     *
     * @return treatmentButton
     */
    public JButton getTreatmentButton() {
        return treatmentButton;
    }

    /**
     * Setter for treatmentButton
     *
     * @param treatmentButton - treatmentButton
     */
    public void setTreatmentButton(JButton treatmentButton) {
        this.treatmentButton = treatmentButton;
    }

    /**
     * Getter for registerTreatmentButton
     *
     * @return registerTreatmentButton
     */
    public JButton getRegisterTreatmentButton() {
        return registerTreatmentButton;
    }

    /**
     * Setter for registerTreatmentButton
     *
     * @param registerTreatmentButton - registerTreatmentButton
     */
    public void setRegisterTreatmentButton(JButton registerTreatmentButton) {
        this.registerTreatmentButton = registerTreatmentButton;
    }

    /**
     * Getter for panel
     *
     * @return panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * Setter for panel
     *
     * @param panel - panel
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * Getter for saveButton
     *
     * @return saveButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }

    /**
     * Setter for saveButton
     *
     * @param saveButton - saveButton
     */
    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    private void initComponents(){
        panel = new JPanel();
        questionarreButton = new JButton("Structured Questionarre");
        audiologicalEvaluationButton = new JButton("Audiological Evaluation");
        medicalHistoryButton = new JButton("Medical History");
        treatmentButton = new JButton("Treatment");
        registerTreatmentButton = new JButton("Register Treatment");
        saveButton = new JButton("Save");
    }

    /**
     * Adds all the required components to the panel
     */
    private void addComponents(){
        panel.add(questionarreButton);
        panel.add(audiologicalEvaluationButton);
        panel.add(medicalHistoryButton);
        panel.add(treatmentButton);
        panel.add(registerTreatmentButton);
        panel.add(saveButton);
    }

    private JButton questionarreButton;
    private JButton medicalHistoryButton;
    private JButton audiologicalEvaluationButton;
    private JButton treatmentButton;
    private JButton registerTreatmentButton;
    private JButton saveButton;
    private JPanel panel;
}
