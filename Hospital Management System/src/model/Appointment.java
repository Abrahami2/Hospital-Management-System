package model;

import java.util.Date;

/**
 * Represents an appointment in the system.
 * Contains information about the doctor and patient involved, and the date of the appointment.
 */
public class Appointment {

    // Fields to store appointment information
    int doctor_id;      // ID of the doctor
    int patient_id;     // ID of the patient
    String date;        // Date of the appointment

    /**
     * Constructor to initialize an appointment with doctor ID, patient ID, and date.
     *
     * @param doctor_id  The ID of the doctor for this appointment.
     * @param patient_id The ID of the patient for this appointment.
     * @param date       The date of the appointment.
     */
    public Appointment(int doctor_id, int patient_id, String date) {
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.date = date;
    }

    /**
     * Gets the doctor's ID for this appointment.
     *
     * @return The doctor's ID.
     */
    public int getDoctor_id() {
        return doctor_id;
    }

    /**
     * Sets the doctor's ID for this appointment.
     *
     * @param doctor_id The doctor's ID to be set.
     */
    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    /**
     * Gets the patient's ID for this appointment.
     *
     * @return The patient's ID.
     */
    public int getPatient_id() {
        return patient_id;
    }

    /**
     * Sets the patient's ID for this appointment.
     *
     * @param patient_id The patient's ID to be set.
     */
    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    /**
     * Gets the date of this appointment.
     *
     * @return The date of the appointment.
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date of this appointment.
     *
     * @param date The date to be set for the appointment.
     */
    public void setDate(String date) {
        this.date = date;
    }
}
