package controller;

import model.Patient;

import java.util.Vector;

public class PatientController implements UpdateInterface {

    Vector<Patient> patients;
    static PatientController patientController;

    public PatientController() {
        patients = new Vector<>();
        //populateDummyPatients();
    }

    public static PatientController getInstance() {
        if (patientController == null) {
            patientController = new PatientController();
        }
        return patientController;
    }

    public void setPatients(Patient patient) {
        patients.add(patient);
    }

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

    public Vector<String> getCoulmns() {
        Vector<String> columns = new Vector<>();
        columns.add("ID");
        columns.add("Name");
        columns.add("Disease");
        columns.add("Phone Number");
        columns.add("Address");
        return columns;
    }


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

    public void delete(int row){
        patients.remove(row);
    }

}
