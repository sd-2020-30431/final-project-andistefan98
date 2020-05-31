package com.assesment.assesmentsystem.data.entities;

import com.assesment.assesmentsystem.data.repositories.DepartmentRepository;
import com.assesment.assesmentsystem.data.repositories.SymptomRepository;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class EmergencyReport implements Report {

    @Autowired
    SymptomRepository symptomRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public EmergencyReport(Patient patient , ArrayList<Disease> possible) throws FileNotFoundException, DocumentException {
        generateNewReport(patient,possible);
    }


    @Override
    public void generateNewReport(Patient patient  , ArrayList<Disease> possibleDiseases) throws FileNotFoundException, DocumentException {

        ArrayList<Symptom> mainSymptoms = new ArrayList<>();
        mainSymptoms.add(symptomRepository.findById(patient.mainSymptomId1).get());
        mainSymptoms.add(symptomRepository.findById(patient.mainSymptomId2).get());
        mainSymptoms.add(symptomRepository.findById(patient.mainSymptomId3).get());

       new FinalEmergencyReport(patient.getLastName(),departmentRepository.findById(patient.getDepartmentId()).get(), patient.getPulse(), mainSymptoms , patient.getAge() , patient.getGender());

    }


}