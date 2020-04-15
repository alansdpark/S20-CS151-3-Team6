package edu.sjsu.cs.tinnitus.model;

import java.util.ArrayList;

public class Patient 
{

    /**
     * Default constructor
     */
    public Patient() {}

    /**
     *  Full Constructor
     * @param firstName - first name
     * @param lastName - last name
     * @param address1 - address first line
     * @param address2 - address second line
     * @param city - city
     * @param state - state
     * @param zipCode zip code
     * @param country - country
     * @param birthday - date of birth
     * @param gender - gender
     * @param phoneNumber string representation of phone number
     * @param ssn - social security number
     * @param insuranceNo - insurance number
     * @param occupation - occupation
     * @param workStatus - work status
     * @param educationalDegree - educational degree
     * @param tinnitusCategory - tinnitus category ( 1 - 4)
     * @param treatmentProtocol - treatment protocol
     * @param nextVisit - date of next visit
     * @param visitList - list of logged visists
     * @param medicalHistory - medical history
     */
    public Patient(String firstName, String lastName, String address1,
                   String address2, String city, String state, String zipCode,
                   String country, String birthday, String gender, String phoneNumber,
                   String ssn, String insuranceNo, String occupation, String workStatus,
                   String educationalDegree, int tinnitusCategory, int treatmentProtocol,
                   String nextVisit, ArrayList<Visit> visitList, MedicalHistory medicalHistory) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.insuranceNo = insuranceNo;
        this.occupation = occupation;
        this.workStatus = workStatus;
        this.educationalDegree = educationalDegree;
        this.tinnitusCategory = tinnitusCategory;
        this.treatmentProtocol = treatmentProtocol;
        this.nextVisit = nextVisit;
        this.visitList = visitList;
        this.medicalHistory = medicalHistory;
    }

    /**
     *  Constructor for all non optional info
     * @param firstName - first name
     * @param lastName - last name
     * @param address1 - address first line
     * @param address2 - address second line
     * @param city - city
     * @param state - state
     * @param zipCode zip code
     * @param country - country
     * @param birthday - date of birth
     * @param gender - gender
     * @param phoneNumber string representation of phone number
     * @param ssn - social security number
     * @param insuranceNo - insurance number
     */
    public Patient(String firstName, String lastName, String address1,
                   String address2, String city, String state, String zipCode,
                   String country, String birthday, String gender,
                   String phoneNumber, String ssn, String insuranceNo) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.insuranceNo = insuranceNo;
    }

    /**
     *  Constructor with all optional information
     * @param firstName - first name
     * @param lastName - last name
     * @param address1 - address first line
     * @param address2 - address second line
     * @param city - city
     * @param state - state
     * @param zipCode zip code
     * @param country - country
     * @param birthday - date of birth
     * @param gender - gender
     * @param phoneNumber string representation of phone number
     * @param ssn - social security number
     * @param insuranceNo - insurance number
     * @param occupation - occupation
     * @param workStatus - work status
     * @param educationalDegree - educational degree
     */
    public Patient(String firstName, String lastName, String address1,
                   String address2, String city, String state, String zipCode,
                   String country, String birthday, String gender, String phoneNumber,
                   String ssn, String insuranceNo, String occupation,
                   String workStatus, String educationalDegree) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        this.birthday = birthday;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
        this.insuranceNo = insuranceNo;
        this.occupation = occupation;
        this.workStatus = workStatus;
        this.educationalDegree = educationalDegree;
    }

    /**
     * getter for first name
     * @return - first name
     */
    public String getFirstName() 
    {
        return firstName;
    }

    /**
     * setter for first name
     * @param firstName - first name
     */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    /**
     * getter for last name
     * @return last name
     */
    public String getLastName() 
    {
        return lastName;
    }

    /**
     * setter for last name
     * @param lastName - last name
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /**
     * getter for first line of address
     * @return - address1
     */
    public String getAddress1() 
    {
        return address1;
    }

    /**
     * setter for first line of address
     * @param address1 - address1
     */
    public void setAddress1(String address1) 
    {
        this.address1 = address1;
    }

    /**
     * getter for second line of address
     * @return - address2
     */
    public String getAddress2() 
    {
        return address2;
    }

    /**
     * setter for address2
     * @param address2 - address2
     */
    public void setAddress2(String address2) 
    {
        this.address2 = address2;
    }

    /**
     * getter for city
     * @return - city
     */
    public String getCity() 
    {
        return city;
    }

    /**
     * setter for city
     * @param city - city
     */
    public void setCity(String city) 
    {
        this.city = city;
    }

    /**
     * getter for state
     * @return - state
     */
    public String getState() 
    {
        return state;
    }

    /**
     * setter for state
     * @param state - state
     */
    public void setState(String state) 
    {
        this.state = state;
    }

    /**
     * getter for zip code
     * @return - zip code
     */
    public String getZipCode() 
    {
        return zipCode;
    }

    /**
     * setter for zip code
     * @param zipCode - zip code
     */
    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }

    /**
     * getter for country
     * @return - country
     */
    public String getCountry() 
    {
        return country;
    }

    /**
     * setter for country
     * @param country - country
     */
    public void setCountry(String country) 
    {
        this.country = country;
    }

    /**
     * getter for birthday
     * @return - birthday
     */
    public String getBirthday() 
    {
        return birthday;
    }

    /**
     * setter for birthday
     * @param birthday - birthday
     */
    public void setBirthday(String birthday) 
    {
        this.birthday = birthday;
    }

    /**
     * getter for gender
     * @return gender
     */
    public String getGender() 
    {
        return gender;
    }

    /**
     * setter for gender
     * @param gender - gender
     */
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    /**
     * getter for phone number
     * @return - phoneNumber
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
     * setter for phoneNumber
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * getter for social security number
     * @return - ssn
     */
    public String getSsn() 
    {
        return ssn;
    }

    /**
     * setter for ssn
     * @param ssn - ssn
     */
    public void setSsn(String ssn) 
    {
        this.ssn = ssn;
    }

    /**
     *  getter for insurance number
     * @return - insurance number
     */
    public String getInsuranceNo() 
    {
        return insuranceNo;
    }

    /**
     * setter for insurance number
     * @param insuranceNo
     */
    public void setInsuranceNo(String insuranceNo) 
    {
        this.insuranceNo = insuranceNo;
    }

    /**
     * getter for occupation
     * @return - occupation
     */
    public String getOccupation() 
    {
        return occupation;
    }

    /**
     * setter for occupation
     * @param occupation - occupation
     */
    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    /**
     * getter for work status
     * @return - workStatus
     */
    public String getWorkStatus() 
    {
        return workStatus;
    }

    /**
     * setter for work status
     * @param workStatus - work status
     */
    public void setWorkStatus(String workStatus) 
    {
        this.workStatus = workStatus;
    }

    /**
     * getter for educational degree
     * @return - educationalDegree
     */
    public String getEducationalDegree() 
    {
        return educationalDegree;
    }

    /**
     * setter for educationalDegree
     * @param educationalDegree - educationalDegree
     */
    public void setEducationalDegree(String educationalDegree) 
    {
        this.educationalDegree = educationalDegree;
    }

    /**
     * getter for tinnitus category
     * @return tinnitus category
     */
    public int getTinnitusCategory() 
    {
        return tinnitusCategory;
    }

    /**
     * setter for tinnitus category
     * @param tinnitusCategory - tinnitusCategory
     */
    public void setTinnitusCategory(int tinnitusCategory) 
    {
        this.tinnitusCategory = tinnitusCategory;
    }

    /**
     * getter for treatment protocol
     * @return - treatmentProtocol
     */
    public int getTreatmentProtocol() 
    {
        return treatmentProtocol;
    }

    /**
     * setter for treatment protocol
     * @param treatmentProtocol - treatmentProtocol
     */
    public void setTreatmentProtocol(int treatmentProtocol) 
    {
        this.treatmentProtocol = treatmentProtocol;
    }

    /**
     * getter for date of next visit
     * @return - nextVisit
     */
    public String getNextVisit() 
    {
        return nextVisit;
    }

    /**
     * setter for nextVisit
     * @param nextVisit - nextVisit
     */
    public void setNextVisit(String nextVisit) 
    {
        this.nextVisit = nextVisit;
    }

    /**
     * getter for visit list
     * @return - visitList
     */
    public ArrayList<Visit> getVisitList() 
    {
        return visitList;
    }

    /**
     * setter for visitList
     * @param visitList - visitList
     */
    public void setVisitList(ArrayList<Visit> visitList) 
    {
        this.visitList = visitList;
    }

    /**
     * getter for medicalHistory
     * @return - medicalHistory
     */
    public MedicalHistory getMedicalHistory() 
    {
        return medicalHistory;
    }

    /**
     * setter for medicalHistory
     * @param medicalHistory - medicalHistory
     */
    public void setMedicalHistory(MedicalHistory medicalHistory) 
    {
        this.medicalHistory = medicalHistory;
    }

    /**
     * adds a visit to visit list
     * @param visit - visit to be added
     */
    public void addVisit(Visit visit)
    {
        visitList.add(visit);
    }

    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String birthday;
    private String gender;
    private String phoneNumber;
    private String ssn;
    private String insuranceNo;
    private String occupation;
    private String workStatus;
    private String educationalDegree;

    private int tinnitusCategory;
    private int treatmentProtocol;
    private String nextVisit;

    private ArrayList<Visit> visitList;
    private MedicalHistory medicalHistory;
}
