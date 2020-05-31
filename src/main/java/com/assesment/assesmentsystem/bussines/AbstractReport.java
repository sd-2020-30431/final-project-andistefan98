package com.assesment.assesmentsystem.bussines;

import com.assesment.assesmentsystem.data.entities.Disease;
import com.assesment.assesmentsystem.data.entities.Patient;
import com.assesment.assesmentsystem.data.entities.Report;
import com.assesment.assesmentsystem.data.entities.ReportType;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class AbstractReport {

    public abstract Report getReport(ReportType.reportTypes type, Patient patient , ArrayList<Disease> possible) throws FileNotFoundException, DocumentException;

}
