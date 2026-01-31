package com.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public String name;
    public int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Student> list = Arrays.asList(
            new Student("Aman", 22),
            new Student("Ravi", 24)
        );

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(list);

        System.out.println(jsonArray);
    }
}
