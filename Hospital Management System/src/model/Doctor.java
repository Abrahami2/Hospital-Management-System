package model;

public class Doctor extends Person {
    // Fields to store doctor information
    int id;                 // Doctor's ID
    String specialization;  // Doctor's specialization
    int experience;         // Doctor's years of experience
    double fee;             // Doctor's consultation fee

    // Constructor to initialize doctor information
    public Doctor(int id, String specialization, int experience, double fee) {
        this.id = id;
        this.specialization = specialization;
        this.experience = experience;
        this.fee = fee;
    }

    // Constructor to initialize doctor information along with personal details
    public Doctor(String name, String address, String phNumber, int id, String specialization, int experience, double fee) {
        super(name, address, phNumber);  // Call the constructor of the superclass (Person)
        this.id = id;
        this.specialization = specialization;
        this.experience = experience;
        this.fee = fee;
    }

    // Getter method to retrieve the doctor's ID
    public int getId() {
        return id;
    }

    // Setter method to set the doctor's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method to retrieve the doctor's specialization
    public String getSpecialization() {
        return specialization;
    }

    // Setter method to set the doctor's specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter method to retrieve the doctor's years of experience
    public int getExperience() {
        return experience;
    }

    // Setter method to set the doctor's years of experience
    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Getter method to retrieve the doctor's consultation fee
    public double getFee() {
        return fee;
    }

    // Setter method to set the doctor's consultation fee
    public void setFee(double fee) {
        this.fee = fee;
    }
}
