package controller;

import model.Patient;

import java.util.Vector;

/**
 * PatientController class manages patient data.
 * This class is responsible for handling operations such as adding,
 * retrieving, updating, and deleting patient information.
 * It follows the Singleton design pattern to ensure only one instance exists.
 */
public class PatientController implements UpdateInterface {

    Vector<Patient> patients;
    static PatientController patientController;

    /**
     * Constructor for PatientController.
     * Initializes a new Vector to store patients.
     */
    public PatientController() {
        patients = new Vector<>();
        //populateDummyPatients();
    }

    /**
     * Retrieves the single instance of PatientController.
     * If the instance doesn't exist, it is created.
     *
     * @return The single instance of PatientController.
     */
    public static PatientController getInstance() {
        if (patientController == null) {
            patientController = new PatientController();
        }
        return patientController;
    }

    /**
     * Adds a new Patient to the list.
     *
     * @param patient The Patient object to be added.
     */
    public void setPatients(Patient patient) {
        patients.add(patient);
    }

    /**
     * Retrieves all patients as a Vector of Vectors containing strings.
     * Each inner vector represents a patient with their details such as ID, name, disease, etc.
     *
     * @return A Vector of Vectors containing patient data.
     */
    public Vector<Vector<String>> getPatients() {
        Vector<Vector<String>> patientsData = new Vector<Vector<String>>();
        for (Patient p : patients) {
            Vector<String> vec = new Vector<>();
            vec.add(Integer.toString(p.getId()));
            vec.add(p.getName());
            vec.add(p.getDisease());
            vec.add(p.getPhNumber());
            vec.add(p.getAddress());
            patientsData.add(vec);
        }
        return patientsData;
    }

    /**
     * Retrieves the column names for patient data.
     *
     * @return A Vector of Strings representing column names.
     */
    public Vector<String> getCoulmns() {
        Vector<String> columns = new Vector<>();
        columns.add("ID");
        columns.add("Name");
        columns.add("Disease");
        columns.add("Phone Number");
        columns.add("Address");
        return columns;
    }

    /**
     * Populates the patient list with dummy data for testing.
     */
    public void populateDummyPatients() {
        Patient p = new Patient(1, "Aslam", "Lahore", "03012345678", "Fever");
        Patient p1 = new Patient(2, "Aslam", "Lahore", "03012345678", "Fever");
        Patient p2 = new Patient(3, "Aslam", "Lahore", "03012345678", "Fever");
        Patient p3 = new Patient(4, "Aslam", "Lahore", "03012345678", "Fever");
        Patient p4 = new Patient(5, "Aslam", "Lahore", "03012345678", "Fever");
        Patient p5 = new Patient(6, "Aslam", "Lahore", "03012345678", "Fever");

        patients.add(p);
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        patients.add(p4);
        patients.add(p5);
    }

    /**
     * Updates a patient's information based on the given row and column.
     *
     * @param row The row number in the data table.
     * @param col The column number in the data table.
     * @param value The new value to be updated.
     */
    public void update(int row, int col, String value) {
        switch (col) {
            case 0:
                patients.get(row).setId(Integer.valueOf(value));
                break;
            case 1:
                patients.get(row).setName(value);
                break;
            case 2:
                patients.get(row).setDisease(value);
                break;
            case 3:
                patients.get(row).setPhNumber(value);
                break;
            case 4:
                patients.get(row).setAddress(value);
                break;
            default:
                // do nothing
        }


    }

    /**
     * Deletes a patient from the list based on the row index.
     *
     * @param row The row number in the data table to be deleted.
     */
    public void delete(int row){
        patients.remove(row);
    }

}
