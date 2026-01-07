package com.searching.filereader;

// This class reads a text file line by line using FileReader
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class ReadFileLineByLine {

    // Main method
    public static void main(String[] args) {

        // Declaring BufferedReader reference
        BufferedReader br = null;

        try {
            // Creating FileReader object to read the file
            FileReader fr = new FileReader("filereader.txt");

            // Wrapping FileReader with BufferedReader for efficient reading
            br = new BufferedReader(fr);

            // Variable to store each line from file
            String line;

            // Reading file line by line until end of file
            while ((line = br.readLine()) != null) {

                // Printing current line to console
                System.out.println(line);
            }

        } catch (IOException e) {

            // Handling file related exceptions
            e.printStackTrace();

        } finally {

            try {
                // Closing BufferedReader to release resources
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {

                // Handling exception while closing the file
                e.printStackTrace();
            }
        }
    }
}
