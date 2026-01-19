package com.JavaStreams.ReadUserInputFromConsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoToFile {

    public static void main(String[] args) {

        BufferedReader br = null;
        FileWriter writer = null;

        try {
            // Read input from console
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data to file
            writer = new FileWriter("user_info.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("\nUser information saved to file successfully.");

        } catch (IOException e) {
            System.out.println("Error occurred while reading input or writing file.");
        } finally {
            // Close resources
            try {
                if (br != null)
                    br.close();
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}
