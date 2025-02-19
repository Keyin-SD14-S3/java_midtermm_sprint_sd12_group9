package src.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patient in the pharmacy system.
 * A patient can have multiple prescriptions.
 * 
 * @author Stephen
 * @version 1.0
 */

 public class Patient extends Person {
    private List<Prescription> prescriptions;

    /**
     * Constructs a new Patient with the given details.
     * 
     * @param id          The unique identifier for the patient.
     * @param name        The name of the patient.
     * @param age         The age of the patient.
     * @param phoneNumber The patient's contact number.
     */
    public Patient(String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber); // Calls the constructor of Person
        this.prescriptions = new ArrayList<>();
    }

    /**
     * Gets the patient's name.
     * 
     * @return The name of the patient.
     */
    public String getName() {
        return super.getName(); // Calls getName() from Person
    }

    // Getters & Setters (To be implemented)
}