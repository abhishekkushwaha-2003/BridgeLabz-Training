package com.inheritance.hybridinheritance;

//Chef class (Hybrid Inheritance)
class Chef extends Person implements Worker {

	// unique attribute
	String speciality;

	Chef(String name, int id, String speciality) {
		super(name, id);
		this.speciality = speciality;
	}

	// implementation of interface method
	public void performDuties() {
		System.out.println("Chef is cooking " + speciality + " dishes.");
	}
}

