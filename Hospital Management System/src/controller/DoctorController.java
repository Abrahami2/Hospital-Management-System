package controller;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.Base64;
import java.util.Vector;

public class DoctorController implements UpdateInterface{

    static DoctorController doctorController;
    Vector<Doctor> doctors;

    public DoctorController(){
doctors=new Vector<>();
    }

    public static DoctorController getInstance(){
        if(doctorController==null){
            doctorController=new DoctorController();
        }
        return doctorController;
    }


    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

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

    public Vector<String> getCoulmns(){
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

    public void delete(int row){
        doctors.remove(row);
    }

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
