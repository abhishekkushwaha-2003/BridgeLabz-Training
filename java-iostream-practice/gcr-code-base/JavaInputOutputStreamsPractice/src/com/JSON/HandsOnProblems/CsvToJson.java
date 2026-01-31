package com.JSON.HandsOnProblems;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        CSVReader reader =
            new CSVReader(new FileReader("data/employees.csv"));

        List<String[]> rows = reader.readAll();

        String[] header = rows.get(0);
        List<Map<String, String>> jsonList = new ArrayList<>();

        for (int i = 1; i < rows.size(); i++) {
            Map<String, String> obj = new HashMap<>();
            for (int j = 0; j < header.length; j++) {
                obj.put(header[j], rows.get(i)[j]);
            }
            jsonList.add(obj);
        }

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValueAsString(jsonList)
        );

        reader.close();
    }
}
