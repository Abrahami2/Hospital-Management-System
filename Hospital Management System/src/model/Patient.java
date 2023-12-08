package model;

/**
 * Represents a patient, extending the Person class.
 * This class stores additional details specific to a patient such as an ID and disease or condition,
 * along with the personal details inherited from Person.
 */
public class Patient extends Person {
    // Fields to store patient information
    int id;         // Patient's ID
    String disease; // Patient's disease or condition
    /**
     * Gets the patient's disease or condition.
     *
     * @return The disease or condition of the patient.
     */
    public Patient(int id, String disease) {
        this.id = id;
        this.disease = disease;
    }

    /**
     * Constructor to initialize patient information along with personal details.
     * Calls the constructor of the superclass (Person) for personal details.
     *
     * @param id       The patient's ID.
     * @param name     The patient's name.
     * @param address  The patient's address.
     * @param phNumber The patient's phone number.
     * @param disease  The patient's disease or condition.
     */

    public Patient(int id, String name, String address, String phNumber, String disease) {
        super(name, address, phNumber);  // Call the constructor of the superclass (Person)
        this.id = id;
        this.disease = disease;
    }

    /**
     * Gets the patient's ID.
     *
     * @return The patient's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the patient's ID.
     *
     * @param id The ID to set for the patient.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the patient's disease or condition.
     *
     * @return The disease or condition of the patient.
     */
    public String getDisease() {
        return disease;
    }

    /**
     * Sets the patient's disease or condition.
     *
     * @param disease The disease or condition to set for the patient.
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }
}
