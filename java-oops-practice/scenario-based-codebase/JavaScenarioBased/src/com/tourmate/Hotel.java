package com.tourmate;

//Hotel service class
public class Hotel implements IBookable {

 private String name;
 private double cost;

 public Hotel(String name, double cost) {
     this.name = name;
     this.cost = cost;
 }

 public double getCost() {
     return cost;
 }

 @Override
 public void book() {
     System.out.println("Hotel " + name + " booked");
 }

 @Override
 public void cancel() {
     System.out.println("Hotel " + name + " cancelled");
 }
}

