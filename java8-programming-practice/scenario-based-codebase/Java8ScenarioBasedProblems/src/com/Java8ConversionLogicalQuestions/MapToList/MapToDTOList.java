package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;

class EmployeeDTO {
    int id;
    String name;

    EmployeeDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class MapToDTOList {
    public static void main(String[] args) {

        Map<Integer,String> map = Map.of(
                101,"Rahul",
                102,"Amit"
        );

        List<EmployeeDTO> list =
                map.entrySet()
                   .stream()
                   .map(e -> new EmployeeDTO(e.getKey(), e.getValue()))
                   .toList();

        list.forEach(System.out::println);
    }
}
