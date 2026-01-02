package com.encapsulationpolymorphisminterfaceandabstractclass;
//book class
class Book extends LibraryItem implements Reservable {

	Book(int id, String title, String author) {
		super(id, title, author);
	}

	// loan duration for book
	int getLoanDuration() {
		return 14; // days
	}

	// reserve book
	public void reserveItem(String borrowerName) {
		if (checkAvailability()) {
			setBorrower(borrowerName);
			System.out.println("Book reserved by " + borrowerName);
		} else {
			System.out.println("Book not available");
		}
	}

	// check availability
	public boolean checkAvailability() {
		return isAvailable();
	}
}

