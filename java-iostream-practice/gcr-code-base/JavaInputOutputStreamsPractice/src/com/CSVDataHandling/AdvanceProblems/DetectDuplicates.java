package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicates {

    public static void main(String[] args) {

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/studentsWithDuplicates.csv"));

            Set<String> uniqueIds = new HashSet<>();
            String line;

            br.readLine();

            System.out.println("Duplicate Records:");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!uniqueIds.add(id)) {
               
                    System.out.println(line);
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
