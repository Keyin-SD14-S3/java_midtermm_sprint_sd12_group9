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
     * Gets the doctor's specialization.
     * 
     * @return The specialization of the doctor.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Adds a patient to the doctor's list.
     * 
     * @param patient The patient to be added.
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added to Doctor " + this.getName());
    }

    /**
     * Gets the list of patients assigned to this doctor.
     * 
     * @return The list of patients.
     */
    public List<Patient> getPatients() {
        return patients;
    }

    /**
     * Returns a string representation of the doctor.
     * 
     * @return A formatted string containing doctor details.
     */
    @Override
    public String toString() {
        return "Doctor{" +
            "ID='" + getId() + '\'' +
            ", Name='" + getName() + '\'' +
            ", Specialization='" + specialization + '\'' +
            ", Patients Assigned=" + patients.size() +
            '}';
    }
}