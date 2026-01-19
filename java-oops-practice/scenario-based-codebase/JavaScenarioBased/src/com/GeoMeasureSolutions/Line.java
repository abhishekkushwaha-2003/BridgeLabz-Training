package com.GeoMeasureSolutions;

//Represents a line segment on a blueprint
public class Line {

 // Private variables (Encapsulation)
 private double x1, y1, x2, y2;

 // Constructor to initialize coordinates
 public Line(double x1, double y1, double x2, double y2) {
     this.x1 = x1;   // this keyword refers to current object
     this.y1 = y1;
     this.x2 = x2;
     this.y2 = y2;
 }

 // Method to calculate length of the line
 public double calculateLength() {
     double dx = x2 - x1;
     double dy = y2 - y1;
     return Math.sqrt(dx * dx + dy * dy);
 }
}
