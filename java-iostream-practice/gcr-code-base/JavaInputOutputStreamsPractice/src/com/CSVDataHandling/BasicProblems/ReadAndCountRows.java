package com.CSVDataHandling.BasicProblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndCountRows {

    public static void main(String[] args) {

        int count = 0;

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/students.csv"));

            br.readLine();

            while (br.readLine() != null) {
                count++;
            }

            br.close();
            System.out.println("Total records (excluding header): " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
