package com.ExceptionHandling.CheckedExceptionCompileTime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CheckedException{

    public static void main(String[] args) {

        String fileName = "data.txt";

        try {
            // Try to open and read the file
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            // Handle file not found or read error
            System.out.println("File not found");
        }
    }
}
