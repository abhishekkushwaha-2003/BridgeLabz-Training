package com.algorithmruntimeanalysisandbigonotation.stringconcatenationperformance;


//This class compares String, StringBuilder and StringBuffer performance
class StringConcatinationResult {

 // Main method
 public static void main(String[] args) {

     // Defining number of concatenation operations
     int count = 100_000;

     // Measuring time using String
     long stringTime =
             StringConcatenationUsingString.concatenate(count);

     // Measuring time using StringBuilder
     long stringBuilderTime =
             StringConcatenationUsingStringBuilder.concatenate(count);

     // Measuring time using StringBuffer
     long stringBufferTime =
             StringConcatenationUsingStringBuffer.concatenate(count);

     // Printing results
     System.out.println("String Time (ns): " + stringTime);
     System.out.println("StringBuilder Time (ns): " + stringBuilderTime);
     System.out.println("StringBuffer Time (ns): " + stringBufferTime);
 }
}

