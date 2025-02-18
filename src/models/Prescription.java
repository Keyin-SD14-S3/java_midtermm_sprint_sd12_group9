package src.models;

public class Prescription {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private String prescriptionExpiry;

    public Prescription(String id, Doctor doctor, Patient patient, Medication medication, String prescriptionExpiry) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.prescriptionExpiry = prescriptionExpiry;
    }

        /**
     * 
    * 
    * @author Stephen
    * @version 1.0
    */

    // Getters & Setters (To be implemented)
}