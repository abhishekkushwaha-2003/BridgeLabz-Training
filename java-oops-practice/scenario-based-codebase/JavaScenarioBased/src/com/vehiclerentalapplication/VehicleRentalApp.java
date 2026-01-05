package com.vehiclerentalapplication;

	import java.util.ArrayList;

	public class VehicleRentalApp {

		// helper method to process rent
		static void processRental(Rentable vehicle, int days) {
			System.out.println("Total Rent for " + days + " days: " + vehicle.calculateRent(days));
			System.out.println("-----------------------");
		}

		public static void main(String[] args) {

			// customer object
			Customer c1 = new Customer(101, "Rahul");
			c1.displayCustomer();

			System.out.println("-----------------------");

			// vehicle objects
			Rentable v1 = new Bike(1, 300);
			Rentable v2 = new Car(2, 800);
			Rentable v3 = new Truck(3, 1200);

			// polymorphism in action
			processRental(v1, 3);
			processRental(v2, 3);
			processRental(v3, 3);
		}
	}

