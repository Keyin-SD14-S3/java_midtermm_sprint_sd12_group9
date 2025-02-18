package src.models;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
    private String specialization;
    private List<Patient> patients;

    public Doctor(String id, String name, int age, String phoneNumber, String specialization) {
        super(id, name, age, phoneNumber);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

        /**
     * 
    * 
    * @author Stephen
    * @version 1.0
    */

    // Getters & Setters (To be implemented)
}