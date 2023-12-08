package controller;

import model.Appointment;

import java.util.Vector;

/**
 * AppointmentController class manages appointment data.
 * This class is responsible for handling operations such as adding,
 * retrieving, updating, and deleting appointments.
 * It follows the Singleton design pattern to ensure only one instance exists.
 *
 */

public class AppointmentController implements UpdateInterface{

    static AppointmentController appointmentController;
    Vector<Appointment> appointments;

    /**
     * Constructor for AppointmentController.
     * Initializes a new Vector to store appointments.
     */
    public AppointmentController() {
        appointments = new Vector<>();
    }
    /**
     * Retrieves the single instance of AppointmentController.
     * If the instance doesn't exist, it is created.
     *
     * @return The single instance of AppointmentController.
     */
    public static AppointmentController getInstance() {
        if (appointmentController == null) {
            appointmentController = new AppointmentController();
        }
        return appointmentController;
    }
    /**
     * Adds a new Appointment to the list.
     *
     * @param appointment The Appointment object to be added.
     */
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    /**
     * Retrieves all appointments as a Vector of Vectors containing strings.
     * Each inner vector represents an appointment with doctor's ID, patient's ID, and date.
     *
     * @return A Vector of Vectors containing appointment data.
     */
    public Vector<Vector<String>> getAppointments() {
        Vector<Vector<String>> patientsData = new Vector<Vector<String>>();
        for (Appointment p : appointments) {
            Vector<String> vec = new Vector<>();
            vec.add(Integer.toString(Integer.valueOf(p.getDoctor_id())));
            vec.add(Integer.toString(p.getPatient_id()));
            vec.add(p.getDate());
            patientsData.add(vec);
        }
        return patientsData;
    }

    /**
     * Retrieves the column names for appointment data.
     *
     * @return A Vector of Strings representing column names.
     */
    public Vector<String> getColumns() {
        Vector<String> columns = new Vector<>();
        columns.add("Doctor's ID");
        columns.add("Patient's ID");
        columns.add("Date");
        return columns;
    }
    /**
     * Updates an appointment's information based on the given row and column.
     *
     * @param row The row number in the data table.
     * @param col The column number in the data table.
     * @param value The new value to be updated.
     */
    public void update(int row,int col,String value){
        switch (col){
            case 0:
                appointments.get(row).setDoctor_id(Integer.valueOf(value));
                break;
            case 1:
                appointments.get(row).setPatient_id(Integer.valueOf(value));
                break;
            default:
                // do nothing
        }


    }

    /**
     * Deletes an appointment from the list based on the row index.
     *
     * @param row The row number in the data table to be deleted.
     */
    public void delete(int row){
        appointments.remove(row);
    }

    /**
     * Populates the appointment list with dummy data for testing.
     */
    public void populateDummyAppointments() {
        Appointment p = new Appointment(1, 1, "Fever");
        Appointment p1 = new Appointment(1, 1, "Fever");
        Appointment p2 = new Appointment(1, 1, "Fever");
        Appointment p3 = new Appointment(1, 1, "Fever");
        Appointment p4 = new Appointment(1, 1, "Fever");
        Appointment p5 = new Appointment(1, 1, "Fever");
        appointments.add(p);
        appointments.add(p1);
        appointments.add(p2);
        appointments.add(p3);
        appointments.add(p4);
        appointments.add(p5);
    }


}
