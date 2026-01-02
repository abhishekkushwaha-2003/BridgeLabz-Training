package com.encapsulationpolymorphisminterfaceandabstractclass;
//abstract class for library items
abstract class LibraryItem {

	// private fields (secured)
	private int itemId;
	private String title;
	private String author;

	// borrower details (kept private)
	private String borrowerName;
	private boolean isAvailable = true;

	// constructor
	LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// getters (no direct access)
	int getItemId() {
		return itemId;
	}

	String getTitle() {
		return title;
	}

	String getAuthor() {
		return author;
	}

	// abstract method for loan duration
	abstract int getLoanDuration();

	// concrete method
	void getItemDetails() {
		System.out.println("Item ID: " + itemId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}

	// protected method to update borrower
	protected void setBorrower(String name) {
		this.borrowerName = name;
		isAvailable = false;
	}

	// protected method to check availability
	protected boolean isAvailable() {
		return isAvailable;
	}
}
