package com.inheritance.hybridinheritance;

public class ResturantMain {
		public static void main(String[] args) {

			Chef chef = new Chef("Rohit", 101, "Italian");
			Waiter waiter = new Waiter("Aman", 201, 5);

			chef.displayPerson();
			chef.performDuties();
			System.out.println();

			waiter.displayPerson();
			waiter.performDuties();
		}
	}
