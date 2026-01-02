package com.encapsulationpolymorphisminterfaceandabstractclass;

//magazine class
class Magazine extends LibraryItem implements Reservable {

	Magazine(int id, String title, String author) {
		super(id, title, author);
	}

	// loan duration for magazine
	int getLoanDuration() {
		return 7; // days
	}

	// reserve magazine
	public void reserveItem(String borrowerName) {
		if (checkAvailability()) {
			setBorrower(borrowerName);
			System.out.println("Magazine reserved by " + borrowerName);
		} else {
			System.out.println("Magazine not available");
		}
	}

	// check availability
	public boolean checkAvailability() {
		return isAvailable();
	}
}
