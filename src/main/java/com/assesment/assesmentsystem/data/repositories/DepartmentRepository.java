package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
