package com.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class StudentJson {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Rahul");
        student.put("age", 20);
        student.set("subjects", subjects);

        System.out.println(student);
    }
}

