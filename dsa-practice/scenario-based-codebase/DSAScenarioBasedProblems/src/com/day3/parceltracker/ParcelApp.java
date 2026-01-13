package com.day3.parceltracker;

//Main application
public class ParcelApp {

 public static void main(String[] args) {

     ParcelTracker tracker = new ParcelTracker();

     tracker.trackParcel();

     tracker.addCheckpointAfter("Shipped", "Customs Clearance");
     tracker.trackParcel();

     tracker.markLostAfter("In Transit");
     tracker.trackParcel();
 }
}
