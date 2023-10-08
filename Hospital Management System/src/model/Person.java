package model;

public class Person {
    // Fields to store personal information
    String name;       // Person's name
    String address;    // Person's address
    String phNumber;   // Person's phone number

    // Default constructor
    public Person() {
        this.name = "";
        this.address = "";
        this.phNumber = "";
    }

    // Constructor to initialize personal information
    public Person(String name, String address, String phNumber) {
        this.name = name;
        this.address = address;
        this.phNumber = phNumber;
    }

    // Getter method to retrieve the person's name
    public String getName() {
        return name;
    }

    // Setter method to set the person's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the person's address
    public String getAddress() {
        return address;
    }

    // Setter method to set the person's address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method to retrieve the person's phone number
    public String getPhNumber() {
        return phNumber;
    }

    // Setter method to set the person's phone number
    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }
}
