package com.algorithmruntimeanalysisandbigonotation.stringconcatenationperformance;

//This class demonstrates string concatenation using StringBuilder
class StringConcatenationUsingStringBuilder {

 // This method concatenates string using StringBuilder
 static long concatenate(int count) {

     // Creating StringBuilder object
     StringBuilder sb = new StringBuilder();

     // Storing start time
     long startTime = System.nanoTime();

     // Appending string repeatedly
     for (int i = 0; i < count; i++) {
         sb.append("hello");
     }

     // Storing end time
     long endTime = System.nanoTime();

     // Returning total time taken
     return endTime - startTime;
 }
}
