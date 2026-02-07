package com.Java8ConversionLogicalQuestions.MapToList;
import java.util.*;

public class MapKeysWhereValueEven {
    public static void main(String[] args) {

        Map<String,Integer> map = Map.of(
                "A",2,
                "B",7,
                "C",8,
                "D",5
        );

        List<String> keys =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() % 2 == 0)
                   .map(Map.Entry::getKey)
                   .toList();

        System.out.println(keys);
    }
}
