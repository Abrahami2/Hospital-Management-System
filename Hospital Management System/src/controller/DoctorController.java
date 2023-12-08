package controller;

import model.Doctor;

import java.util.Vector;

/**
 * DoctorController class manages doctor data.
 * This class is responsible for handling operations such as adding,
 * retrieving, updating, and deleting doctor information.
 * It follows the Singleton design pattern to ensure only one instance exists.
 */
public class DoctorController implements UpdateInterface{

    static DoctorController doctorController;
    Vector<Doctor> doctors;

    /**
     * Constructor for DoctorController.
     * Initializes a new Vector to store doctors.
     */
    public DoctorController(){
doctors=new Vector<>();
    }

    /**
     * Retrieves the single instance of DoctorController.
     * If the instance doesn't exist, it is created.
     *
     * @return The single instance of DoctorController.
     */
    public static DoctorController getInstance(){
        if(doctorController==null){
            doctorController=new DoctorController();
        }
        return doctorController;
    }

    /**
     * Adds a new Doctor to the list.
     *
     * @param doctor The Doctor object to be added.
     */
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    /**
     * Retrieves all doctors as a Vector of Vectors containing strings.
     * Each inner vector represents a doctor with their details such as ID, name, address, etc.
     *
     * @return A Vector of Vectors containing doctor data.
     */
    public Vector<Vector<String>> getDoctors(){
        Vector<Vector<String>> patientsData=new Vector<Vector<String>>();
        for(Doctor p : doctors){
            Vector<String> vec=new Vector<>();
            vec.add(Integer.toString(p.getId()));
            vec.add(p.getName());
            vec.add(p.getAddress());
            vec.add(p.getPhNumber());
            vec.add(p.getSpecialization());
            vec.add(String.valueOf(p.getExperience()));
            vec.add(String.valueOf(p.getFee()));
            patientsData.add(vec);
        }
        return patientsData;
    }

    /**
     * Retrieves the column names for doctor data.
     *
     * @return A Vector of Strings representing column names.
     */
    public Vector<String> getColumns(){
        Vector<String> columns=new Vector<>();
        columns.add("ID");
        columns.add("Name");
        columns.add("Address");
        columns.add("Phone Number");
        columns.add("Specialization");
        columns.add("Experience");
        columns.add("Fee");
        return columns;
    }


    /**
     * Updates a doctor's information based on the given row and column.
     *
     * @param row The row number in the data table.
     * @param col The column number in the data table.
     * @param value The new value to be updated.
     */
    public void update(int row,int col,String value){
        switch (col){
            case 0:
                doctors.get(row).setId(Integer.valueOf(value));
                break;
            case 1:
                doctors.get(row).setName(value);
                break;
            case 2:
                doctors.get(row).setAddress(value);
                break;
            case 3:
                doctors.get(row).setPhNumber(value);
                break;
            case 4:
                doctors.get(row).setSpecialization(value);
                break;
            case 5:
                doctors.get(row).setExperience(Integer.valueOf(value));
                break;
            case 6:
                doctors.get(row).setFee(Double.valueOf(value));
                break;
            default:
                // do nothing
        }


    }

    /**
     * Deletes a doctor from the list based on the row index.
     *
     * @param row The row number in the data table to be deleted.
     */
    public void delete(int row){
        doctors.remove(row);
    }

    /**
     * Populates the doctor list with dummy data for testing.
     */
    public void populateDummyDoctors(){
        Doctor d=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);
        Doctor d1=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);
        Doctor d2=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);
        Doctor d3=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);
        Doctor d4=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);
        Doctor d5=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);
        Doctor d6=new Doctor("Haider","LHR","030112345646",1,"Child",25,5000);

        doctors.add(d);
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);
        doctors.add(d4);
        doctors.add(d5);
        doctors.add(d6);
    }


}
