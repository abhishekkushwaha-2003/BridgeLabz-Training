package com.Java8ConversionLogicalQuestions.MapToList;

import java.util.*;

public class MapSortByKey {
    public static void main(String[] args) {

        Map<Integer,String> map = Map.of(3,"C",1,"Java",2,"SQL");

        List<Map.Entry<Integer,String>> list =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByKey())
                   .toList();

        list.forEach(System.out::println);
    }
}
