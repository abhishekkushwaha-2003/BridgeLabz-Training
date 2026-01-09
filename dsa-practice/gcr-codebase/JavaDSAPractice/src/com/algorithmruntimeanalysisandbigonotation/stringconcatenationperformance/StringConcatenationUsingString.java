package com.algorithmruntimeanalysisandbigonotation.stringconcatenationperformance;

//This class demonstrates string concatenation using String (inefficient)
class StringConcatenationUsingString {

 // This method concatenates string using String
 static long concatenate(int count) {

     // Initializing empty string
     String result = "";

     // Storing start time
     long startTime = System.nanoTime();

     // Concatenating string repeatedly
     for (int i = 0; i < count; i++) {
         result = result + "hello";
     }

     // Storing end time
     long endTime = System.nanoTime();

     // Returning total time taken
     return endTime - startTime;
 }
}

