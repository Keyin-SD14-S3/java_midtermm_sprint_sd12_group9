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

        // ======= TESTING MEDICATION MANAGEMENT adding dosage=======
        System.out.println("\n=== Adding Medications ===");
        Medication med1 = new Medication("M101", "Buckleys", 20, "10ml", LocalDate.of(2025, 5, 10));
        Medication med2 = new Medication("M102", "Aspirin", 15, "500mg", LocalDate.of(2023, 8, 5));
        Medication med3 = new Medication("M103", "Ibuprofen", 30, "200mg", LocalDate.of(2024, 12, 20));

        system.addMedication(med1);
        system.addMedication(med2);
        system.addMedication(med3);
        
         // Deleting a medication
         System.out.println("\n=== Deleting Medication ===");
         system.deleteMedication("M102");
 
         // ======= TESTING PATIENT AND DOCTOR MANAGEMENT =======
         System.out.println("\n=== Adding Doctors and Patients ===");
         Doctor doc1 = new Doctor("D001", "Dr. Smith", 45, "555-1234", "Cardiology");
         Doctor doc2 = new Doctor("D002", "Dr. Jones", 50, "555-5678", "Neurology");
         Doctor doc3 = new Doctor("D003", "Dr. Lee", 38, "555-9012", "Pediatrics");
 
         Patient pat1 = new Patient("P001", "John Doe", 30, "555-1111");
         Patient pat2 = new Patient("P002", "Jane Doe", 28, "555-2222");
         Patient pat3 = new Patient("P003", "Alice Brown", 35, "555-3333");
 
         system.getDoctors().add(doc1);
         system.getDoctors().add(doc2);
         system.getDoctors().add(doc3);
         
         system.getPatients().add(pat1);
         system.getPatients().add(pat2);
         system.getPatients().add(pat3);
 
         // Assign patients to doctors
         system.addPatientToDoctor("D001", pat1);
         system.addPatientToDoctor("D002", pat2);
         system.addPatientToDoctor("D003", pat3);

          // Editing a medication
        System.out.println("\n=== Editing Medication ===");
        system.editMedication("M103", "Ibuprofen Extra Strength", 50, "25mg");
 
         // Deleting a patient
         System.out.println("\n=== Deleting Patient ===");
         system.deletePatient("P001");
 
         // Deleting a doctor
         System.out.println("\n=== Deleting Doctor ===");
         system.deleteDoctor("D002"); 

       
        // ======= GENERATING SYSTEM REPORT =======
        System.out.println("\n=== Generating System Report ===");
        system.generateSystemReport();
        
        // ======= CHECKING FOR EXPIRED MEDICATIONS =======
        System.out.println("\n=== Checking for Expired Medications ===");
        system.checkForExpiredMedications();

         // Accepting prescriptions
         System.out.println("\n=== Accepting Prescriptions ===");
         system.acceptPrescription("PRESC001", "D001", "P001", "M101", LocalDate.of(2025, 6, 15));
         system.acceptPrescription("PRESC002", "D002", "P002", "M103", LocalDate.of(2026, 1, 10));
         system.acceptPrescription("PRESC003", "D001", "P003", "M101", LocalDate.of(2025, 11, 20));
 
         // ======= PRINT PRESCRIPTIONS BY DOCTOR =======
         System.out.println("\n=== Printing Prescriptions by Dr. Smith (D001) ===");
         system.printPrescriptionsByDoctor("D001");


        // ======= RESTOCKING MEDICATIONS =======
        System.out.println("\n=== Restocking Medications ===");
        system.restockMedication("M101", 10); // Add 10 units to Buckleys
        system.restockMedication("M103", 20); // Add 20 units to Ibuprofen Extra Strength
        
        // ======= TESTING EDITING PATIENT AND DOCTOR =======
        System.out.println("\n=== Editing Patient ===");
        system.editPatient("P002", "Johnathan Doe", 31, "555-9999");

        System.out.println("\n=== Editing Doctor ===");
        system.editDoctor("D001", "Dr. John Smith", 46, "555-8888", "General Surgery");

        // Verify updates by printing the updated patient and doctor details
        System.out.println("\n=== Updated Patient Details ===");
        for (Patient pat : system.getPatients()) {
            if (pat.getId().equals("P001")) {
                System.out.println(pat);
            }
        }

        System.out.println("\n=== Updated Doctor Details ===");
        for (Doctor doc : system.getDoctors()) {
            if (doc.getId().equals("D001")) {
                System.out.println(doc);
            }
        }

    }
}
