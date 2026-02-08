package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class ListToJson {
    public static void main(String[] args) {
        System.out.println(
            List.of("A","B")
                .stream()
                .map(v -> "\"" + v + "\"")
                .collect(Collectors.joining(",", "[", "]"))
        );
    }
}
