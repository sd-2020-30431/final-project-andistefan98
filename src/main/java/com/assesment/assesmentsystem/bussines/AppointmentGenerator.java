package com.assesment.assesmentsystem.bussines;

import com.assesment.assesmentsystem.entities.Appointment;
import com.assesment.assesmentsystem.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import com.assesment.assesmentsystem.repositories.AppointmentRepository;

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
