package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Symptom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends CrudRepository<Symptom, Integer> {



}