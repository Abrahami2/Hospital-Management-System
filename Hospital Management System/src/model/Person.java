package model;

/**
 * Represents a person with basic personal information. Superclass for Doctor and Patient.
 * This class stores details such as the person's name, address, and phone number.
 */
public class Person {
    // Fields to store personal information
    String name;       // Person's name
    String address;    // Person's address
    String phNumber;   // Person's phone number

    /**
     * Default constructor.
     * Initializes a new Person with empty fields.
     */
    public Person() {
        this.name = "";
        this.address = "";
        this.phNumber = "";
    }

    /**
     * Constructor to initialize a person with name, address, and phone number.
     *
     * @param name     The person's name.
     * @param address  The person's address.
     * @param phNumber The person's phone number.
     */
    public Person(String name, String address, String phNumber) {
        this.name = name;
        this.address = address;
        this.phNumber = phNumber;
    }

    /**
     * Gets the person's name.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person's name.
     *
     * @param name The name to set for the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the person's address.
     *
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the person's address.
     *
     * @param address The address to set for the person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the person's phone number.
     *
     * @return The phone number of the person.
     */
    public String getPhNumber() {
        return phNumber;
    }

    /**
     * Sets the person's phone number.
     *
     * @param phNumber The phone number to set for the person.
     */
    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }
}
