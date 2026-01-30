package com.CSVDataHandling.BasicProblems;

import java.io.*;

public class WriteDataToCSVFile {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw =
            new BufferedWriter(new FileWriter("data/employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("101,Rahul,IT,60000\n");
        bw.write("102,Amit,HR,50000\n");
        bw.write("103,Neha,Finance,65000\n");
        bw.write("104,Pooja,Sales,55000\n");
        bw.write("105,Ankit,IT,70000\n");

        bw.close();
        System.out.println("employees.csv created");
    }
}

