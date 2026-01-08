package com.tourmate;

//Transport service class
public class Transport implements IBookable {

 // Transport type (Flight, Train, Bus)
 private String type;

 // Cost hidden (encapsulation)
 private double cost;

 // Constructor
 public Transport(String type, double cost) {
     this.type = type;
     this.cost = cost;
 }

 // Getter for transport cost
 public double getCost() {
     return cost;
 }

 @Override
 public void book() {
     System.out.println(type + " transport booked");
 }

 @Override
 public void cancel() {
     System.out.println(type + " transport cancelled");
 }
}
