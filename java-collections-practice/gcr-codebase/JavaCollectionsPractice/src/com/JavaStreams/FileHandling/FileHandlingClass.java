package com.JavaStreams.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingClass {

    public static void main(String[] args) {

        // Source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Open source file
            fis = new FileInputStream(sourceFile);

            // Create destination file (if not exists)
            fos = new FileOutputStream(destinationFile);

            int data;

            // Read byte by byte and write to destination
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            // If source file does not exist or other IO error
            System.out.println("Error: Source file not found or IO problem.");
        } finally {
            // Close resources
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}

