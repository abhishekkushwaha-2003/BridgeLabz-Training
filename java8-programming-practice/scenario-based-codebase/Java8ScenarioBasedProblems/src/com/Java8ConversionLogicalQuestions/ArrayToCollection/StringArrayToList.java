package com.Java8ConversionLogicalQuestions.ArrayToCollection;

import java.util.*;

public class StringArrayToList {
    public static void main(String[] args) {

        String[] arr = {"Java", "Stream", "API"};

        List<String> list = Arrays.stream(arr).toList();

        System.out.println(list);
    }
}

