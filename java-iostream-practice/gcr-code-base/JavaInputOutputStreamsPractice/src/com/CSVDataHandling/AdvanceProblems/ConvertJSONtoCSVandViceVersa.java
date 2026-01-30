package com.CSVDataHandling.AdvanceProblems;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJSONtoCSVandViceVersa {

 
    static class Student {
        public int id;
        public String name;
        public int age;
        public int marks;
    }

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

          
            List<Student> students = mapper.readValue(
                new File("data/students.json"),
                new TypeReference<List<Student>>() {}
            );

            BufferedWriter bw =
                new BufferedWriter(new FileWriter("data/students.csv"));

           
            bw.write("ID,Name,Age,Marks");
            bw.newLine();

            for (Student s : students) {
                bw.write(
                    s.id + "," +
                    s.name + "," +
                    s.age + "," +
                    s.marks
                );
                bw.newLine();
            }
            bw.close();

            System.out.println("JSON converted to CSV successfully");

          
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(
                      new File("output/students_back.json"),
                      students
                  );

            System.out.println("CSV converted back to JSON successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
