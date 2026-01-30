package com.CSVDataHandling.IntermediateProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSVFile {

    public static void main(String[] args) {

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/employees.csv"));

            BufferedWriter bw =
                new BufferedWriter(new FileWriter("output/updatedEmployees.csv"));

            String line;

          
            line = br.readLine();
            bw.write(line);
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {
                    int salary = Integer.parseInt(data[3]);
                    salary = salary + (salary * 10 / 100);
                    data[3] = String.valueOf(salary);
                }

                bw.write(String.join(",", data));
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Updated CSV file created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
