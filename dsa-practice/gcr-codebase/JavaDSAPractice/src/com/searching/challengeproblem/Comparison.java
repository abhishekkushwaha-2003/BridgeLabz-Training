package com.searching.challengeproblem;


//This class compares StringBuilder, StringBuffer, FileReader, and InputStreamReader
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

class Comparison {

 // Main method
 public static void main(String[] args) {

     // Number of times string will be concatenated
     int repeatCount = 1_000_000;

     // ---------------- StringBuilder Performance ----------------

     // Creating StringBuilder object
     StringBuilder sb = new StringBuilder();

     // Storing start time for StringBuilder
     long sbStartTime = System.nanoTime();

     // Concatenating string using StringBuilder
     for (int i = 0; i < repeatCount; i++) {
         sb.append("hello");
     }

     // Storing end time for StringBuilder
     long sbEndTime = System.nanoTime();

     // Calculating total time taken by StringBuilder
     long sbTime = sbEndTime - sbStartTime;

     // Printing StringBuilder time
     System.out.println("StringBuilder Time (ns): " + sbTime);

     // ---------------- StringBuffer Performance ----------------

     // Creating StringBuffer object
     StringBuffer stringBuffer = new StringBuffer();

     // Storing start time for StringBuffer
     long bufferStartTime = System.nanoTime();

     // Concatenating string using StringBuffer
     for (int i = 0; i < repeatCount; i++) {
         stringBuffer.append("hello");
     }

     // Storing end time for StringBuffer
     long bufferEndTime = System.nanoTime();

     // Calculating total time taken by StringBuffer
     long bufferTime = bufferEndTime - bufferStartTime;

     // Printing StringBuffer time
     System.out.println("StringBuffer Time (ns): " + bufferTime);

     // ---------------- FileReader Word Count ----------------

     // Variable to store total word count
     long fileReaderWordCount = 0;

     // Storing start time for FileReader
     long frStartTime = System.nanoTime();

     try (
         // Creating FileReader to read text file
         FileReader fr = new FileReader("filereader.txt");

         // Wrapping FileReader with BufferedReader
         BufferedReader br = new BufferedReader(fr)
     ) {

         // Variable to store each line
         String line;

         // Reading file line by line
         while ((line = br.readLine()) != null) {

             // Splitting line into words using whitespace
             String[] words = line.trim().split("\\s+");

             // Checking to avoid empty lines
             if (!line.trim().isEmpty()) {
                 fileReaderWordCount += words.length;
             }
         }

     } catch (IOException e) {
         e.printStackTrace();
     }

     // Storing end time for FileReader
     long frEndTime = System.nanoTime();

     // Calculating FileReader execution time
     long frTime = frEndTime - frStartTime;

     // Printing FileReader results
     System.out.println("FileReader Word Count: " + fileReaderWordCount);
     System.out.println("FileReader Time (ns): " + frTime);

     // ---------------- InputStreamReader Word Count ----------------

     // Variable to store total word count
     long isrWordCount = 0;

     // Storing start time for InputStreamReader
     long isrStartTime = System.nanoTime();

     try (
         // Creating FileInputStream to read binary data
         FileInputStream fis = new FileInputStream("filereader.txt");

         // Converting byte stream to character stream using UTF-8
         InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

         // Wrapping InputStreamReader with BufferedReader
         BufferedReader br = new BufferedReader(isr)
     ) {

         // Variable to store each line
         String line;

         // Reading file line by line
         while ((line = br.readLine()) != null) {

             // Splitting line into words using whitespace
             String[] words = line.trim().split("\\s+");

             // Checking to avoid empty lines
             if (!line.trim().isEmpty()) {
                 isrWordCount += words.length;
             }
         }

     } catch (IOException e) {
         e.printStackTrace();
     }

     // Storing end time for InputStreamReader
     long isrEndTime = System.nanoTime();

     // Calculating InputStreamReader execution time
     long isrTime = isrEndTime - isrStartTime;

     // Printing InputStreamReader results
     System.out.println("InputStreamReader Word Count: " + isrWordCount);
     System.out.println("InputStreamReader Time (ns): " + isrTime);
 }
}
