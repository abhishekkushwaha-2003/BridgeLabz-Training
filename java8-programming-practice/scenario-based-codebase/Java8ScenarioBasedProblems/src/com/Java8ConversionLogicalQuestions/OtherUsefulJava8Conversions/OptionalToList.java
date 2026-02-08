package com.Java8ConversionLogicalQuestions.OtherUsefulJava8Conversions;

import java.util.*;

public class OptionalToList {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello");
        System.out.println(opt.map(List::of).orElse(List.of()));
    }
}
