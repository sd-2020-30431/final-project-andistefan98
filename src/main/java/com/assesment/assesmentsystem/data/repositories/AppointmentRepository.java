package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
}
