package com.assesment.assesmentsystem.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="name")
   String name;

    @Column(name="startWorkHour")
   int startWorkHour;

    @Column(name="endWorkHour")
   int endWorkHour;

    @Column(name="departmentId")
    int departmentId ;

    public Doctor(String name, int startWorkHour, int endWorkHour, int departmentId) {
        this.name = name;
        this.startWorkHour = startWorkHour;
        this.endWorkHour = endWorkHour;
        this.departmentId = departmentId;
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

    public int getStartWorkHour() {
        return startWorkHour;
    }

    public void setStartWorkHour(int startWorkHour) {
        this.startWorkHour = startWorkHour;
    }

    public int getEndWorkHour() {
        return endWorkHour;
    }

    public void setEndWorkHour(int endWorkHour) {
        this.endWorkHour = endWorkHour;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
