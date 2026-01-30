package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateCSVData {

    public static void main(String[] args) {

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/employeesWithEmail.csv"));

            String line;

            br.readLine();

            System.out.println("Invalid Records:");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String phone = data[2];
                String email = data[3];

                boolean phoneValid = phone.matches("\\d{10}");
                boolean emailValid =
                        email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

                if (!phoneValid || !emailValid) {
                    System.out.println("Invalid row -> " + line);
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

