package com.assesment.assesmentsystem.repositories;

import com.assesment.assesmentsystem.entities.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends CrudRepository<Symptom, Integer> {



}