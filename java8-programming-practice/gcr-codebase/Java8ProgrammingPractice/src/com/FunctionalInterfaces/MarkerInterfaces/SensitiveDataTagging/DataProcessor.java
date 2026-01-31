package com.FunctionalInterfaces.MarkerInterfaces.SensitiveDataTagging;

public class DataProcessor {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("Normal processing...");
        }
    }

    public static void main(String[] args) {
        PatientRecord p = new PatientRecord("Amit", "Diabetes");
        process(p);
    }
}
