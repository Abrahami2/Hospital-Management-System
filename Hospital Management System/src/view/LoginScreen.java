package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * LoginScreen class creates and manages the GUI for the login screen.
 * It includes fields for username and password entry, and a button to submit the login information.
 * On successful login, it transitions to the MainScreen.
 */
public class LoginScreen {

    JFrame frame;
    JPanel panel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    MainScreen mainScreen;

    /**
     * Constructor to initialize the LoginScreen with a reference to the MainScreen.
     *
     * @param mainScreen The MainScreen to be displayed after successful login.
     */
    public LoginScreen(MainScreen mainScreen){
        this.mainScreen=mainScreen;
        initGUI();
    }

    /**
     * Initializes the graphical user interface for the login screen.
     * Sets up the layout, fields, labels, and buttons, along with their functionalities.
     */
    public void initGUI() {
        frame=new JFrame("Login Screen");
        frame.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2,5,5));

        JLabel lblpassword=new JLabel();

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char [] password=passwordField.getPassword();
                char [] verify="admin".toCharArray();
                if(usernameField.getText().equals("admin") && Arrays.equals(password,verify)){
                    LoginScreen.this.frame.setVisible(false);
                    LoginScreen.this.mainScreen.display();
                }else{
                    lblpassword.setText(passwordField.getPassword().toString());
                }
            }
        });
        //loginButton.addActionListener(this);

        panel.add(new JLabel("Login Screen"));
        panel.add(new JLabel());
        panel.add(new JLabel("Username"));
        panel.add(usernameField);
        panel.add(new JLabel("Password"));
        panel.add(passwordField);

        panel.add(lblpassword); // Empty label for spacing
        panel.add(loginButton);

        frame.add(panel);
        frame.setSize(600,450);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


}
