package com.ExceptionHandling.TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TryWithResource {

    public static void main(String[] args) {

        String fileName = "info.txt";

        // try-with-resources automatically closes the file
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            // Read only the first line
            String firstLine = reader.readLine();

            if (firstLine != null) {
                System.out.println(firstLine);
            }

        } catch (IOException e) {
            // Handles file not found or read error
            System.out.println("Error reading file");
        }
    }
}
