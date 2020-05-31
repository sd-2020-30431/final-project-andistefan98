package com.assesment.assesmentsystem.data.entities;

import com.itextpdf.text.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Report {

    void generateNewReport(Patient patient, ArrayList<Disease> possibleDiseases) throws FileNotFoundException, DocumentException;


}



