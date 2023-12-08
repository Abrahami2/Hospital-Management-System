package controller;


import view.LoginScreen;
import view.MainScreen;

/**
 * MainController is the entry point of the application.
 * This class initializes the controllers and views, and sets up the main screen and login screen.
 * It creates instances of AppointmentController, DoctorController, and PatientController,
 * and then initializes the MainScreen and LoginScreen views.
 *
 * Authors: Joao Staziaki, William Donahue, Abraham Hamitou, Kevin Cherisma
 */
public class MainController {
    /**
     * The main method that serves as the entry point of the application.
     * It creates and initializes the necessary controllers and views.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {

        AppointmentController appointmentController=new AppointmentController();
        DoctorController doctorController=new DoctorController();
        PatientController patientController=new PatientController();


        MainScreen mainScreen=new MainScreen(doctorController,patientController,appointmentController);
        LoginScreen loginScreen=new LoginScreen(mainScreen);



    }


}
