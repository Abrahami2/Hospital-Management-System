package controller;

import controller.AppointmentController;
import model.Appointment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppointmentControllerTest {

    private AppointmentController controller;
    private Appointment appointment1;
    private Appointment appointment2;

    @BeforeEach
    void setUp() {
        // Initialize the controller and test appointments before each test
        controller = new AppointmentController();
        appointment1 = new Appointment(1, 1, "2023-01-01");
        appointment2 = new Appointment(2, 2, "2023-01-02");
        controller.appointments.clear(); // Clear the appointments before each test
    }

    @Test
    void addAppointment() {
        controller.addAppointment(appointment1);
        assertFalse(controller.appointments.isEmpty(), "Appointments list should not be empty after adding an appointment");
        assertEquals(appointment1, controller.appointments.get(0), "The added appointment should match the one in the list");
    }

    @Test
    void getAppointments() {
        controller.addAppointment(appointment1);
        controller.addAppointment(appointment2);
        assertEquals(2, controller.getAppointments().size(), "The size of retrieved appointments should be 2");
        //assertTrue(controller.getColumns().contains(appointment1), "The list should contain appointment1");
        //assertTrue(controller.getColumns().contains(appointment2), "The list should contain appointment2");
    }

    @Test
    void update() {
        controller = new AppointmentController();
        controller.addAppointment(appointment1);
        controller.update(0, 0, "2"); // Assuming the update method takes the row index, column index, and new value
        assertEquals(2, controller.appointments.get(0).getDoctor_id(), "The doctor_id should be updated to 2");
    }

    @Test
    void delete() {
        controller = new AppointmentController();
        controller.addAppointment(appointment1);
        controller.delete(0);
        assertTrue(controller.appointments.isEmpty(), "Appointments list should be empty after deleting the appointment");
    }
}
