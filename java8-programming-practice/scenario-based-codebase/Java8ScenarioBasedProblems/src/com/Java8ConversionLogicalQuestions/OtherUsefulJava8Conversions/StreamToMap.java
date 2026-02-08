package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class StreamToMap {
    public static void main(String[] args) {
        System.out.println(
            Stream.of("A","B")
                .collect(Collectors.toMap(v -> v, v -> v.length()))
        );
    }
}
