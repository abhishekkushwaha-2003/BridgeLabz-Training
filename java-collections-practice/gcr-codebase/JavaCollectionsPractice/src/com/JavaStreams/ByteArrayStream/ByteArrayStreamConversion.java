package com.JavaStreams.ByteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStreamConversion {

    public static void main(String[] args) {

        String sourceImage = "virat.jpg";
        String destinationImage = "copied.jpg";

        try {
            // Step 1: Read image file into ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            // Convert output stream to byte array
            byte[] imageBytes = baos.toByteArray();
            baos.close();

            // Step 2: Write byte array back to new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destinationImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image copied successfully using ByteArray Streams.");

        } catch (IOException e) {
            System.out.println("IO Error occurred: " + e.getMessage());
        }
    }
}

