package src.models;

import java.time.LocalDate;

/**
 * Represents a medication in the pharmacy system.
 * Each medication has an ID, name, quantity, dosage, and expiration date.
 * 
 * @author Stephen
 * @version 1.1
 */
public class Medication {
    private String id;
    private String name;
    private int quantity;
    private String dosage;  // NEW FIELD
    private LocalDate expiryDate;

    /**
     * Constructs a new Medication.
     * 
     * @param id          The unique identifier for the medication.
     * @param name        The name of the medication.
     * @param quantity    The stock quantity.
     * @param dosage      The dosage information (e.g., "500mg").
     * @param expiryDate  The expiration date of the medication.
     */
    public Medication(String id, String name, int quantity, String dosage, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.dosage = dosage;
        this.expiryDate = expiryDate;
    }

    /** Gets the ID of the medication. */
    public String getId() { return id; }

    /** Gets the name of the medication. */
    public String getName() { return name; }

    /** Gets the quantity of the medication. */
    public int getQuantity() { return quantity; }

    /** Gets the dosage of the medication. */
    public String getDosage() { return dosage; }

    /** Gets the expiration date of the medication. */
    public LocalDate getExpiryDate() { return expiryDate; }

    /** Sets a new name for the medication. */
    public void setName(String name) { this.name = name; }

    /** Sets a new stock quantity for the medication. */
    public void setQuantity(int quantity) { this.quantity = quantity; }

    /** Sets a new dosage for the medication. */
    public void setDosage(String dosage) { this.dosage = dosage; }

    /** Returns a string representation of the medication. */
    @Override
    public String toString() {
        return "Medication{" +
            "ID='" + id + '\'' +
            ", Name='" + name + '\'' +
            ", Quantity=" + quantity +
            ", Dosage='" + dosage + '\'' +  // UPDATED
            ", Expiry Date=" + expiryDate +
            '}';
    }
}
