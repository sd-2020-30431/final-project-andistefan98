package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {



}
