package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;
import java.util.stream.*;

public class ArrayToList {
    public static void main(String[] args) {

        String[] arr = {"Java", "SQL", "Spring"};

        List<String> list = Arrays.stream(arr)
                                  .toList();

        System.out.println(list);
    }
}
