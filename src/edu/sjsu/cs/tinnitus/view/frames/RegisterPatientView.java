package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;
import java.awt.*;

/**
 * This class allows the user to view the information for registering a new patient.
 */
public class RegisterPatientView extends JPanel
{

    /**
     * Constructor for RegisterPatientView
     * Creates all GUI components and places them in frame
     */
    public RegisterPatientView()
    {
        initComponents();
        addComponents();
        panel.setVisible(true);
    }


    /**
     * Getter for firstNameField
     *
     * @return firstNameField
     */
    public JTextField getFirstNameField() {
        return firstNameField;
    }

    /**
     * Setter for firstNameField
     *
     * @param firstNameField - firstNameField
     */
    public void setFirstNameField(JTextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    /**
     * Getter for lastNameField
     *
     * @return lastNameField
     */
    public JTextField getLastNameField() {
        return lastNameField;
    }

    /**
     * Setter for lastNameField
     *
     * @param lastNameField - lastNameField
     */
    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    /**
     * Getter for address1Field
     *
     * @return address1Field
     */
    public JTextField getAddress1Field() {
        return address1Field;
    }

    /**
     * Setter for address1Field
     *
     * @param address1Field - address1Field
     */
    public void setAddress1Field(JTextField address1Field) {
        this.address1Field = address1Field;
    }

    /**
     * Getter for address2Field
     *
     * @return address2Field
     */
    public JTextField getAddress2Field() {
        return address2Field;
    }

    /**
     * Setter for address2Field
     *
     * @param address2Field - address2Field
     */
    public void setAddress2Field(JTextField address2Field) {
        this.address2Field = address2Field;
    }

    /**
     * Getter for cityField
     *
     * @return cityField
     */
    public JTextField getCityField() {
        return cityField;
    }

    /**
     * Setter for cityField
     *
     * @param cityField - cityField
     */
    public void setCityField(JTextField cityField) {
        this.cityField = cityField;
    }

    /**
     * Getter for stateField
     *
     * @return stateField
     */
    public JTextField getStateField() {
        return stateField;
    }

    /**
     * Setter for stateField
     *
     * @param stateField - stateField
     */
    public void setStateField(JTextField stateField) {
        this.stateField = stateField;
    }

    /**
     * Getter for zipCodeField
     *
     * @return zipCodeField
     */
    public JTextField getZipCodeField() {
        return zipCodeField;
    }

    /**
     * Setter for zipCodeField
     *
     * @param zipCodeField - zipCodeField
     */
    public void setZipCodeField(JTextField zipCodeField) {
        this.zipCodeField = zipCodeField;
    }

    /**
     * Getter for countryField
     *
     * @return countryField
     */
    public JTextField getCountryField() {
        return countryField;
    }

    /**
     * Setter for countryField
     *
     * @param countryField - countryField
     */
    public void setCountryField(JTextField countryField) {
        this.countryField = countryField;
    }

    /**
     * Getter for birthdayField
     *
     * @return birthdayField
     */
    public JTextField getBirthdayField() {
        return birthdayField;
    }

    /**
     * Setter for birthdayField
     *
     * @param birthdayField - birthdayField
     */
    public void setBirthdayField(JTextField birthdayField) {
        this.birthdayField = birthdayField;
    }

    /**
     * Getter for genderField
     *
     * @return genderField
     */
    public JTextField getGenderField() {
        return genderField;
    }

    /**
     * Setter for genderField
     *
     * @param genderField - genderField
     */
    public void setGenderField(JTextField genderField) {
        this.genderField = genderField;
    }

    /**
     * Getter for phoneNumberField
     *
     * @return phoneNumberField
     */
    public JTextField getPhoneNumberField() {
        return phoneNumberField;
    }

    /**
     * Setter for phoneNumberField
     *
     * @param phoneNumberField - phoneNumberField
     */
    public void setPhoneNumberField(JTextField phoneNumberField) {
        this.phoneNumberField = phoneNumberField;
    }

    /**
     * Getter for ssnField
     *
     * @return ssnField
     */
    public JTextField getSsnField() {
        return ssnField;
    }

    /**
     * Setter for ssnField
     *
     * @param ssnField - ssnField
     */
    public void setSsnField(JTextField ssnField) {
        this.ssnField = ssnField;
    }

    /**
     * Getter for insuranceNoField
     *
     * @return insuranceNoField
     */
    public JTextField getInsuranceNoField() {
        return insuranceNoField;
    }

    /**
     * Setter for insuranceNoField
     *
     * @param insuranceNoField - insuranceNoField
     */
    public void setInsuranceNoField(JTextField insuranceNoField) {
        this.insuranceNoField = insuranceNoField;
    }

    /**
     * Getter for occupationField
     *
     * @return occupationField
     */
    public JTextField getOccupationField() {
        return occupationField;
    }

    /**
     * Setter for occupationField
     *
     * @param occupationField - occupationField
     */
    public void setOccupationField(JTextField occupationField) {
        this.occupationField = occupationField;
    }

    /**
     * Getter for workStatusField
     *
     * @return workStatusField
     */
    public JTextField getWorkStatusField() {
        return workStatusField;
    }

    /**
     * Setter for workStatusField
     *
     * @param workStatusField - workStatusField
     */
    public void setWorkStatusField(JTextField workStatusField) {
        this.workStatusField = workStatusField;
    }

    /**
     * Getter for educationalDegreeField
     *
     * @return educationalDegreeField
     */
    public JTextField getEducationalDegreeField() {
        return educationalDegreeField;
    }

    /**
     * Setter for educationalDegreeField
     *
     * @param educationalDegreeField - educationalDegreeField
     */
    public void setEducationalDegreeField(JTextField educationalDegreeField) {
        this.educationalDegreeField = educationalDegreeField;
    }

    /**
     * Getter for firstNameLabel
     *
     * @return firstNameLabel
     */
    public JLabel getFirstNameLabel() {
        return firstNameLabel;
    }

    /**
     * Setter for firstNameLabel
     *
     * @param firstNameLabel - firstNameLabel
     */
    public void setFirstNameLabel(JLabel firstNameLabel) {
        this.firstNameLabel = firstNameLabel;
    }

    /**
     * Getter for lastNameLabel
     *
     * @return lastNameLabel
     */
    public JLabel getLastNameLabel() {
        return lastNameLabel;
    }

    /**
     * Setter for lastNameLabel
     *
     * @param lastNameLabel - lastNameLabel
     */
    public void setLastNameLabel(JLabel lastNameLabel) {
        this.lastNameLabel = lastNameLabel;
    }

    /**
     * Getter for address1Label
     *
     * @return address1Label
     */
    public JLabel getAddress1Label() {
        return address1Label;
    }

    /**
     * Setter for address1Label
     *
     * @param address1Label - address1Label
     */
    public void setAddress1Label(JLabel address1Label) {
        this.address1Label = address1Label;
    }

    /**
     * Getter for address2Label
     *
     * @return address2Label
     */
    public JLabel getAddress2Label() {
        return address2Label;
    }

    /**
     * Setter for address2Label
     *
     * @param address2Label - address2Label
     */
    public void setAddress2Label(JLabel address2Label) {
        this.address2Label = address2Label;
    }

    /**
     * Getter for cityLabel
     *
     * @return cityLabel
     */
    public JLabel getCityLabel() {
        return cityLabel;
    }

    /**
     * Setter for cityLabel
     *
     * @param cityLabel - cityLabel
     */
    public void setCityLabel(JLabel cityLabel) {
        this.cityLabel = cityLabel;
    }

    /**
     * Getter for stateLabel
     *
     * @return stateLabel
     */
    public JLabel getStateLabel() {
        return stateLabel;
    }

    /**
     * Setter for stateLabel
     *
     * @param stateLabel - stateLabel
     */
    public void setStateLabel(JLabel stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * Getter for zipCodeLabel
     *
     * @return zipCodeLabel
     */
    public JLabel getZipCodeLabel() {
        return zipCodeLabel;
    }

    /**
     * Setter for zipCodeLabel
     *
     * @param zipCodeLabel - zipCodeLabel
     */
    public void setZipCodeLabel(JLabel zipCodeLabel) {
        this.zipCodeLabel = zipCodeLabel;
    }

    /**
     * Getter for countryLabel
     *
     * @return countryLabel
     */
    public JLabel getCountryLabel() {
        return countryLabel;
    }

    /**
     * Setter for countryLabel
     *
     * @param countryLabel - countryLabel
     */
    public void setCountryLabel(JLabel countryLabel) {
        this.countryLabel = countryLabel;
    }

    /**
     * Getter for birthdayLabel
     *
     * @return birthdayLabel
     */
    public JLabel getBirthdayLabel() {
        return birthdayLabel;
    }

    /**
     * Setter for birthdayLabel
     *
     * @param birthdayLabel - birthdayLabel
     */
    public void setBirthdayLabel(JLabel birthdayLabel) {
        this.birthdayLabel = birthdayLabel;
    }

    /**
     * Getter for genderLabel
     *
     * @return genderLabel
     */
    public JLabel getGenderLabel() {
        return genderLabel;
    }

    /**
     * Setter for genderLabel
     *
     * @param genderLabel - genderLabel
     */
    public void setGenderLabel(JLabel genderLabel) {
        this.genderLabel = genderLabel;
    }

    /**
     * Getter for phoneNumberLabel
     *
     * @return phoneNumberLabel
     */
    public JLabel getPhoneNumberLabel() {
        return phoneNumberLabel;
    }

    /**
     * Setter for phoneNumberLabel
     *
     * @param phoneNumberLabel - phoneNumberLabel
     */
    public void setPhoneNumberLabel(JLabel phoneNumberLabel) {
        this.phoneNumberLabel = phoneNumberLabel;
    }

    /**
     * Getter for ssnLabel
     *
     * @return ssnLabel
     */
    public JLabel getSsnLabel() {
        return ssnLabel;
    }

    /**
     * Setter for ssnLabel
     *
     * @param ssnLabel - ssnLabel
     */
    public void setSsnLabel(JLabel ssnLabel) {
        this.ssnLabel = ssnLabel;
    }

    /**
     * Getter for insuranceNoLabel
     *
     * @return insuranceNoLabel
     */
    public JLabel getInsuranceNoLabel() {
        return insuranceNoLabel;
    }

    /**
     * Setter for insuranceNoLabel
     *
     * @param insuranceNoLabel - insuranceNoLabel
     */
    public void setInsuranceNoLabel(JLabel insuranceNoLabel) {
        this.insuranceNoLabel = insuranceNoLabel;
    }

    /**
     * Getter for occupationLabel
     *
     * @return occupationLabel
     */
    public JLabel getOccupationLabel() {
        return occupationLabel;
    }

    /**
     * Setter for occupationLabel
     *
     * @param occupationLabel - occupationLabel
     */
    public void setOccupationLabel(JLabel occupationLabel) {
        this.occupationLabel = occupationLabel;
    }

    /**
     * Getter for workStatusLabel
     *
     * @return workStatusLabel
     */
    public JLabel getWorkStatusLabel() {
        return workStatusLabel;
    }

    /**
     * Setter for workStatusLabel
     *
     * @param workStatusLabel - workStatusLabel
     */
    public void setWorkStatusLabel(JLabel workStatusLabel) {
        this.workStatusLabel = workStatusLabel;
    }

    /**
     * Getter for educationalDegreeLabel
     *
     * @return educationalDegreeLabel
     */
    public JLabel getEducationalDegreeLabel() {
        return educationalDegreeLabel;
    }

    /**
     * Setter for educationalDegreeLabel
     *
     * @param educationalDegreeLabel - educationalDegreeLabel
     */
    public void setEducationalDegreeLabel(JLabel educationalDegreeLabel) {
        this.educationalDegreeLabel = educationalDegreeLabel;
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

    /**
     * Getter for initialVisitButtion
     *
     * @return initialVisitButtion
     */
    public JButton getInitialVisitButtion() {
        return initialVisitButtion;
    }

    /**
     * Setter for initialVisitButtion
     *
     * @param initialVisitButtion - initialVisitButtion
     */
    public void setInitialVisitButtion(JButton initialVisitButtion) {
        this.initialVisitButtion = initialVisitButtion;
    }

    /**
     * Getter for backButton
     *
     * @return backButton
     */
    public JButton getBackButton() {
        return backButton;
    }

    /**
     * Setter for backButton
     *
     * @param backButton - backButton
     */
    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    /**
     * Initializes the Components
     */
    private void initComponents(){
        panel = new JPanel();

        firstNameField = new JTextField(10);
        lastNameField = new JTextField(10);
        address1Field = new JTextField(10);
        address2Field = new JTextField(10);
        cityField = new JTextField(10);
        stateField = new JTextField(10);
        zipCodeField = new JTextField(10);
        countryField = new JTextField(10);
        birthdayField = new JTextField(10);
        genderField = new JTextField(10);
        phoneNumberField = new JTextField(10);
        ssnField = new JTextField(10);
        insuranceNoField = new JTextField(10);
        occupationField = new JTextField(10);
        workStatusField = new JTextField(10);
        educationalDegreeField = new JTextField(10);

        firstNameLabel = new JLabel("First Name", SwingConstants.RIGHT);
        lastNameLabel = new JLabel("Last Name", SwingConstants.RIGHT);
        address1Label = new JLabel("Address 1", SwingConstants.RIGHT);
        address2Label = new JLabel("Address 2", SwingConstants.RIGHT);
        cityLabel = new JLabel("City",SwingConstants.RIGHT);
        stateLabel = new JLabel("State", SwingConstants.RIGHT);
        zipCodeLabel = new JLabel("Zip Code", SwingConstants.RIGHT);
        countryLabel = new JLabel("Country", SwingConstants.RIGHT);
        birthdayLabel = new JLabel("Date of Birth", SwingConstants.RIGHT);
        genderLabel = new JLabel("Gender", SwingConstants.RIGHT);
        phoneNumberLabel = new JLabel("Phone Number", SwingConstants.RIGHT);
        ssnLabel = new JLabel("SSN", SwingConstants.RIGHT);
        insuranceNoLabel = new JLabel("Insurance No.", SwingConstants.RIGHT);
        occupationLabel = new JLabel("Occupation*", SwingConstants.RIGHT);
        workStatusLabel = new JLabel("Work Status*",SwingConstants.RIGHT);
        educationalDegreeLabel = new JLabel("Educational Degree*", SwingConstants.RIGHT);

        saveButton = new JButton("Save");
        initialVisitButtion = new JButton("Initial Visit");
        backButton = new JButton("Back");
    }

    /**
     * Adds the components to the infoPanel
     */
    private void addComponents(){

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0,4, 10, 10));
        infoPanel.add(firstNameLabel);
        infoPanel.add(firstNameField);
        infoPanel.add(birthdayLabel);
        infoPanel.add(birthdayField);
        infoPanel.add(lastNameLabel);
        infoPanel.add(lastNameField);
        infoPanel.add(genderLabel);
        infoPanel.add(genderField);
        infoPanel.add(address1Label);
        infoPanel.add(address1Field);
        infoPanel.add(phoneNumberLabel);
        infoPanel.add(phoneNumberField);
        infoPanel.add(address2Label);
        infoPanel.add(address2Field);
        infoPanel.add(ssnLabel);
        infoPanel.add(ssnField);
        infoPanel.add(cityLabel);
        infoPanel.add(cityField);
        infoPanel.add(insuranceNoLabel);
        infoPanel.add(insuranceNoField);
        infoPanel.add(stateLabel);
        infoPanel.add(stateField);
        infoPanel.add(occupationLabel);
        infoPanel.add(occupationField);
        infoPanel.add(zipCodeLabel);
        infoPanel.add(zipCodeField);
        infoPanel.add(workStatusLabel);
        infoPanel.add(workStatusField);
        infoPanel.add(countryLabel);
        infoPanel.add(countryField);
        infoPanel.add(educationalDegreeLabel);
        infoPanel.add(educationalDegreeField);

        infoPanel.add(initialVisitButtion);
        infoPanel.add(saveButton);
        infoPanel.add(backButton);
        infoPanel.add(new JLabel("* Optional"));

        panel.add(infoPanel);



    }


    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField address1Field;
    private JTextField address2Field;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipCodeField;
    private JTextField countryField;
    private JTextField birthdayField;
    private JTextField genderField;
    private JTextField phoneNumberField;
    private JTextField ssnField;
    private JTextField insuranceNoField;
    private JTextField occupationField;
    private JTextField workStatusField;
    private JTextField educationalDegreeField;
    
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel address1Label;
    private JLabel address2Label;
    private JLabel cityLabel;
    private JLabel stateLabel;
    private JLabel zipCodeLabel;
    private JLabel countryLabel;
    private JLabel birthdayLabel;
    private JLabel genderLabel;
    private JLabel phoneNumberLabel;
    private JLabel ssnLabel;
    private JLabel insuranceNoLabel;
    private JLabel occupationLabel;
    private JLabel workStatusLabel;
    private JLabel educationalDegreeLabel;

    private JPanel panel;
    private JButton saveButton;
    private JButton initialVisitButtion;
    private JButton backButton;
    
}
