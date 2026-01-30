package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    String id;
    String name;
    int age;
    int marks;

    Student(String id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class ConvertCSVDataIntoJavaObjects {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data/students.csv"));

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                Student s = new Student(
                        data[0],
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                students.add(s);
            }

            br.close();

            System.out.println("Student Objects:");
            for (Student s : students) {
                System.out.println(
                    "ID: " + s.id +
                    ", Name: " + s.name +
                    ", Age: " + s.age +
                    ", Marks: " + s.marks
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
