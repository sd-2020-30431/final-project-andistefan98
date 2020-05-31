package com.assesment.assesmentsystem.bussines;

import com.assesment.assesmentsystem.data.entities.*;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class EmergencyReportFactory extends AbstractReport{


    public Report getReport(ReportType.reportTypes type , Patient patient , ArrayList<Disease> possible) throws FileNotFoundException, DocumentException {

        return new EmergencyReport(patient,possible);
    }


}
