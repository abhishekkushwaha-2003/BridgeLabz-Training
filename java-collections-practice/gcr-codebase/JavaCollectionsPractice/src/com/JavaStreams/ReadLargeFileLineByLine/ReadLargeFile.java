package com.JavaStreams.ReadLargeFileLineByLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadLargeFile {

    public static void main(String[] args) {

        // File path (keep file in project root or use absolute path)
        String fileName = "largefile.txt";

        // Try-with-resources ensures file is closed properly
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Case-insensitive check for word "error"
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("File error occurred: " + e.getMessage());
        }
    }
}
