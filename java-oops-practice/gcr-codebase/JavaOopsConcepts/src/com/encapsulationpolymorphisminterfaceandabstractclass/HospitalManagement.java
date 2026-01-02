package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

public class HospitalManagement {

	// common method to process patients
	static void processPatients(ArrayList<Patient> patients) {

		for (Patient p : patients) {

			p.getPatientDetails();

			double bill = p.calculateBill();
			System.out.println("Total Bill: " + bill);

			// checking medical record
			if (p instanceof MedicalRecord) {
				MedicalRecord m = (MedicalRecord) p;
				m.viewRecords();
			}

			System.out.println("---------------------------");
		}
	}

	public static void main(String[] args) {

		// list to store patients
		ArrayList<Patient> patientList = new ArrayList<>();

		// inpatient object
		InPatient ip = new InPatient(101, "Rahul", 35, 5);
		ip.setDiagnosis("Fever");
		ip.addRecord("Admitted for 5 days");

		// outpatient object
		OutPatient op = new OutPatient(102, "Anita", 28);
		op.setDiagnosis("Cold");
		op.addRecord("General checkup");

		// adding patients to list
		patientList.add(ip);
		patientList.add(op);

		// process all patients
		processPatients(patientList);
	}
}
