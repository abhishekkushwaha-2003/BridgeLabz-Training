package com.inheritance.hybridinheritance;

//Waiter class (Hybrid Inheritance)
class Waiter extends Person implements Worker {

	// unique attribute
	int tableCount;

	Waiter(String name, int id, int tableCount) {
		super(name, id);
		this.tableCount = tableCount;
	}

	// implementation of interface method
	public void performDuties() {
		System.out.println("Waiter is serving " + tableCount + " tables.");
	}
}

