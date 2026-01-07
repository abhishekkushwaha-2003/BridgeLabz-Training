package com.searching.inputstreamreader;

// create a  class to  reads user input from console using InputStreamReader and writes it to a file
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadInputAndWriteToFile {

    // Main method
    public static void main(String[] args) {

        // Using try-with-resources to close resources automatically
        try (
            // Creating InputStreamReader to read input from console
            InputStreamReader isr = new InputStreamReader(System.in);

            // Wrapping InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(isr);

            // Creating FileWriter to write data into file
            FileWriter fw = new FileWriter("output.txt")
        ) {

            // Variable to store user input
            String input;

            // Asking user to enter text
            System.out.println("Enter text (type 'exit' to stop):");

            // Reading input until user types 'exit'
            while (true) {

                // Reading one line from console
                input = br.readLine();

                // Checking if user wants to stop input
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Writing user input to file with new line
                fw.write(input + System.lineSeparator());
            }

            // Printing message after writing is completed
            System.out.println("Input successfully written to output.txt");

        } catch (IOException e) {

            // Handling input and output related exceptions
            e.printStackTrace();
        }
    }
}
