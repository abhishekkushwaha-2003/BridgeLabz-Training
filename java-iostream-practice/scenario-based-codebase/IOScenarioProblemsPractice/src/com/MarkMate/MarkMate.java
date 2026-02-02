package com.MarkMate;

import com.opencsv.CSVReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class MarkMate {
    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("marks.csv"));
        List<String[]> rows = reader.readAll();
        reader.close();

        List<Map<String, Object>> report = new ArrayList<>();

        for (int i = 1; i < rows.size(); i++) {
            String[] r = rows.get(i);

            int total = Integer.parseInt(r[2]) +
                        Integer.parseInt(r[3]) +
                        Integer.parseInt(r[4]);
            double avg = total / 3.0;

            String grade = avg >= 75 ? "A" : avg >= 60 ? "B" : "C";

            Map<String, Object> student = new LinkedHashMap<>();
            student.put("id", r[0]);
            student.put("name", r[1]);
            student.put("total", total);
            student.put("average", avg);
            student.put("grade", grade);

            report.add(student);
        }

        new ObjectMapper()
            .writerWithDefaultPrettyPrinter()
            .writeValue(new File("marksheet.json"), report);

        System.out.println("Marksheet generated");
    }
}
