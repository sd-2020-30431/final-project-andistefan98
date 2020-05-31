package com.assesment.assesmentsystem.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="patient_id")
    int id;

    @Column(name="pulse")
    int pulse;

    @Column(name="first_name")
    String firstName;

    @Column(name="last_name")
    String lastName;

    @Column(name="symptom1")
    int mainSymptomId1;

    @Column(name="symptom2")
    int mainSymptomId2;

    @Column(name="symptom3")
    int mainSymptomId3;


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
}
