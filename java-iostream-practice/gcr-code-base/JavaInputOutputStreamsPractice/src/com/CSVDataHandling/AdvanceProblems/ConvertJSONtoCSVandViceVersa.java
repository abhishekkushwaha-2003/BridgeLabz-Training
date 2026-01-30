package com.CSVDataHandling.AdvanceProblems;

import com.fasterxml.jackson.databind.*;
import java.io.FileWriter;

public class ConvertJSONtoCSVandViceVersa {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new java.io.File("data/students.json"));

        FileWriter writer = new FileWriter("output/updated_students.csv");
        writer.write("ID,Name,Age,Marks\n");

        for(JsonNode node : root) {
            writer.write(
                node.get("id").asInt() + "," +
                node.get("name").asText() + "," +
                node.get("age").asInt() + "," +
                node.get("marks").asInt() + "\n"
            );
        }

        writer.close();
    }
}