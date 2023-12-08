package controller;
import controller.DoctorController;
import model.Doctor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class DoctorControllerTest {

    private DoctorController controller;
    private Doctor doctor1;
    private Doctor doctor2;

    @BeforeEach
    void setUp() {
        controller = DoctorController.getInstance(); // Using the singleton instance
        doctor1 = new Doctor("Dr. Smith", "123 Street", "1234567890", 1, "General", 10, 500.0);
        doctor2 = new Doctor("Dr. Doe", "456 Lane", "9876543210", 2, "Pediatrics", 8, 600.0);
        controller.doctors.clear();
    }

    @Test
    void addDoctor() {
        controller.addDoctor(doctor1);
        assertFalse(controller.doctors.isEmpty(), "Doctors list should not be empty after adding a doctor");
        assertTrue(controller.doctors.contains(doctor1), "The list should contain the added doctor");
    }

    @Test
    void getDoctors() {
        controller.addDoctor(doctor1);
        controller.addDoctor(doctor2);

        Vector<Vector<String>> retrievedDoctors = controller.getDoctors();
        assertEquals(2, retrievedDoctors.size(), "The size of retrieved doctors should be 2");
        assertEquals("Dr. Smith", retrievedDoctors.get(0).get(1), "The name of the first doctor should be Dr. Smith");
        assertEquals("Dr. Doe", retrievedDoctors.get(1).get(1), "The name of the second doctor should be Dr. Doe");
    }

    @Test
    void updateDoctor() {
        controller.addDoctor(doctor1);
        controller.update(0, 1, "Dr. Johnson"); // Update the name of the first doctor
        assertEquals("Dr. Johnson", controller.doctors.get(0).getName(), "The doctor's name should be updated to Dr. Johnson");
    }

    @Test
    void deleteDoctor() {
        controller.addDoctor(doctor1);
        controller.delete(0);
        assertTrue(controller.doctors.isEmpty(), "Doctors list should be empty after deleting the doctor");
    }
}
