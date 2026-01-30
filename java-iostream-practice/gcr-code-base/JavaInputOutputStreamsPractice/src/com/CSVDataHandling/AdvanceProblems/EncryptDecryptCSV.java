package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;

public class EncryptDecryptCSV {


    private static String encrypt(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes());
    }

   
    private static String decrypt(String value) {
        return new String(Base64.getDecoder().decode(value));
    }

    public static void main(String[] args) {

        try {
  
            BufferedReader br =
                new BufferedReader(new FileReader("data/employeesPlain.csv"));

            BufferedWriter bw =
                new BufferedWriter(new FileWriter("output/employeesEncrypted.csv"));

            String line;

  
            bw.write("ID,Name,Email,Salary");
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String encryptedEmail = encrypt(data[2]);
                String encryptedSalary = encrypt(data[3]);

                bw.write(
                    data[0] + "," +
                    data[1] + "," +
                    encryptedEmail + "," +
                    encryptedSalary
                );
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("CSV written with encrypted data");

           
            BufferedReader encryptedReader =
                new BufferedReader(new FileReader("output/employeesEncrypted.csv"));

            encryptedReader.readLine(); // skip header

            System.out.println("\nDecrypted Data:");

            while ((line = encryptedReader.readLine()) != null) {
                String[] data = line.split(",");

                String decryptedEmail = decrypt(data[2]);
                String decryptedSalary = decrypt(data[3]);

                System.out.println(
                    data[0] + " | " +
                    data[1] + " | " +
                    decryptedEmail + " | " +
                    decryptedSalary
                );
            }

            encryptedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

