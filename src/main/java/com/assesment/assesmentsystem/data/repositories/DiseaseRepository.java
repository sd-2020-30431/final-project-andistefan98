package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Disease;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseRepository extends CrudRepository<Disease, Integer> {
}

