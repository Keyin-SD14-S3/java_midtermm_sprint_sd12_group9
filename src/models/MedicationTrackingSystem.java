package src.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
 * @version 1.8
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
     * Searches for a patient by name.
     * 
     * @param name The name of the patient to search for.
     */
    public void searchPatientByName(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                System.out.println("Patient Found: " + patient);
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    /**
     * Searches for a doctor by name.
     * 
     * @param name The name of the doctor to search for.
     */
    public void searchDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                System.out.println("Doctor Found: " + doctor);
                return;
            }
        }
        System.out.println("Doctor not found.");
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

    /**
     * Assigns a patient to a doctor using the doctor's ID.
     * 
     * @param doctorId The ID of the doctor.
     * @param patient  The patient to add.
     */
    public void addPatientToDoctor(String doctorId, Patient patient) {
        for (Doctor doc : doctors) {
            if (doc.getId().equals(doctorId)) {
                doc.addPatient(patient);
                System.out.println("Patient added to doctor's list.");
                return;
            }
        }
        System.out.println("Doctor not found.");
    }

    /**
     * Retrieves the list of doctors.
     * 
     * @return The list of doctors.
     */
    public List<Doctor> getDoctors() {
        return doctors;
    }

    /**
     * Retrieves the list of patients.
     * 
     * @return The list of patients.
     */
    public List<Patient> getPatients() {
        return patients;
    }
}
