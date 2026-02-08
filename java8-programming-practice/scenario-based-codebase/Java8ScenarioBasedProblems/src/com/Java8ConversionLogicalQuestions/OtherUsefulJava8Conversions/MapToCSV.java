package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class MapToCSV {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",1,"B",2);

        System.out.println(
            map.entrySet().stream()
                .map(e -> e.getKey()+"="+e.getValue())
                .collect(Collectors.joining(","))
        );
    }
}
