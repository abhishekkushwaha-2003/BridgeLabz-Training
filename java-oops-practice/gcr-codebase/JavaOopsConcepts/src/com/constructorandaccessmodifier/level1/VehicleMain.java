package com.constructorandaccessmodifier.level1;

// VehicleMain class
// this class contains the main method
public class VehicleMain {

	    public static void main(String[] args) {

	        // creating vehicle objects
	        Vehicle v1 = new Vehicle("Ramesh", "Two Wheeler");
	        Vehicle v2 = new Vehicle("Suresh", "Four Wheeler");

	        // displaying vehicle details before fee update
	        System.out.println("Vehicle Details Before Fee Update:\n");
	        v1.displayVehicleDetails();
	        System.out.println();
	        v2.displayVehicleDetails();

	        // updating registration fee using class method
	        Vehicle.updateRegistrationFee(2000);

	        // displaying vehicle details after fee update
	        System.out.println("\nVehicle Details After Fee Update:\n");
	        v1.displayVehicleDetails();
	        System.out.println();
	        v2.displayVehicleDetails();
	    }
	}
