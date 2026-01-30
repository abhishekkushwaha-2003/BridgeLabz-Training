package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchForRecord {

    public static void main(String[] args) {

        String searchName = "Rahul"; 

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/employees.csv"));

            String line;

            
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println(
                        "Name: " + data[1] +
                        ", Department: " + data[2] +
                        ", Salary: " + data[3]
                    );
                    break; 
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
