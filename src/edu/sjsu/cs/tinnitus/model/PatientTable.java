package model;

public class PatientTable 
{
    // Reference to all patients.
    private ArrayList<Patient> patients;

    public PatientTable()
    {
        patients = new ArrayList<>();
    }

    /**
     * Constructor for the System
     * @param patientList - list of patients
     */
    public PatientTable(ArrayList<Patient> patientList) {
        this.patients = patientList;
    }

    /**
     * Getter for patientList
     * @return - patientList
     */
    public ArrayList<Patient> getPatientList() {
        return patients;
    }

    /**
     * Setter for patientList
     * @param patientList - patientList
     */
    public void setPatientList(ArrayList<Patient> patientList) {
        this.patients = patientList;
    }

    /**
     * Adds a patient to the patientList
     */
    public void addPatient(Patient patient){
        patients.add(patient);
    }
}