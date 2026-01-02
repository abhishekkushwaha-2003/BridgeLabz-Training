package com.encapsulationpolymorphisminterfaceandabstractclass;

//DVD class
class DVD extends LibraryItem implements Reservable {

	DVD(int id, String title, String author) {
		super(id, title, author);
	}

	// loan duration for DVD
	int getLoanDuration() {
		return 3; // days
	}

	// reserve DVD
	public void reserveItem(String borrowerName) {
		if (checkAvailability()) {
			setBorrower(borrowerName);
			System.out.println("DVD reserved by " + borrowerName);
		} else {
			System.out.println("DVD not available");
		}
	}

	// check availability
	public boolean checkAvailability() {
		return isAvailable();
	}
}
