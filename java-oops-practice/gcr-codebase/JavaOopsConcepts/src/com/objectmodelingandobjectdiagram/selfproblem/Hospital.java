package com.objectmodelingandobjectdiagram.selfproblem;
import java.util.ArrayList;

public class Hospital {

    // hospital name
    String hospitalName;

    // list of doctors
    ArrayList<Doctor> doctors = new ArrayList<>();

    // list of patients
    ArrayList<Patient> patients = new ArrayList<>();

    // constructor
    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    // method to add doctor
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // method to add patient
    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

