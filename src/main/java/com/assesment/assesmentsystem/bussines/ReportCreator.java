package com.assesment.assesmentsystem.bussines;

import com.assesment.assesmentsystem.data.entities.Disease;
import com.assesment.assesmentsystem.data.entities.Patient;
import com.assesment.assesmentsystem.data.entities.ReportType;

import java.util.ArrayList;

public class ReportCreator {

    public static AbstractReport getFactory(ReportType.reportTypes choice , Patient patient , ArrayList<Disease> possible){

        if(choice.equals(ReportType.reportTypes.Emergency)){

            return new EmergencyReportFactory();
        } else {

            return new DepartmentReportFactory();
        }
    }
}
