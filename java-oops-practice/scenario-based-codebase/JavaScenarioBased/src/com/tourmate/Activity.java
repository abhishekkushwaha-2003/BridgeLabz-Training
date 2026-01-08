package com.tourmate;

//Activity service class
public class Activity implements IBookable {

 private String activityName;
 private double cost;

 public Activity(String activityName, double cost) {
     this.activityName = activityName;
     this.cost = cost;
 }

 public double getCost() {
     return cost;
 }

 @Override
 public void book() {
     System.out.println(activityName + " activity booked");
 }

 @Override
 public void cancel() {
     System.out.println(activityName + " activity cancelled");
 }
}
