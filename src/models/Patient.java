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
        return super.getName();
    }

    /**
     * Sets the patient's name.
     * 
     * @param name The new name of the patient.
     */
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * Gets the patient's age.
     * 
     * @return The age of the patient.
     */
    public int getAge() {
        return super.getAge();
    }

    /**
     * Sets the patient's age.
     * 
     * @param age The new age of the patient.
     */
    public void setAge(int age) {
        super.setAge(age);
    }

    /**
     * Gets the patient's phone number.
     * 
     * @return The phone number of the patient.
     */
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    /**
     * Sets the patient's phone number.
     * 
     * @param phoneNumber The new phone number of the patient.
     */
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    /**
     * Adds a prescription to the patient's list.
     * 
     * @param prescription The prescription to add.
     */
    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

    /**
     * Gets the list of prescriptions assigned to the patient.
     * 
     * @return The list of prescriptions.
     */
    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    /**
     * Returns a string representation of the patient.
     * 
     * @return A formatted string containing patient details.
     */
    @Override
    public String toString() {
        return "Patient{" +
            "ID='" + getId() + '\'' +
            ", Name='" + getName() + '\'' +
            ", Age=" + getAge() +
            ", Phone Number='" + getPhoneNumber() + '\'' +
            ", Prescriptions Count=" + prescriptions.size() +
            '}';
    }
}