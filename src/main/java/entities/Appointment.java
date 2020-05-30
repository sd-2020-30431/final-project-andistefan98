package entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="appointment_id")
    int id;

    @Column(name="date")
    LocalDate dateAppointment;

    @Column(name="patient_id")
    int patientId;

    @Column(name="doctor_id")
    int doctorId;

    public Appointment(LocalDate dateAppointment, int patientId, int doctorId) {
        this.dateAppointment = dateAppointment;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public LocalDate getDateAppointment() {
        return dateAppointment;
    }

    public void setDateAppointment(LocalDate dateAppointment) {
        this.dateAppointment = dateAppointment;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
}
