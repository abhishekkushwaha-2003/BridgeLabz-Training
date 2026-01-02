package com.encapsulationpolymorphisminterfaceandabstractclass;

//inpatient class
class InPatient extends Patient implements MedicalRecord {

	private int daysAdmitted;
	private String record;

	InPatient(int id, String name, int age, int daysAdmitted) {
		super(id, name, age);
		this.daysAdmitted = daysAdmitted;
	}

	// bill calculation for inpatient
	double calculateBill() {
		double chargePerDay = 2000;
		return daysAdmitted * chargePerDay;
	}

	// add medical record
	public void addRecord(String record) {
		this.record = record;
	}

	// view medical record
	public void viewRecords() {
		System.out.println("Medical Record: " + record);
	}
}
