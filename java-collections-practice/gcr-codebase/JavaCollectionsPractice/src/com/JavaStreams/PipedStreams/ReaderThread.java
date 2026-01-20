package com.JavaStreams.PipedStreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


//Reader thread
class ReaderThread extends Thread {

 private PipedInputStream inputStream;

 ReaderThread(PipedInputStream inputStream) {
     this.inputStream = inputStream;
 }

 public void run() {

     try {
         int data;

         // Read data from pipe
         while ((data = inputStream.read()) != -1) {
             System.out.print((char) data);
         }

         inputStream.close();

     } catch (IOException e) {
         System.out.println("Reader error: " + e.getMessage());
     }
 }
}