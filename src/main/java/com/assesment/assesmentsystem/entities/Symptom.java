package com.assesment.assesmentsystem.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;


@Data
@Entity
@Table(name="symptoms")
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="symptom_id")
    int id;

    @Column(name="name")
    String name;

    @Column(name="disease1")
    int possibleDiseaseId1;

    @Column(name="disease2")
    int possibleDiseaseId2;

    @Column(name="disease3")
    int possibleDiseaseId3;


    public Symptom(String nm , int dis1 , int dis2, int dis3){
        this.name = nm;
        this.possibleDiseaseId1 =dis1;
        this.possibleDiseaseId2 =dis2;
        this.possibleDiseaseId3=dis3;
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

    public int getPossibleDiseaseId1() {
        return possibleDiseaseId1;
    }

    public void setPossibleDiseaseId1(int possibleDiseaseId1) {
        this.possibleDiseaseId1 = possibleDiseaseId1;
    }

    public int getPossibleDiseaseId2() {
        return possibleDiseaseId2;
    }

    public void setPossibleDiseaseId2(int possibleDiseaseId2) {
        this.possibleDiseaseId2 = possibleDiseaseId2;
    }

    public int getPossibleDiseaseId3() {
        return possibleDiseaseId3;
    }

    public void setPossibleDiseaseId3(int possibleDiseaseId3) {
        this.possibleDiseaseId3 = possibleDiseaseId3;
    }

    public ArrayList<Integer> getDiseases(){
        ArrayList<Integer> newLs =  new ArrayList<>();

        newLs.add(getPossibleDiseaseId1());
        newLs.add(getPossibleDiseaseId2());
        newLs.add(getPossibleDiseaseId3());

        return newLs;
    }

}
