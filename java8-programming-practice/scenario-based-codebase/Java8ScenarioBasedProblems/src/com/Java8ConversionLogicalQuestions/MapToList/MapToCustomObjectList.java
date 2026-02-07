package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;

class Pair {
    int id;
    String name;

    Pair(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }
}

public class MapToCustomObjectList {
    public static void main(String[] args) {

        Map<Integer, String> map = Map.of(1,"Java",2,"SQL");

        List<Pair> list = map.entrySet()
                .stream()
                .map(e -> new Pair(e.getKey(), e.getValue()))
                .toList();

        System.out.println(list);
    }
}
