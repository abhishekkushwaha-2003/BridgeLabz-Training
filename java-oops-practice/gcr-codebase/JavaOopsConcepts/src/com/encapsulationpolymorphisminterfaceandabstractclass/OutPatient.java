package com.encapsulationpolymorphisminterfaceandabstractclass;

//outpatient class
class OutPatient extends Patient implements MedicalRecord {

	private String record;

	OutPatient(int id, String name, int age) {
		super(id, name, age);
	}

	// bill calculation for outpatient
	double calculateBill() {
		double consultationFee = 500;
		return consultationFee;
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

