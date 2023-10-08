package model;

public class Patient extends Person {
    // Fields to store patient information
    int id;         // Patient's ID
    String disease; // Patient's disease or condition

    // Constructor to initialize patient information
    public Patient(int id, String disease) {
        this.id = id;
        this.disease = disease;
    }

    // Constructor to initialize patient information along with personal details
    public Patient(int id, String name, String address, String phNumber, String disease) {
        super(name, address, phNumber);  // Call the constructor of the superclass (Person)
        this.id = id;
        this.disease = disease;
    }

    // Getter method to retrieve the patient's ID
    public int getId() {
        return id;
    }

    // Setter method to set the patient's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method to retrieve the patient's disease or condition
    public String getDisease() {
        return disease;
    }

    // Setter method to set the patient's disease or condition
    public void setDisease(String disease) {
        this.disease = disease;
    }
}
