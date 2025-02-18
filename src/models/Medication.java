package src.models;

import java.time.LocalDate;

/**
 * The Medication class represents a drug in the pharmacy system.
 * It includes attributes for identification, dosage, stock quantity, and expiration date.
 * 
 * @author Stephen
 * @version 1.0
 */
public class Medication {
    private String id;
    private String name;
    private int quantity;
    private LocalDate expiryDate;

    /**
     * Constructs a new Medication object.
     * 
     * @param id         The unique identifier for the medication.
     * @param name       The name of the medication.
     * @param quantity   The stock quantity of the medication.
     * @param expiryDate The expiration date of the medication.
     */
    public Medication(String id, String name, int quantity, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    /**
     * Gets the name of the medication.
     * 
     * @return The name of the medication.
     */
    public String getName() {
        return name;
    }

      /**
     * Sets the quantity of the medication in stock.
     * 
     * @param quantity The new quantity value.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


    // Getters & Setters (To be implemented)
