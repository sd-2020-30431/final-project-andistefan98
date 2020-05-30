package bussines;

import entities.Appointment;
import entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.AppointmentRepository;

import java.time.LocalDate;

public class AppointmentGenerator {

    int id;

    int patientId;

    int doctorId;

    LocalDate appointmentDate;

    Department department;

    @Autowired
    AppointmentRepository appointmentRepository;

    public AppointmentGenerator(int patientId, int doctorId, LocalDate appointmentDate, Department department) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.department = department;
        Appointment app = new Appointment(appointmentDate,patientId,doctorId);
        generateAppointment(app);
    }


    public void generateAppointment(Appointment app) {
        appointmentRepository.save(app);
    }


}
