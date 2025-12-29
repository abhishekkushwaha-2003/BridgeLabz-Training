package com.constructorandaccessmodifier.level1;

//CarRentalSystem class
//this class stores car rental details

public class CarRental {

 String customerName;
 String carModel;
 int rentalDays;
 double totalCost;

 // default constructor
 // used when no values are passed
 CarRental() {
     customerName = "Customer";
     carModel = "Hatchback";
     rentalDays = 1;
     totalCost = calculateCost();
 }

 // parameterized constructor
 // used to pass values while creating object
 CarRental(String customerName, String carModel, int rentalDays) {
     this.customerName = customerName;
     this.carModel = carModel;
     this.rentalDays = rentalDays;
     totalCost = calculateCost();
 }

 // method to calculate total rental cost
 double calculateCost() {
     double costPerDay;

     // checking car model
     if (carModel.equalsIgnoreCase("SUV")) {
         costPerDay = 2500;
     } else if (carModel.equalsIgnoreCase("Sedan")) {
         costPerDay = 2000;
     } else {
         costPerDay = 1500; 
     }

     return costPerDay * rentalDays;
 }

 // method to display rental details
 void displayRentalDetails() {
     System.out.println("Customer Name : " + customerName);
     System.out.println("Car Model     : " + carModel);
     System.out.println("Rental Days   : " + rentalDays);
     System.out.println("Total Cost    : Rs. " + totalCost);
 }
}


