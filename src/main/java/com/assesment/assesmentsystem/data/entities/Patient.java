package com.assesment.assesmentsystem.data.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="pulse")
    int pulse;

    @Column(name="first_name")
    String firstName;

    @Column(name="last_name")
    String lastName;

    @Column(name="age")
    int age;

    @Column(name="symptom1")
    int mainSymptomId1;

    @Column(name="symptom2")
    int mainSymptomId2;

    @Column(name="symptom3")
    int mainSymptomId3;

    @Column(name="gender")
    int gender; //1 for male,  2 female

    @Column(name="departmentId")
    int departmentId;


    public Patient(String first, String last, int pulse, ArrayList<Symptom> main , int sym1 , int sym2, int sym3){
        this.firstName =first;
        this.lastName = last;
        this.mainSymptomId1 = sym1;
        this.mainSymptomId2 =sym2;
        this.mainSymptomId3 = sym3;
        this.pulse = pulse;
    }


    public int getId() {
        return id;
    }



    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getMainSymptomId1() {
        return mainSymptomId1;
    }

    public void setMainSymptomId1(int mainSymptomId1) {
        this.mainSymptomId1 = mainSymptomId1;
    }

    public int getMainSymptomId2() {
        return mainSymptomId2;
    }

    public void setMainSymptomId2(int mainSymptomId2) {
        this.mainSymptomId2 = mainSymptomId2;
    }

    public int getMainSymptomId3() {
        return mainSymptomId3;
    }

    public void setMainSymptomId3(int mainSymptomId3) {
        this.mainSymptomId3 = mainSymptomId3;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
