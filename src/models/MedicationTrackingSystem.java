package src.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


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
    private List<Prescription> prescriptions;

    /**
     * Constructs a new MedicationTrackingSystem and initializes empty lists.
     */
    public MedicationTrackingSystem() {
        this.medications = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
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

     /**
     * Edits a medication's details by ID.
     * 
     * @param medicationId The ID of the medication to edit.
     * @param newName The new name of the medication.
     * @param newQuantity The new quantity.
     */
    public void editMedication(String medicationId, String newName, int newQuantity) {
        for (Medication med : medications) {
            if (med.getId().equals(medicationId)) {
                med.setName(newName);
                med.setQuantity(newQuantity);
                System.out.println("Medication updated successfully.");
                return;
            }
        }
        System.out.println("Medication not found.");
    }

    /**
     * Deletes a medication from the system by ID.
     * 
     * @param medicationId The ID of the medication to delete.
     */
    public void deleteMedication(String medicationId) {
        Iterator<Medication> iterator = medications.iterator();
        while (iterator.hasNext()) {
            Medication med = iterator.next();
            if (med.getId().equals(medicationId)) {
                iterator.remove();
                System.out.println("Medication deleted successfully.");
                return;
            }
        }
        System.out.println("Medication not found.");
    }

    /**
     * Deletes a patient by ID.
     * 
     * @param patientId The ID of the patient to delete.
     */
    public void deletePatient(String patientId) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            if (patient.getId().equals(patientId)) {
                iterator.remove();
                System.out.println("Patient deleted successfully.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    /**
     * Deletes a doctor by ID.
     * 
     * @param doctorId The ID of the doctor to delete.
     */
    public void deleteDoctor(String doctorId) {
        Iterator<Doctor> iterator = doctors.iterator();
        while (iterator.hasNext()) {
            Doctor doctor = iterator.next();
            if (doctor.getId().equals(doctorId)) {
                iterator.remove();
                System.out.println("Doctor deleted successfully.");
                return;
            }
        }
        System.out.println("Doctor not found.");
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
     * Accepts a prescription and links it to the patient.
     * 
     * @param prescriptionId    The ID of the prescription.
     * @param doctorId          The ID of the prescribing doctor.
     * @param patientId         The ID of the patient.
     * @param medicationId      The ID of the prescribed medication.
     * @param prescriptionExpiry The expiration date of the prescription.
     */
    public void acceptPrescription(String prescriptionId, String doctorId, String patientId, String medicationId, LocalDate prescriptionExpiry) {
        Doctor doctor = null;
        Patient patient = null;
        Medication medication = null;

        for (Doctor doc : doctors) {
            if (doc.getId().equals(doctorId)) {
                doctor = doc;
                break;
            }
        }

        for (Patient pat : patients) {
            if (pat.getId().equals(patientId)) {
                patient = pat;
                break;
            }
        }

        for (Medication med : medications) {
            if (med.getId().equals(medicationId)) {
                medication = med;
                break;
            }
        }

        if (doctor != null && patient != null && medication != null) {
            Prescription prescription = new Prescription(prescriptionId, doctor, patient, medication, prescriptionExpiry);
            prescriptions.add(prescription);
            patient.addPrescription(prescription);
            System.out.println("Prescription successfully added for patient " + patient.getName() + 
                   ", Medication: " + medication.getName() + 
                   ", Prescribed by: " + doctor.getName());

        } else {
            System.out.println("Error: Doctor, patient, or medication not found.");
        }
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

    /**
     * Retrieves the list of medications.
     * 
     * @return The list of medications.
     */
    public List<Medication> getMedications() {
        return medications;
    }

    /**
     * Retrieves the list of prescriptions.
     * 
     * @return The list of prescriptions.
     */
    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

     /**
     * Generates a system-wide report of all data.
     */
    public void generateSystemReport() {
        System.out.println("\n=== SYSTEM REPORT ===");
        
        // List all medications
        System.out.println("\nMedications:");
        if (medications.isEmpty()) {
            System.out.println("No medications available.");
        } else {
            for (Medication med : medications) {
                System.out.println(med);
            }
        }
    
        // List all doctors
        System.out.println("\nDoctors:");
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
        } else {
            for (Doctor doc : doctors) {
                System.out.println(doc);
            }
        }
    
        // List all patients
        System.out.println("\nPatients:");
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
        } else {
            for (Patient pat : patients) {
                System.out.println(pat);
            }
        }
    
        // List all prescriptions
        System.out.println("\nPrescriptions:");
        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions available.");
        } else {
            for (Prescription presc : prescriptions) {
                System.out.println(presc);
            }
        }
    } 

         /**
     * Checks for expired medications and displays them.
     */
    public void checkForExpiredMedications() {
        System.out.println("\n=== Expired Medications Check ===");
        LocalDate today = LocalDate.now();
        boolean foundExpired = false;

        for (Medication med : medications) {
            if (med.getExpiryDate().isBefore(today)) {
                System.out.println("Expired Medication: " + med);
                foundExpired = true;
            }
        }
        
        if (!foundExpired) {
            System.out.println("No expired medications found.");
        }
    }

        /**
     * Prints a list of all prescriptions issued by a specific doctor.
     * 
     * @param doctorId The ID of the doctor whose prescriptions are to be listed.
     */
    public void printPrescriptionsByDoctor(String doctorId) {
        System.out.println("\n=== Prescriptions Issued by Doctor ID: " + doctorId + " ===");
        boolean found = false;
        
        for (Prescription presc : prescriptions) {
            if (presc.getDoctor().getId().equals(doctorId)) {
                System.out.println(presc);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No prescriptions found for this doctor.");
        }
    }

}