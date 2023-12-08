package model;

/**
 * Represents a doctor, extending the Person class.
 * This class stores additional details specific to a doctor such as ID, specialization,
 * years of experience, and consultation fee, along with the personal details inherited from Person.
 */
public class Doctor extends Person {
    // Fields to store doctor information
    int id;                 // Doctor's ID
    String specialization;  // Doctor's specialization
    int experience;         // Doctor's years of experience
    double fee;             // Doctor's consultation fee

    /**
     * Constructor to initialize doctor information with ID, specialization, experience, and fee.
     *
     * @param id            The doctor's ID.
     * @param specialization The doctor's area of specialization.
     * @param experience    The doctor's years of experience.
     * @param fee           The doctor's consultation fee.
     */

    public Doctor(int id, String specialization, int experience, double fee) {
        this.id = id;
        this.specialization = specialization;
        this.experience = experience;
        this.fee = fee;
    }

    /**
     * Constructor to initialize doctor information along with personal details.
     * Calls the constructor of the superclass (Person) for personal details.
     *
     * @param name          The doctor's name.
     * @param address       The doctor's address.
     * @param phNumber      The doctor's phone number.
     * @param id            The doctor's ID.
     * @param specialization The doctor's area of specialization.
     * @param experience    The doctor's years of experience.
     * @param fee           The doctor's consultation fee.
     */
    public Doctor(String name, String address, String phNumber, int id, String specialization, int experience, double fee) {
        super(name, address, phNumber);  // Call the constructor of the superclass (Person)
        this.id = id;
        this.specialization = specialization;
        this.experience = experience;
        this.fee = fee;
    }

    /**
     * Gets the doctor's ID.
     *
     * @return The doctor's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the doctor's ID.
     *
     * @param id The ID to set for the doctor.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the doctor's area of specialization.
     *
     * @return The doctor's specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the doctor's area of specialization.
     *
     * @param specialization The specialization to set for the doctor.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Gets the doctor's years of experience.
     *
     * @return The number of years the doctor has been practicing.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the doctor's years of experience.
     *
     * @param experience The number of years to set for the doctor's experience.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Gets the doctor's consultation fee.
     *
     * @return The doctor's fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets the doctor's consultation fee.
     *
     * @param fee The fee to set for the doctor.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
}
