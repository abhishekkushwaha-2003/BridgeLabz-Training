package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class  ReadLargeCSVFile {

    public static void main(String[] args) {

        int totalCount = 0;
        int batchSize = 100;

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/largeStudents.csv"));

            String line;
            int batchCount = 0;

            br.readLine();

            while ((line = br.readLine()) != null) {

                batchCount++;
                totalCount++;


                if (batchCount == batchSize) {
                    System.out.println(
                        "Processed records: " + totalCount
                    );
                    batchCount = 0; 
                }
            }

            if (batchCount > 0) {
                System.out.println(
                    "Processed records: " + totalCount
                );
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
