package com.assesment.assesmentsystem.bussines;

import com.assesment.assesmentsystem.entities.Department;
import com.assesment.assesmentsystem.entities.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import com.assesment.assesmentsystem.repositories.DepartmentRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DepartmentCalculator {

     @Autowired
    DepartmentRepository departmentRepository ;

    Department getDepartmentFromDiseases(ArrayList<Disease> diseases){ // I consider it a matter of highest probablity, I yet don't have enough info to do this a better way

        ArrayList<Integer> possibleDepId =  new ArrayList<>();

    for(Disease disease : diseases){
        possibleDepId.add(disease.getId());

    }

    int mostCommonDep = mostCommon(possibleDepId);


    Department dep = (Department)departmentRepository.findById(mostCommonDep).get();

    return dep;

    }


    public static <T> T mostCommon(ArrayList<T> list) {
        Map<T, Integer> map = new HashMap<>();

        for (T t : list) {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val + 1);
        }

        Map.Entry<T, Integer> max = null;

        for (Map.Entry<T, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }

        return max.getKey();
    }


}
