package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer> {



}
