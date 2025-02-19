/*

This is an example menu that is set up to show you a way of structuring your project.
this doesn't have all requirements in it please refer to the sprint doc to view all requirements
 */

package src.models;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        MedicationTrackingSystem system = new MedicationTrackingSystem();
        boolean exit = false;


        while (!exit){
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("=====Welcome To The Pharmacy Med Tracking System=====");
            System.out.println("What would you like to do? ");
            System.out.println("1: Add A New Patient");
            System.out.println("2: Add A New Doctor");
            System.out.println("3: Add A New Medication To The Pharmacy");
            System.out.println("4: Print System Report");
            System.out.println("5: Check If Meds Are Expired");
            System.out.println("6: Process A New Prescription");
            System.out.println("7: Print All Scripts For Specific Doctor");
            System.out.println("8: Restock the drugs in the pharmacy");
            System.out.println("9: print all scripts for specific patient");
            System.out.println("10: Delete Patient");
            System.out.println("11: Delete Doctor");
            System.out.println("12: Delete Medication");
            System.out.println("13: Edit Patient");
            System.out.println("14: Edit Doctor");
            System.out.println("15: Edit Medication");
            System.out.println("16: Exit");

            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addPatient(scanner,system);
                    break;
                case 2:
                    addANewDoctor(scanner,system);
                    break;
                case 3:
                    addNewMedicationToPharmacy(scanner,system);
                    break;
                case 4:
                    printPharmacyReport(system);
                    break;
                case 5:
                    checkExpiredMeds(system);
                    break;
                case 6:
                    processANewScript(scanner,system);
                    break;
                case 7:
                    printScriptsForSpecificDoctor(scanner,system);
                    break;
                case 8:
                    restockPharmacyDrugs(scanner,system);
                    break;
                case 9:
                    printAllScriptsForPatientByName(scanner,system);
                    break;
                case 10:
                    deletePatient(scanner, system);
                    break;
                case 11:
                    deleteDoctor(scanner, system);
                    break;
                case 12:
                    deleteMedication(scanner, system);
                    break;
                case 13:
                    editPatient(scanner, system);
                    break;
                case 14:
                    editDoctor(scanner, system);
                    break;
                case 15:
                    editMedication(scanner, system);
                    break;
                case 16:
                    exit = true;
                    System.out.println("Exiting The System! Good Bye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }



    private static void addPatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.println("Enter Patient ID: ");
        String id = scanner.nextLine();

        System.out.println("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Patient Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Patient Phone Number: ");
        String phone = scanner.nextLine();

        Patient patient = new Patient(id, name, age, phone);
        system.addPatient(patient);

        System.out.print("Enter Doctor ID to assign the patient to: ");
        String doctorId = scanner.nextLine();


        system.addPatientToDoctor(doctorId, patient);
        System.out.println("Patient added successfully!");

    }

    private static void addANewDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Doctor Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Doctor Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, age, phoneNumber, specialization);
        system.addDoctor(doctor);
        System.out.println("Doctor added successfully!");
    }

    private static void addNewMedicationToPharmacy(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Medication ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Medication Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Dosage: ");
        String dosage = scanner.nextLine();

        System.out.print("Enter Quantity in Stock: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        LocalDate expiryDate = LocalDate.parse(scanner.nextLine());

        Medication medication = new Medication(id, name, quantity, dosage, expiryDate);
        system.addMedication(medication);
        System.out.println("Medication added successfully!");
    }

    private static void printPharmacyReport(MedicationTrackingSystem system) {
        system.generateSystemReport();
    }

    private static void checkExpiredMeds(MedicationTrackingSystem system) {
        system.checkForExpiredMedications();
    }

    private static void processANewScript(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Prescription ID: ");
        String prescriptionId = scanner.nextLine();

        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();

        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();

        System.out.print("Enter Medication ID: ");
        String medicationId = scanner.nextLine();

        System.out.print("Enter Prescription Expiry Date (YYYY-MM-DD): ");
        LocalDate prescriptionExpiry = LocalDate.parse(scanner.nextLine());

        system.acceptPrescription(prescriptionId, doctorId, patientId, medicationId, prescriptionExpiry);
        System.out.println("Prescription processed successfully!");

    }

    private static void printScriptsForSpecificDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        system.printPrescriptionsByDoctor(doctorId);
    }

    private static void restockPharmacyDrugs(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Medication ID to restock: ");
        String medicationId = scanner.nextLine();

        System.out.print("Enter quantity to add: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        system.restockMedication(medicationId, quantity);  // Pass arguments here
        System.out.println("Medications restocked successfully!");
    }

    private static void printAllScriptsForPatientByName(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        system.searchPatientByName(name);
    }


    private static void deletePatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Patient ID to delete: ");
        String patientId = scanner.nextLine();
        system.deletePatient(patientId);
        System.out.println("Patient deleted successfully!");
    }

    private static void deleteDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Doctor ID to delete: ");
        String doctorId = scanner.nextLine();
        system.deleteDoctor(doctorId);
        System.out.println("Doctor deleted successfully!");
    }

    private static void deleteMedication(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Medication ID to delete: ");
        String medicationId = scanner.nextLine();
        system.deleteMedication(medicationId);
        System.out.println("Medication deleted successfully!");
    }

    private static void editPatient(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Patient ID to edit: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhone = scanner.nextLine();

        system.editPatient(patientId, newName, newAge, newPhone);
        System.out.println("Patient updated successfully!");
    }

    private static void editDoctor(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Doctor ID to edit: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        System.out.print("Enter new specialization: ");
        String newSpecialization = scanner.nextLine();

        system.editDoctor(doctorId, newName, newAge, newPhone, newSpecialization);
        System.out.println("Doctor updated successfully!");
    }

    private static void editMedication(Scanner scanner, MedicationTrackingSystem system) {
        System.out.print("Enter Medication ID to edit: ");
        String medicationId = scanner.nextLine();
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new dosage: ");
        String newDosage = scanner.nextLine();
        System.out.print("Enter new quantity: ");
        int newQuantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new expiry date (YYYY-MM-DD): ");
        LocalDate newExpiry = LocalDate.parse(scanner.nextLine());

        system.editMedication(medicationId, newName, newQuantity, newDosage, newExpiry);
        System.out.println("Medication updated successfully!");
    }


}
