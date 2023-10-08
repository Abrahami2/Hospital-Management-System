package model;

import java.util.Date;

public class Appointment {

    // Fields to store appointment information
    int doctor_id;      // ID of the doctor
    int patient_id;     // ID of the patient
    String date;        // Date of the appointment

    // Constructor to initialize appointment information
    public Appointment(int doctor_id, int patient_id, String date) {
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.date = date;
    }

    // Getter method to retrieve the doctor ID
    public int getDoctor_id() {
        return doctor_id;
    }

    // Setter method to set the doctor ID
    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    // Getter method to retrieve the patient ID
    public int getPatient_id() {
        return patient_id;
    }

    // Setter method to set the patient ID
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    // Getter method to retrieve the appointment date
    public String getDate() {
        return date;
    }

    // Setter method to set the appointment date
    public void setDate(String date) {
        this.date = date;
    }
}
