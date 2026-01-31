package com.FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

public class PatientRecord implements SensitiveData {

    String name;
    String medicalHistory;

    public PatientRecord(String name, String medicalHistory) {
        this.name = name;
        this.medicalHistory = medicalHistory;
    }
}
