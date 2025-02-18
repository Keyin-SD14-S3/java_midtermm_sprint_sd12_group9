package src.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a doctor in the pharmacy system.
 * A doctor has a specialization and manages multiple patients.
 * 
 * @author Stephen
 * @version 1.0
 */
public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients;

    /**
     * Constructs a new Doctor with the given details.
     * 
     * @param id            The unique identifier for the doctor.
     * @param name          The name of the doctor.
     * @param age           The age of the doctor.
     * @param phoneNumber   The doctor's contact number.
     * @param specialization The doctor's field of specialization.
     */
    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber); // Calls the constructor of Person
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    /**
     * Gets the doctor's name.
     * 
     * @return The name of the doctor.
     */
    public String getName() {
        return name;
    }


    // Getters & Setters (To be implemented)
}