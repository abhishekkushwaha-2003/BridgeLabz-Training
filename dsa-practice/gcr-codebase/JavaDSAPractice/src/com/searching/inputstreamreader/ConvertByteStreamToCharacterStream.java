package com.searching.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// create a class to  reads a binary file and converts it to characters using InputStreamReader
	
public class ConvertByteStreamToCharacterStream {

	    // Main method
	    public static void main(String[] args) {

	        // Using try-with-resources to close resources automatically
	        try (
	            // Creating FileInputStream to read binary data from file
	            FileInputStream fis = new FileInputStream("filereader.txt");

	            // Converting byte stream to character stream using UTF-8 charset
	            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

	            // Wrapping InputStreamReader with BufferedReader for efficient reading
	            BufferedReader br = new BufferedReader(isr)
	        ) {

	            // Variable to store each line from the file
	            String line;

	            // Reading file line by line
	            while ((line = br.readLine()) != null) {

	                // Printing current line to console
	                System.out.println(line);
	            }

	        } catch (IOException e) {

	            // Handling file and encoding related exceptions
	            e.printStackTrace();
	        }
	    }
	}
