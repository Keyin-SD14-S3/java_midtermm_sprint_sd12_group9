package src.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The MedicationTrackingSystem class manages the pharmacy system, including
 * medications, doctors, and patients. It provides functionality for:
 * - Restocking medications
 * - Checking for expired medications
 * - Managing lists of patients, doctors, and medications
 * - Generating reports
 * 
 * @author Stephen
 * @version 1.0
 */
public class MedicationTrackingSystem {

    private List<Medication> medications;
    private List<Doctor> doctors;
    private List<Patient> patients;

    /**
     * Constructs a new MedicationTrackingSystem and initializes empty lists.
     */
    public MedicationTrackingSystem() {
        this.medications = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

}