package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class ListToCSV {
    public static void main(String[] args) {
        System.out.println(List.of("A","B","C")
            .stream().collect(Collectors.joining(",")));
    }
}
