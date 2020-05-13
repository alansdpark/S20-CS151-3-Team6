package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;
import java.awt.*;

/**
 * This class allows for the user to see the GUI for adding a new medication
 */
public class MedicationView extends JPanel {

    /**
     * Constructor for medication view
     * Creates all UI elements, and adds them to the frame
     */
    public MedicationView()
    {
        initComponents();
        addComponents();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }


    /**
     * Getter for nameField
     *
     * @return nameField
     */
    public JTextField getNameField() {
        return nameField;
    }

    /**
     * Setter for nameField
     *
     * @param nameField - nameField
     */
    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    /**
     * Getter for genericField
     *
     * @return genericField
     */
    public JTextField getGenericField() {
        return genericField;
    }

    /**
     * Setter for genericField
     *
     * @param genericField - genericField
     */
    public void setGenericField(JTextField genericField) {
        this.genericField = genericField;
    }

    /**
     * Getter for doseField
     *
     * @return doseField
     */
    public JTextField getDoseField() {
        return doseField;
    }

    /**
     * Setter for doseField
     *
     * @param doseField - doseField
     */
    public void setDoseField(JTextField doseField) {
        this.doseField = doseField;
    }

    /**
     * Getter for durationField
     *
     * @return durationField
     */
    public JTextField getDurationField() {
        return durationField;
    }

    /**
     * Setter for durationField
     *
     * @param durationField - durationField
     */
    public void setDurationField(JTextField durationField) {
        this.durationField = durationField;
    }

    /**
     * Getter for chemicalCategoryField
     *
     * @return chemicalCategoryField
     */
    public JTextField getChemicalCategoryField() {
        return chemicalCategoryField;
    }

    /**
     * Setter for chemicalCategoryField
     *
     * @param chemicalCategoryField - chemicalCategoryField
     */
    public void setChemicalCategoryField(JTextField chemicalCategoryField) {
        this.chemicalCategoryField = chemicalCategoryField;
    }

    /**
     * Getter for actionField
     *
     * @return actionField
     */
    public JTextField getActionField() {
        return actionField;
    }

    /**
     * Setter for actionField
     *
     * @param actionField - actionField
     */
    public void setActionField(JTextField actionField) {
        this.actionField = actionField;
    }

    /**
     * Getter for applicationField
     *
     * @return applicationField
     */
    public JTextField getApplicationField() {
        return applicationField;
    }

    /**
     * Setter for applicationField
     *
     * @param applicationField - applicationField
     */
    public void setApplicationField(JTextField applicationField) {
        this.applicationField = applicationField;
    }

    /**
     * Getter for usualDoseField
     *
     * @return usualDoseField
     */
    public JTextField getUsualDoseField() {
        return usualDoseField;
    }

    /**
     * Setter for usualDoseField
     *
     * @param usualDoseField - usualDoseField
     */
    public void setUsualDoseField(JTextField usualDoseField) {
        this.usualDoseField = usualDoseField;
    }

    /**
     * Getter for inducesTinnitusField
     *
     * @return inducesTinnitusField
     */
    public JTextField getInducesTinnitusField() {
        return inducesTinnitusField;
    }

    /**
     * Setter for inducesTinnitusField
     *
     * @param inducesTinnitusField - inducesTinnitusField
     */
    public void setInducesTinnitusField(JTextField inducesTinnitusField) {
        this.inducesTinnitusField = inducesTinnitusField;
    }

    /**
     * Getter for nameLabel
     *
     * @return nameLabel
     */
    public JLabel getNameLabel() {
        return nameLabel;
    }

    /**
     * Setter for nameLabel
     *
     * @param nameLabel - nameLabel
     */
    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    /**
     * Getter for genericLabel
     *
     * @return genericLabel
     */
    public JLabel getGenericLabel() {
        return genericLabel;
    }

    /**
     * Setter for genericLabel
     *
     * @param genericLabel - genericLabel
     */
    public void setGenericLabel(JLabel genericLabel) {
        this.genericLabel = genericLabel;
    }

    /**
     * Getter for doseLabel
     *
     * @return doseLabel
     */
    public JLabel getDoseLabel() {
        return doseLabel;
    }

    /**
     * Setter for doseLabel
     *
     * @param doseLabel - doseLabel
     */
    public void setDoseLabel(JLabel doseLabel) {
        this.doseLabel = doseLabel;
    }

    /**
     * Getter for durationLabel
     *
     * @return durationLabel
     */
    public JLabel getDurationLabel() {
        return durationLabel;
    }

    /**
     * Setter for durationLabel
     *
     * @param durationLabel - durationLabel
     */
    public void setDurationLabel(JLabel durationLabel) {
        this.durationLabel = durationLabel;
    }

    /**
     * Getter for chemicalCategoryLabel
     *
     * @return chemicalCategoryLabel
     */
    public JLabel getChemicalCategoryLabel() {
        return chemicalCategoryLabel;
    }

    /**
     * Setter for chemicalCategoryLabel
     *
     * @param chemicalCategoryLabel - chemicalCategoryLabel
     */
    public void setChemicalCategoryLabel(JLabel chemicalCategoryLabel) {
        this.chemicalCategoryLabel = chemicalCategoryLabel;
    }

    /**
     * Getter for actionLabel
     *
     * @return actionLabel
     */
    public JLabel getActionLabel() {
        return actionLabel;
    }

    /**
     * Setter for actionLabel
     *
     * @param actionLabel - actionLabel
     */
    public void setActionLabel(JLabel actionLabel) {
        this.actionLabel = actionLabel;
    }

    /**
     * Getter for applicationLabel
     *
     * @return applicationLabel
     */
    public JLabel getApplicationLabel() {
        return applicationLabel;
    }

    /**
     * Setter for applicationLabel
     *
     * @param applicationLabel - applicationLabel
     */
    public void setApplicationLabel(JLabel applicationLabel) {
        this.applicationLabel = applicationLabel;
    }

    /**
     * Getter for usualDoseLabel
     *
     * @return usualDoseLabel
     */
    public JLabel getUsualDoseLabel() {
        return usualDoseLabel;
    }

    /**
     * Setter for usualDoseLabel
     *
     * @param usualDoseLabel - usualDoseLabel
     */
    public void setUsualDoseLabel(JLabel usualDoseLabel) {
        this.usualDoseLabel = usualDoseLabel;
    }

    /**
     * Getter for inducesTinnitusLabel
     *
     * @return inducesTinnitusLabel
     */
    public JLabel getInducesTinnitusLabel() {
        return inducesTinnitusLabel;
    }

    /**
     * Setter for inducesTinnitusLabel
     *
     * @param inducesTinnitusLabel - inducesTinnitusLabel
     */
    public void setInducesTinnitusLabel(JLabel inducesTinnitusLabel) {
        this.inducesTinnitusLabel = inducesTinnitusLabel;
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

    /**
     * Getter for frame
     *
     * @return frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Setter for frame
     *
     * @param frame - frame
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    private void initComponents(){
        frame = new JFrame();
        nameField = new JTextField(10);
        genericField = new JTextField(10);
        doseField = new JTextField(10);
        durationField = new JTextField(10);
        chemicalCategoryField = new JTextField(10);
        actionField = new JTextField(10);
        applicationField = new JTextField(10);
        usualDoseField = new JTextField(10);
        inducesTinnitusField = new JTextField(10);

        nameLabel = new JLabel("Name", SwingConstants.RIGHT);
        genericLabel = new JLabel("Generic", SwingConstants.RIGHT);
        doseLabel = new JLabel("Dose", SwingConstants.RIGHT);
        durationLabel = new JLabel("Duration", SwingConstants.RIGHT);
        chemicalCategoryLabel = new JLabel("Chemical Category", SwingConstants.RIGHT);
        actionLabel = new JLabel("Action", SwingConstants.RIGHT);
        applicationLabel = new JLabel("Application", SwingConstants.RIGHT);
        usualDoseLabel = new JLabel("Usual Does", SwingConstants.RIGHT);
        inducesTinnitusLabel = new JLabel("Induces Tinnitus", SwingConstants.RIGHT);

        header = new JLabel("Medication");
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 24));


        saveButton = new JButton("Save");
    }
    
    private void addComponents(){
        JPanel infoPanel = new JPanel(new GridLayout(0,2, 10, 10));

        infoPanel.add(nameLabel);
        infoPanel.add(nameField);
        infoPanel.add(genericLabel);
        infoPanel.add(genericField);
        infoPanel.add(doseLabel);
        infoPanel.add(doseField);
        infoPanel.add(durationLabel);
        infoPanel.add(durationField);
        infoPanel.add(chemicalCategoryLabel);
        infoPanel.add(chemicalCategoryField);
        infoPanel.add(actionLabel);
        infoPanel.add(actionField);
        infoPanel.add(applicationLabel);
        infoPanel.add(applicationField);
        infoPanel.add(usualDoseLabel);
        infoPanel.add(usualDoseField);
        infoPanel.add(inducesTinnitusLabel);
        infoPanel.add(inducesTinnitusField);

        infoPanel.add(saveButton);

        frame.add(header, BorderLayout.NORTH);
        frame.add(infoPanel, BorderLayout.CENTER);
    }

    private JTextField nameField;
    private JTextField genericField;
    private JTextField doseField;
    private JTextField durationField;
    private JTextField chemicalCategoryField;
    private JTextField actionField;
    private JTextField applicationField;
    private JTextField usualDoseField;
    private JTextField inducesTinnitusField;
    
    private JLabel nameLabel;
    private JLabel genericLabel;
    private JLabel doseLabel;
    private JLabel durationLabel;
    private JLabel chemicalCategoryLabel;
    private JLabel actionLabel;
    private JLabel applicationLabel;
    private JLabel usualDoseLabel;
    private JLabel inducesTinnitusLabel;
    private JLabel header;

    private JButton saveButton;
    private JFrame frame;
}
