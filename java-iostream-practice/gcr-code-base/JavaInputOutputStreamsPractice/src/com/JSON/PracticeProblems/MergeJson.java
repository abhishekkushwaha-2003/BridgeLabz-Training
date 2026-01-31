package com.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Alice");
        json1.put("age", 25);

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("email", "alice@gmail.com");
        json2.put("city", "Delhi");

        json1.setAll(json2);

        System.out.println(json1);
    }
}

