package src.models;

import java.time.LocalDate;

/**
 * Represents a prescription in the pharmacy system.
 * Each prescription is linked to a doctor, patient, and medication.
 * 
 * @author Stephen
 * @version 1.0
 */
public class Prescription {
    private String id;
    private Doctor doctor;
    private Patient patient;
    private Medication medication;
    private LocalDate prescriptionExpiry;

    /**
     * Constructs a new Prescription.
     * 
     * @param id                The unique identifier for the prescription.
     * @param doctor            The doctor issuing the prescription.
     * @param patient           The patient receiving the prescription.
     * @param medication        The prescribed medication.
     * @param prescriptionExpiry The expiration date of the prescription.
     */
    public Prescription(String id, Doctor doctor, Patient patient, Medication medication, LocalDate prescriptionExpiry) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.medication = medication;
        this.prescriptionExpiry = prescriptionExpiry;
    }

    /**
     * Gets the ID of the prescription.
     * 
     * @return The prescription ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the doctor issuing the prescription.
     * 
     * @return The doctor.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Gets the patient assigned to the prescription.
     * 
     * @return The patient.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Gets the prescribed medication.
     * 
     * @return The medication.
     */
    public Medication getMedication() {
        return medication;
    }

    /**
     * Gets the expiration date of the prescription.
     * 
     * @return The prescription expiration date.
     */
    public LocalDate getPrescriptionExpiry() {
        return prescriptionExpiry;
    }

    /**
     * Returns a string representation of the prescription.
     * 
     * @return A formatted string containing prescription details.
     */
    @Override
    public String toString() {
        return "Prescription{" +
            "ID='" + id + '\'' +
            ", Doctor='" + doctor.getName() + '\'' +
            ", Patient='" + patient.getName() + '\'' +
            ", Medication='" + medication.getName() + '\'' +
            ", Expiry Date=" + prescriptionExpiry +
            '}';
    }
}
