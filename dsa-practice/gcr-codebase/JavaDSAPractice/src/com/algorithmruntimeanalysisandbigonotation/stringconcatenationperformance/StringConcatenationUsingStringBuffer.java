package com.algorithmruntimeanalysisandbigonotation.stringconcatenationperformance;

//This class demonstrates string concatenation using StringBuffer
class StringConcatenationUsingStringBuffer {

 // This method concatenates string using StringBuffer
 static long concatenate(int count) {

     // Creating StringBuffer object
     StringBuffer sb = new StringBuffer();

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
