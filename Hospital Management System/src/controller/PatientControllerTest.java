package controller;

import controller.PatientController;
import model.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;

    class PatientControllerTest {

        private PatientController controller;
        private Patient patient1;
        private Patient patient2;

        @BeforeEach
        void setUp() {
            controller = PatientController.getInstance(); // Using the singleton instance
            patient1 = new Patient(1, "John Doe", "123 Main St", "1234567890", "Cold");
            patient2 = new Patient(2, "Jane Doe", "456 Main St", "0987654321", "Flu");
            controller.patients.clear(); // Clear the list before each test
        }

        @Test
        void setPatients() {
            controller.setPatients(patient1);
            assertFalse(controller.patients.isEmpty(), "Patients list should not be empty after adding a patient");
            assertTrue(controller.patients.contains(patient1), "The list should contain the added patient");
        }

        @Test
        void getPatients() {
            controller.setPatients(patient1);
            controller.setPatients(patient2);

            Vector<Vector<String>> retrievedPatients = controller.getPatients();
            assertEquals(2, retrievedPatients.size(), "The size of retrieved patients should be 2");
            assertEquals("John Doe", retrievedPatients.get(0).get(1), "The name of the first patient should be John Doe");
            assertEquals("Jane Doe", retrievedPatients.get(1).get(1), "The name of the second patient should be Jane Doe");
        }

        @Test
        void updatePatient() {
            controller.setPatients(patient1);
            controller.update(0, 1, "Jack Doe"); // Update the name of the first patient
            assertEquals("Jack Doe", controller.patients.get(0).getName(), "The patient's name should be updated to Jack Doe");
        }

        @Test
        void deletePatient() {
            controller.setPatients(patient1);
            controller.setPatients(patient2);

            int originalSize = controller.patients.size();
            controller.delete(0); // Delete the first patient

            assertEquals(originalSize - 1, controller.patients.size(), "Patients list size should decrease by 1 after deletion");
            assertFalse(controller.patients.contains(patient1), "Deleted patient should no longer be in the list");
        }
    }