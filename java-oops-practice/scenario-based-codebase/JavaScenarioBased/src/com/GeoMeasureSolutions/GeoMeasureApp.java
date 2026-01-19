package com.GeoMeasureSolutions;

import java.util.ArrayList;

//Main class – program execution starts here
public class GeoMeasureApp {

 public static void main(String[] args) {

     // Creating multiple line pairs (BONUS)
     ArrayList<Line[]> comparisons = new ArrayList<>();

     comparisons.add(new Line[] {
         new Line(0, 0, 3, 4),   // length = 5
         new Line(1, 1, 4, 5)    // length = 5
     });

     comparisons.add(new Line[] {
         new Line(0, 0, 6, 8),   // length = 10
         new Line(0, 0, 5, 5)    // length ≈ 7.07
     });

     comparisons.add(new Line[] {
         new Line(2, 2, 5, 6),
         new Line(1, 1, 2, 2)
     });

     // Comparing all line pairs
     for (Line[] pair : comparisons) {
         LineComparator.compare(pair[0], pair[1]);
     }
 }
}
