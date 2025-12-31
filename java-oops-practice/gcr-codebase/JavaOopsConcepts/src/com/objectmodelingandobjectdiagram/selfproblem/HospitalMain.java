package com.objectmodelingandobjectdiagram.selfproblem;

public class HospitalMain {
	    public static void main(String[] args) {

	        // creating hospital
	        Hospital hospital = new Hospital("City Hospital");

	        // creating doctors
	        Doctor d1 = new Doctor("Dr. Sharma");
	        Doctor d2 = new Doctor("Dr. Mehta");

	        // creating patients
	        Patient p1 = new Patient("Rohan");
	        Patient p2 = new Patient("Neha");

	        // adding doctors and patients to hospital
	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        // consultations (association + communication)
	        d1.consult(p1);
	        d1.consult(p2);

	        d2.consult(p1);
	    }
	}

