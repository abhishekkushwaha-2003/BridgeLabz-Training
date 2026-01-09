package com.algorithmruntimeanalysisandbigonotation.largefilereadingefficiency;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

// This class reads a large file using FileReader and measures time
class FileReaderClass {

    // This method reads file using FileReader
    static long readFile(String filePath) {

        // Storing start time
        long startTime = System.nanoTime();

        try (
            // Creating FileReader for character stream
            FileReader fr = new FileReader(filePath);

            // Wrapping FileReader with BufferedReader
            BufferedReader br = new BufferedReader(fr)
        ) {

            // Variable to store each line
            String line;

            // Reading file line by line
            while ((line = br.readLine()) != null) {
                // Just reading, no processing needed
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Storing end time
        long endTime = System.nanoTime();

        // Returning total time taken
        return endTime - startTime;
    }
}
