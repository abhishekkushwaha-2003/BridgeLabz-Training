package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;
import java.util.stream.*;

public class StreamToList {
    public static void main(String[] args) {
        System.out.println(Stream.of(1,2,3).collect(Collectors.toList()));
    }
}

