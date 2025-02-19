import src.models.MedicationTrackingSystem;
import src.models.Medication;
import src.models.Doctor;
import src.models.Patient;
import src.models.Prescription;

import java.time.LocalDate;

/**
 * A test class for MedicationTrackingSystem, demonstrating its core functionalities.
 * This includes adding medications, searching, restocking, and generating reports.
 * 
 * @author Stephen
 * @version 1.0
 */
public class TestMedicationTrackingSystem {
    public static void main(String[] args) {
        // Create the system instance
        MedicationTrackingSystem system = new MedicationTrackingSystem();

        // ======= TESTING MEDICATION MANAGEMENT =======
        System.out.println("\n=== Adding Medications ===");
        Medication med1 = new Medication("M101", "Buckleys", 20, LocalDate.of(2025, 5, 10));
        Medication med2 = new Medication("M102", "Aspirin", 15, LocalDate.of(2026, 8, 5));
        Medication med3 = new Medication("M103", "Ibuprofen", 30, LocalDate.of(2024, 12, 20));

        system.addMedication(med1);
        system.addMedication(med2);
        system.addMedication(med3);
        
        // Searching for existing medication
        system.searchMedicationByName("Ibuprofen");
        
        // Searching for a medication that doesn't exist
        system.searchMedicationByName("Vitamin C");

        // ======= TESTING PATIENT AND DOCTOR MANAGEMENT =======
        System.out.println("\n=== Adding Doctor and Patient ===");
        Doctor doc1 = new Doctor("D001", "Dr. Smith", 45, "555-1234", "Cardiology");
        Patient pat1 = new Patient("P001", "John Doe", 30, "555-5678");

        system.getDoctors().add(doc1);
        system.getPatients().add(pat1);

        // Assign patient to doctor
        system.addPatientToDoctor("D001", pat1);
    }
}