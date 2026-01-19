package com.GeoMeasureSolutions;

//Utility class to compare two lines
public class LineComparator {

 public static void compare(Line line1, Line line2) {

     double length1 = line1.calculateLength();
     double length2 = line2.calculateLength();

     System.out.println("Line 1 Length: " + length1);
     System.out.println("Line 2 Length: " + length2);

     if (length1 == length2) {
         System.out.println("Both lines are of equal length.");
     } else if (length1 > length2) {
         System.out.println("Line 1 is longer than Line 2.");
     } else {
         System.out.println("Line 2 is longer than Line 1.");
     }

     System.out.println("--------------------------------");
 }
}
