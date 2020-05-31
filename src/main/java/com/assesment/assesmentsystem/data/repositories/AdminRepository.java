package com.assesment.assesmentsystem.data.repositories;

import com.assesment.assesmentsystem.data.entities.Admin;
import com.assesment.assesmentsystem.data.entities.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

    public Admin findByUsername(String username);
}
