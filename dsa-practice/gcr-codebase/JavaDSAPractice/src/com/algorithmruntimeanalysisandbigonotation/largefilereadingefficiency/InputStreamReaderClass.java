package com.algorithmruntimeanalysisandbigonotation.largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// This class reads a large file using InputStreamReader and measures time
class InputStreamReaderClass {

    // This method reads file using InputStreamReader
    static long readFile(String filePath) {

        // Storing start time
        long startTime = System.nanoTime();

        try (
            // Creating FileInputStream to read bytes
            FileInputStream fis = new FileInputStream(filePath);

            // Converting byte stream to character stream
            InputStreamReader isr =
                    new InputStreamReader(fis, StandardCharsets.UTF_8);

            // Wrapping InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(isr)
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
