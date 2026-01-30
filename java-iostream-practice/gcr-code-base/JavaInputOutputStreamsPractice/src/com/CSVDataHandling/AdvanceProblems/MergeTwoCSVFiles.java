package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCSVFiles {

    public static void main(String[] args) {

        try {
            
            Map<String, String[]> map = new HashMap<>();

            BufferedReader br1 =
                new BufferedReader(new FileReader("data/students1.csv"));

            String line;
            br1.readLine(); 

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], new String[]{data[1], data[2]});
            }
            br1.close();

            BufferedReader br2 =
                new BufferedReader(new FileReader("data/students2.csv"));

            BufferedWriter bw =
                new BufferedWriter(new FileWriter("output/mergedStudents.csv"));

            
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br2.readLine(); 

            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (map.containsKey(id)) {
                    String[] student = map.get(id);

                    bw.write(
                        id + "," +
                        student[0] + "," +
                        student[1] + "," +
                        data[1] + "," +
                        data[2]
                    );
                    bw.newLine();
                }
            }

            br2.close();
            bw.close();

            System.out.println("CSV files merged successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
