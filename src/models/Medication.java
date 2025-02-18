package src.models;

import java.util.Date;

public class Medication {
    private String id;
    private String name;
    private int dosage;
    private int quantityInStock;
    private int maxStock;
    private Date expiryDate;

    public Medication(String id, String name, int dosage, int quantityInStock, int maxStock, Date expiryDate) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.quantityInStock = quantityInStock;
        this.maxStock = maxStock;
        this.expiryDate = expiryDate;
    }

    // Getters & Setters (To be implemented)
}