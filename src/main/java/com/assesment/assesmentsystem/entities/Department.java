package com.assesment.assesmentsystem.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    String name;



    //@OneToMany(mappedBy="departmentId")
   // ArrayList<Doctor> doctorsList;

}
