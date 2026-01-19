package com.JavaStreams.BufferedStreams;

import java.io.*;

public class FileCopyComparison {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    // Unbuffered file copy
    public static void copyUsingFileStreams(String source, String destination)
            throws IOException {

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();
    }

    // Buffered file copy
    public static void copyUsingBufferedStreams(String source, String destination)
            throws IOException {

        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(destination));

        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;

        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }

        bis.close();
        bos.close();
    }

    public static void main(String[] args) {

        String sourceFile = "largeFile.txt"; // e.g., 100MB file
        String normalCopy = "normalCopy.txt";
        String bufferedCopy = "bufferedCopy.txt";

        try {
            // Measure time for normal streams
            long startNormal = System.nanoTime();
            copyUsingFileStreams(sourceFile, normalCopy);
            long endNormal = System.nanoTime();

            // Measure time for buffered streams
            long startBuffered = System.nanoTime();
            copyUsingBufferedStreams(sourceFile, bufferedCopy);
            long endBuffered = System.nanoTime();

            // Calculate time taken
            long normalTime = endNormal - startNormal;
            long bufferedTime = endBuffered - startBuffered;

            System.out.println("Normal Stream Time   : " + normalTime + " ns");
            System.out.println("Buffered Stream Time : " + bufferedTime + " ns");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
