package com.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("users.json"));

        for (JsonNode user : root) {
            if (user.get("age").asInt() > 25) {
                System.out.println(user.get("name").asText());
            }
        }
    }
}
