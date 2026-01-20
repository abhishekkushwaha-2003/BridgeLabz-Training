package com.JavaStreams.DataStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // -------- Writing data to binary file --------
        try (DataOutputStream dos =
                     new DataOutputStream(
                             new FileOutputStream(fileName))) {

            int rollNumber = 101;
            String name = "Abhishek";
            double cgpa = 8.5;

            // Writing primitive data
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(cgpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing file: " + e.getMessage());
        }

        // -------- Reading data from binary file --------
        try (DataInputStream dis =
                     new DataInputStream(
                             new FileInputStream(fileName))) {

            // Reading data in same order
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double cgpa = dis.readDouble();

            System.out.println("\nStudent Data Read from File:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + cgpa);

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
    }
}
