package com.assesment.assesmentsystem.data.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="diseases")
public class Disease {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="name")
    String name;

    @Column(name="possible_dep1")
    int departmentPossible1;

    @Column(name="possible_dep2")
    int departmentPossible2;


    public Disease(String name, int departmentPossible1, int departmentPossible2) {
        this.name = name;
        this.departmentPossible1 = departmentPossible1;
        this.departmentPossible2 = departmentPossible2;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentPossible1() {
        return departmentPossible1;
    }

    public void setDepartmentPossible1(int departmentPossible1) {
        this.departmentPossible1 = departmentPossible1;
    }

    public int getDepartmentPossible2() {
        return departmentPossible2;
    }

    public void setDepartmentPossible2(int departmentPossible2) {
        this.departmentPossible2 = departmentPossible2;
    }
}
