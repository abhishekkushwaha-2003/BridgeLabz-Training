package com.objectmodelingandobjectdiagram.selfproblem;

public class Doctor {

    // doctor name
    String doctorName;

    // constructor
    Doctor(String doctorName) {
        this.doctorName = doctorName;
    }

    // method showing consultation (communication)
    void consult(Patient patient) {
        System.out.println("Doctor " + doctorName +
                           " is consulting Patient " + patient.patientName);
    }
}

