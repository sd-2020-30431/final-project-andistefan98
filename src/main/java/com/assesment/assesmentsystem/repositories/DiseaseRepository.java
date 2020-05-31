package com.assesment.assesmentsystem.repositories;

import com.assesment.assesmentsystem.entities.Disease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends CrudRepository<Disease, Integer> {
}

