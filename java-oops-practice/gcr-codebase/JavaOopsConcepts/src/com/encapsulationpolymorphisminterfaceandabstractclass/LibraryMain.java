package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
public class LibraryMain {
	

		public static void main(String[] args) {

			// list of library items
			ArrayList<LibraryItem> items = new ArrayList<>();

			// adding items
			items.add(new Book(1, "Java Basics", "James"));
			items.add(new Magazine(2, "Tech World", "Editorial Team"));
			items.add(new DVD(3, "Learning Java", "Oracle"));

			// loop through items
			for (LibraryItem item : items) {

				item.getItemDetails();
				System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

				// checking reservation
				if (item instanceof Reservable) {
					Reservable r = (Reservable) item;
					System.out.println("Available: " + r.checkAvailability());
					r.reserveItem("Amit");
				}

				System.out.println("--------------------------------");
			}
		}
	}

