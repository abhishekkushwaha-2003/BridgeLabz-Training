package com.JSON.HandsOnProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.*;

public class DbToJsonReport {
    public static void main(String[] args) throws Exception {

        List<Map<String, Object>> report = new ArrayList<>();

        // assume resultSet already fetched
        Map<String, Object> row = new HashMap<>();
        row.put("id", 1);
        row.put("name", "Rahul");
        row.put("salary", 50000);

        report.add(row);

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(report));
    }
}
