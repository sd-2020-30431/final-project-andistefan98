package com.assesment.assesmentsystem.entities;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Report {

    String patientName;
    Department department;
    int pulse;
    ArrayList<Symptom> mainSymptoms;
    int age;
    String gender;

    public Report(String patientName, Department department, int pulse, ArrayList<Symptom> mainSymptoms, int age, String gender) throws FileNotFoundException, DocumentException {
        this.patientName = patientName;
        this.department = department;
        this.pulse = pulse;
        this.mainSymptoms = mainSymptoms;
        this.age = age;
        this.gender = gender;
        createReport(patientName,department,pulse,mainSymptoms,age,gender);
    }


    void createReport(String patientName ,Department department , int pulse , ArrayList<Symptom> mainSymptoms , int age, String gender) throws FileNotFoundException, DocumentException {


        Rectangle pageSize = new Rectangle(516, 720);


        Document document = new Document(pageSize);
        PdfWriter.getInstance(document, new FileOutputStream("userReport.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);

        document.add( new Paragraph( "         " + department.getName() + " Report " ) );
        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);
        document.add( new Paragraph( "Name of patient : " + patientName ) );
        document.add(Chunk.NEWLINE);
        document.add( new Paragraph( "Pulse as arrival : " + pulse  ) );

        document.add(Chunk.NEWLINE);
        document.add( new Paragraph( "Age: " + age ) );
        document.add(Chunk.NEWLINE);
        document.add( new Paragraph( "Gender : " + gender ) );
        document.add(Chunk.NEWLINE);

        int index = 1;
        for(Symptom sym : mainSymptoms) {
            document.add(new Paragraph("Symptom " + index + " : " + sym.getName()));
            document.add(Chunk.NEWLINE);
            index++;
        }

        document.close();


     }


}



