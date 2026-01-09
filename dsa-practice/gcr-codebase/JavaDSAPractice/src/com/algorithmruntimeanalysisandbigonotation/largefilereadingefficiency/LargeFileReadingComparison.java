package com.algorithmruntimeanalysisandbigonotation.largefilereadingefficiency;


//This class compares FileReader and InputStreamReader performance
class LargeFileReadingComparison {

 // Main method
 public static void main(String[] args) {

     // Path of large file (change according to your system)
     String filePath = "largefile.txt";

     // Measuring FileReader performance
     long fileReaderTime =
             FileReaderClass.readFile(filePath);

     // Measuring InputStreamReader performance
     long inputStreamReaderTime =
             InputStreamReaderClass.readFile(filePath);

     // Printing execution times
     System.out.println("FileReader Time (ns): " + fileReaderTime);
     System.out.println("InputStreamReader Time (ns): " + inputStreamReaderTime);
 }
}

