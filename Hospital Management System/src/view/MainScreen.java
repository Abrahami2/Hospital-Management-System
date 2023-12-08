package view;


import controller.AppointmentController;
import controller.DoctorController;
import controller.PatientController;
import model.Appointment;
import model.Doctor;
import model.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.SimpleFormatter;

public class MainScreen {

    private JFrame frame;
    private DoctorController doctorController;
    private PatientController patientController;
    private AppointmentController appointmentController;

    public MainScreen(DoctorController refgDoctor, PatientController refgPatient, AppointmentController refgAppointment) {
        doctorController=refgDoctor;
        patientController=refgPatient;
        appointmentController=refgAppointment;
        initGUI();


    }

    private void initGUI() {

        frame = new JFrame("Hospital Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("Hospital Management System");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Buttons Panel
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JButton addPatientButton = new JButton("Add Patient");
        JButton addDoctorButton = new JButton("Add Doctor");
        JButton addAppointmentButton = new JButton("Add Appointment");

        JButton allPatientButton = new JButton("All Patient");
        JButton allDoctorButton = new JButton("All Doctor");
        JButton allAppointmentButton = new JButton("All Appointment");

        // Add action listeners to the buttons
        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddPatientScreen();
            }
        });

        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddDoctorScreen();
            }
        });

        addAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddAppointmentScreen();
            }
        });

        allPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DisplayAll displayAll=new DisplayAll("All Patient's Info",MainScreen.this.patientController.getCoulmns(),MainScreen.this.patientController.getPatients(),patientController);
                displayAll.display();

            }
        });

        allDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DisplayAll displayAll=new DisplayAll("All Doctors's Info",MainScreen.this.doctorController.getCoulmns(),MainScreen.this.doctorController.getDoctors(),doctorController);
                displayAll.display();
            }
        });

        allAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DisplayAll displayAll=new DisplayAll("All Appointment's Info",MainScreen.this.appointmentController.getCoulmns(),MainScreen.this.appointmentController.getAppointments(),appointmentController);
                displayAll.display();
            }
        });



        buttonsPanel.add(addPatientButton);
        buttonsPanel.add(addDoctorButton);
        buttonsPanel.add(addAppointmentButton);

        buttonsPanel.add(allPatientButton);
        buttonsPanel.add(allDoctorButton);
        buttonsPanel.add(allAppointmentButton);
        // Add components to the main panel
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        frame.add(mainPanel);



    }

    public void display(){
        frame.setVisible(true);
    }


    private void openAddPatientScreen() {
        JFrame addPatientFrame = new JFrame("Add Patient");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL; // Make components expand horizontally
        gbc.weightx = 0.5;  // Assign some horizontal weight
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtname = new JTextField(15);
        JTextField txtaddress = new JTextField(15);
        JTextField txtphNumber = new JTextField(15);

        JTextField txtid = new JTextField(15);
        JTextField txtdisease= new JTextField(15);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Enter Patient's ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtid, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Enter Name "), gbc);

        gbc.gridx = 1;
        panel.add(txtname, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Enter Address "), gbc);

        gbc.gridx = 1;
        panel.add(txtaddress, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Enter Disease "), gbc);

        gbc.gridx = 1;
        panel.add(txtdisease, gbc);

        JButton add=new JButton("Add");
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(add, gbc);

        JLabel lblNotifi=new JLabel("");
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(lblNotifi, gbc);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Patient patient=new Patient(Integer.valueOf(txtid.getText()),txtname.getText(),
                        txtaddress.getText(),txtphNumber.getText(),txtdisease.getText());
                patientController.setPatients(patient);

                lblNotifi.setText("Patient Added");
                txtid.setText("");
                txtname.setText("");
                txtaddress.setText("");
                txtdisease.setText("");
                txtphNumber.setText("");


            }
        });

        addPatientFrame.add(panel);

        // Add your code to design and display the "Add Patient" screen here
        addPatientFrame.setSize(500, 600);
        addPatientFrame.setVisible(true);
    }

    private void openAddDoctorScreen() {
        JFrame addDoctorFrame = new JFrame("Add Doctor");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel lblNotifi=new JLabel("");

        JTextField txtname = new JTextField(15);
        JTextField txtaddress = new JTextField(15);
        JTextField txtphNumber = new JTextField(15);

        JTextField txtid = new JTextField(15);
        JTextField txtexperience = new JTextField(15);
        JTextField txtspecialization = new JTextField(15);
        JTextField txtfee = new JTextField(15);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Enter Doctor's ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtid, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Enter Name "), gbc);

        gbc.gridx = 1;
        panel.add(txtname, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Enter Address "), gbc);

        gbc.gridx = 1;
        panel.add(txtaddress, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Enter Doctor's Specialization "), gbc);

        gbc.gridx = 1;
        panel.add(txtspecialization, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Enter Doctor's Experience "), gbc);

        gbc.gridx = 1;
        panel.add(txtexperience, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Enter Doctor's Fee "), gbc);

        gbc.gridx = 1;
        panel.add(txtfee, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(new JLabel("Enter Doctor's Phone # "), gbc);

        gbc.gridx = 1;
        panel.add(txtphNumber, gbc);

        JButton btnAdd=new JButton("Add");

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(btnAdd, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(lblNotifi, gbc);


        addDoctorFrame.add(panel);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor doctor=new Doctor(txtname.getText(),txtaddress.getText(),
                        txtphNumber.getText(),Integer.valueOf(txtid.getText()),
                        txtspecialization.getText(), Integer.valueOf(txtexperience.getText()),
                        Double.valueOf(txtfee.getText()));
                doctorController.addDoctor(doctor);
                txtfee.setText("");
                txtexperience.setText("");
                txtaddress.setText("");
                txtid.setText("");
                txtname.setText("");
                txtphNumber.setText("");
                txtspecialization.setText("");
                lblNotifi.setText("Doctor Added");
            }
        });

        // Add your code to design and display the "Add Doctor" screen here
        addDoctorFrame.setSize(500, 600);
        addDoctorFrame.setVisible(true);
    }

    private void openAddAppointmentScreen() {
        JFrame addAppointmentFrame = new JFrame("Make Appointment");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtPatientsId = new JTextField(15);
        JTextField txtDoctorId = new JTextField(15);
        JLabel lblFee=new JLabel("0");
        JLabel lblName=new JLabel(" ");

        JLabel lblNotifi=new JLabel("");

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Enter Doctor's ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtDoctorId, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Enter Patient ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtPatientsId, gbc);

        // Date selection combo boxes
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = Integer.toString(i);
        }
        String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String[] years = new String[10]; // for example, from 2023 to 2032
        for (int i = 0; i < 10; i++) {
            years[i] = Integer.toString(2023 + i);
        }

        JComboBox<String> dayComboBox = new JComboBox<>(days);
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        JComboBox<String> yearComboBox = new JComboBox<>(years);

        JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        datePanel.add(dayComboBox);
        datePanel.add(monthComboBox);
        datePanel.add(yearComboBox);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Select Date (DD/MM/YYYY)"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3; // Span across three columns
        panel.add(datePanel, gbc);

        // Reset gridwidth for subsequent components
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Patient Name : "), gbc);

        gbc.gridx = 3;
        panel.add(lblName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Doctor's fee : "), gbc);

        gbc.gridx = 1;
        panel.add(lblFee, gbc);

        JButton btnAdd=new JButton("Add");
        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(btnAdd, gbc);


        gbc.gridx = 1;
        gbc.gridy = 8;
        panel.add(lblNotifi, gbc);

        addAppointmentFrame.add(panel);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDay = (String) dayComboBox.getSelectedItem();
                String selectedMonth = (String) monthComboBox.getSelectedItem();
                String selectedYear = (String) yearComboBox.getSelectedItem();

                String selectedDate = selectedDay + "/" + selectedMonth + "/" + selectedYear;

                // Assuming txtDoctorId and txtPatientsId are already defined as JTextField
                int doctorId = Integer.parseInt(txtDoctorId.getText());
                int patientId = Integer.parseInt(txtPatientsId.getText());
                Appointment appointment = new Appointment(doctorId, patientId, selectedDate);

                appointmentController.addAppointment(appointment);
                txtPatientsId.setText("");
                txtDoctorId.setText("");

                lblNotifi.setText("Appointment Added");
            }
        });


        // Add your code to design and display the "Add Appointment" screen here
        addAppointmentFrame.setSize(600, 600);
        addAppointmentFrame.setVisible(true);
        addAppointmentFrame.setLocationRelativeTo(null);
    }

}



