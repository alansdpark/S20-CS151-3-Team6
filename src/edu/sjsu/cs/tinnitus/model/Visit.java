package edu.sjsu.cs.tinnitus.model;

import java.io.Serializable;

/**
 * Class that represents a visit to the tinnitus clinic
 */
public class Visit implements Serializable {

    /**
     * Default Constructor for visit
     */
    public Visit(){

    }

    /**
     * Constructor to create a new Visit without audiology information or visitNumber
     * @param patient - patient
     * @param date - date of the visit
     */
    public Visit(Patient patient, String date) {
        this.patient = patient;
        this.date = date;
        audiology = new Audiology();
    }

    /**
     * Constructor for Visit
     * @param audiology - audiology associated with the visit
     * @param patient - patient
     * @param date - date of the visit
     * @param visitNumber - visit number recorded in ascending order
     */
    public Visit(Audiology audiology, Patient patient, String date, int visitNumber) {
        this.audiology = audiology;
        this.patient = patient;
        this.date = date;
        this.visitNumber = visitNumber;
    }

    /**
     * sets the visit number by checking the patient and auto incrementing the number
     * of the last visit
     */
    public void setVisitNumberFromPatient(){}


    /**
     * getter for audiology
     * @return - audiology
     */
    public Audiology getAudiology() {
        return audiology;
    }

    /**
     * setter for audiology
     * @param audiology - audiology
     */
    public void setAudiology(Audiology audiology) {
        this.audiology = audiology;
    }

    /**
     * getter for patient
     * @return - patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * setter for patient
     * @param patient - patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * getter for date
     * @return - date
     */
    public String getDate() {
        return date;
    }

    /**
     * setter for date
     * @param date - date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * getter for visitNumber
     * @return - visitNumber
     */
    public int getVisitNumber() {
        return visitNumber;
    }

    /**
     * setter for visitNumber
     * @param visitNumber
     */
    public void setVisitNumber(int visitNumber) {
        this.visitNumber = visitNumber;
    }

    private Audiology audiology;
    private Patient patient;
    private String date;
    private int visitNumber;
}
