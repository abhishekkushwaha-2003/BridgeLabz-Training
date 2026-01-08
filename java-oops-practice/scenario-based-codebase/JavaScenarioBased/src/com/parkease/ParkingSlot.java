package com.parkease;

//Class representing a parking slot
public class ParkingSlot {

 // Unique slot ID
 private String slotId;

 // Slot availability (cannot be changed directly)
 private boolean isOccupied;

 // Allowed vehicle type for this slot
 private String vehicleTypeAllowed;

 // Internal booking log (private)
 private String bookingLog;

 // Constructor to initialize parking slot
 public ParkingSlot(String slotId, String vehicleTypeAllowed) {
     this.slotId = slotId;
     this.vehicleTypeAllowed = vehicleTypeAllowed;
     this.isOccupied = false;
     this.bookingLog = "Slot Created\n";
 }

 // Method to occupy slot
 public void occupySlot(Vehicle vehicle) {
     if (!isOccupied) {
         isOccupied = true;
         bookingLog += "Slot occupied by " + vehicle.vehicleNumber + "\n";
     } else {
         System.out.println("Slot already occupied");
     }
 }

 // Method to vacate slot
 public void vacateSlot() {
     isOccupied = false;
     bookingLog += "Slot vacated\n";
 }

 // Getter to check availability
 public boolean isAvailable() {
     return !isOccupied;
 }

 // Public method to view booking logs
 public String getBookingLog() {
     return bookingLog;
 }
}
