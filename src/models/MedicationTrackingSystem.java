package src.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The MedicationTrackingSystem class manages patients, doctors, medications, and prescriptions.
 * It provides functionalities such as searching, adding, editing, deleting, and generating reports.
 * 
 * Features include:
 * - Searching for medications, patients, and doctors
 * - Assigning patients to doctors
 * - Accepting prescriptions and linking them to patients
 * - Editing and deleting records
 * - Generating system-wide reports
 * - Checking and displaying expired medications
 * - Restocking medications
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

    // ========================== Search Functions ==========================

    /**
     * Searches for a medication by name.
     * 
     * @param name The name of the medication to search for.
     */
    public void searchMedicationByName(String name) {
        for (Medication med : medications) {
            if (med.getName().equalsIgnoreCase(name)) {
                System.out.println("Medication Found: " + med);
                return;
            }
        }
        System.out.println("Medication not found.");
    }

    /**
     * Adds a new medication to the system.
     * 
     * @param medication The medication to be added.
     */
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication added: " + medication.getName());
    }

}