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
        Medication med2 = new Medication("M102", "Aspirin", 15, LocalDate.of(2026, 8, 5)); // Expired
        Medication med3 = new Medication("M103", "Ibuprofen", 30, LocalDate.of(2024, 12, 20));

        system.addMedication(med1);
        system.addMedication(med2);
        system.addMedication(med3);
    }
}