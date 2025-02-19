package src.models;

/**
 * Represents a generic person in the pharmacy system.
 * This class serves as the base for Doctor and Patient.
 * 
 * @author Stephen
 * @version 1.0
 */
public class Person {
    private String id;
    private String name;
    private int age;
    private String phoneNumber;

    /**
     * Constructs a Person object.
     * 
     * @param id          The unique identifier for the person.
     * @param name        The person's name.
     * @param age         The person's age.
     * @param phoneNumber The person's contact number.
     */
    public Person(String id, String name, int age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }


    /** Gets the ID of the person. */
    public String getId() { return id; }

    /** Gets the name of the person. */
    public String getName() { return name; }

    /** Gets the age of the person. */
    public int getAge() { return age; }

    /** Gets the phone number of the person. */
    public String getPhoneNumber() { return phoneNumber; }

    /** Sets the name of the person. */
    public void setName(String name) { this.name = name; }

    /** Sets the age of the person. */
    public void setAge(int age) { this.age = age; }

    /** Sets the phone number of the person. */
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
