package edu.sjsu.cs.tinnitus.model;

/**
 * Class that represents one medication that a patient is taking, or has taken
 */
public class Medication {

    /**
     * Default Constructor
     * Sets all values to 0 or ""
     */
    public Medication(){

    }

    /**
     * Full Constructor
     * @param name - name of the medication
     * @param genericName - generic name of the medication
     * @param dose - total amount of medication prescribed over the duration (mg)
     * @param duration - duration of how long the medication is to be taken for
     * @param chemicalCategory - description of the chemical category
     * @param action - function of the drug in various body systems
     * @param application - description of how the medication is to be applied
     * @param usualDose - dose of one application (mg)
     * @param inducesTinnitus - boolean for whether or not the medication induces tinnitus
     */
    public Medication(String name, String genericName, double dose,
                      double duration, String chemicalCategory, String action,
                      String application, double usualDose, boolean inducesTinnitus) {
        this.name = name;
        this.genericName = genericName;
        this.dose = dose;
        this.duration = duration;
        this.chemicalCategory = chemicalCategory;
        this.action = action;
        this.application = application;
        this.usualDose = usualDose;
        this.inducesTinnitus = inducesTinnitus;
    }

    /**
     * getter for name
     * @return - name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for generic name
     * @return - genericName
     */
    public String getGenericName() {
        return genericName;
    }

    /**
     * setter for genericName
     * @param genericName - genericName
     */
    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    /**
     * getter for dose
     * @return - dose
     */
    public double getDose() {
        return dose;
    }

    /**
     * setter for dose
     * @param dose - dose
     */
    public void setDose(double dose) {
        this.dose = dose;
    }

    /**
     * getter for duration
     * @return - duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * setter for duration
     * @param duration - duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * getter for chemical category
     * @return chemicalCategory
     */
    public String getChemicalCategory() {
        return chemicalCategory;
    }

    /**
     * setter for chemicalCategory
     * @param chemicalCategory - chemicalCategory
     */
    public void setChemicalCategory(String chemicalCategory) {
        this.chemicalCategory = chemicalCategory;
    }

    /**
     * getter for action
     * @return - action
     */
    public String getAction() {
        return action;
    }

    /**
     * setter for action
     * @param action - action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * getter for application
     * @return - application
     */
    public String getApplication() {
        return application;
    }

    /**
     * setter for application
     * @param application - application
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * getter for usual dose
     * @return - usualDose
     */
    public double getUsualDose() {
        return usualDose;
    }

    /**
     * setter for usualDose
     * @param usualDose - usualDose
     */
    public void setUsualDose(double usualDose) {
        this.usualDose = usualDose;
    }

    /**
     *  getter for inducesTinnitus
     * @return - inducesTinnitus
     */
    public boolean inducesTinnitus() {
        return inducesTinnitus;
    }

    /**
     * setter for inducesTinnitus
     * @param inducesTinnitus - inducesTinnitus
     */
    public void setInducesTinnitus(boolean inducesTinnitus) {
        this.inducesTinnitus = inducesTinnitus;
    }

    private String name;
    private String genericName;
    private double dose;
    private double duration;
    private String chemicalCategory;
    private String action;
    private String application;
    private double usualDose;
    private boolean inducesTinnitus;
}
