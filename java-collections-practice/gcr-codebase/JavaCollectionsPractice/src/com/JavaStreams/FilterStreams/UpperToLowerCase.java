package com.JavaStreams.FilterStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class UpperToLowerCase {

    public static void main(String[] args) {

        // Input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Try-with-resources for auto closing streams
        try (
            BufferedReader reader =
                    new BufferedReader(new FileReader(inputFile));

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Convert line to lowercase
                String lowerCaseLine = line.toLowerCase();

                // Write to output file
                writer.write(lowerCaseLine);
                writer.newLine();
            }

            System.out.println("File converted successfully.");

        } catch (IOException e) {
            System.out.println("File error occurred: " + e.getMessage());
        }
    }
}
