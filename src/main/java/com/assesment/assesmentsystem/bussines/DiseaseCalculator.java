package com.assesment.assesmentsystem.bussines;

import com.assesment.assesmentsystem.entities.Disease;
import com.assesment.assesmentsystem.entities.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import com.assesment.assesmentsystem.repositories.DiseaseRepository;

import java.util.ArrayList;
import java.util.HashSet;

public class DiseaseCalculator {

    @Autowired
    DiseaseRepository diseaseRepository;

    ArrayList<Disease> getPossibleDiseases(Symptom symptom1 , Symptom symptom2, Symptom symptom3){

        ArrayList<Disease> possibles = new ArrayList<>();
        HashSet<Integer> diseasesIdsFromSymp = new HashSet<Integer>();

        ArrayList<Integer> diseases1  = symptom1.getDiseases();
        ArrayList<Integer> diseases2  = symptom2.getDiseases();
        ArrayList<Integer> diseases3  = symptom3.getDiseases();

        for(int dis: diseases1){
            diseasesIdsFromSymp.add(dis);
        }
        for(int dis: diseases2){
            diseasesIdsFromSymp.add(dis);
        }
        for(int dis: diseases3){
            diseasesIdsFromSymp.add(dis);
        }

        for(Integer i : diseasesIdsFromSymp){
          Disease newDis =  diseaseRepository.findById(i).get();
          possibles.add(newDis);

        }

    return possibles;

    }


}
