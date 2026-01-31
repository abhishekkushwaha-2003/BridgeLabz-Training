package com.JSON.IPLAndCensorAnalyzer;


public class IPLapp {
    public static void main(String[] args) {

        try {
            JsonIplProcessor.processJson(
                "data/ipl.json",
                "data/ipl_censored.json"
            );

            CsvIplProcessor.processCsv(
                "data/ipl.csv",
                "data/ipl_censored.csv"
            );

            System.out.println(" IPL Data Censored Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
