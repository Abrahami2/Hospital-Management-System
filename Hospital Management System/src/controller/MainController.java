package controller;


import view.LoginScreen;
import view.MainScreen;

public class MainController {
    public static void main(String[] args) {

        AppointmentController appointmentController=new AppointmentController();
        DoctorController doctorController=new DoctorController();
        PatientController patientController=new PatientController();


        MainScreen mainScreen=new MainScreen(doctorController,patientController,appointmentController);
        LoginScreen loginScreen=new LoginScreen(mainScreen);



    }


}
