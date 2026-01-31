package com.JSON.HandsOnProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    public String name;
    public int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<User> users = Arrays.asList(
            new User("Aman", 22),
            new User("Ravi", 28)
        );

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(users);

        System.out.println(jsonArray);
    }
}

