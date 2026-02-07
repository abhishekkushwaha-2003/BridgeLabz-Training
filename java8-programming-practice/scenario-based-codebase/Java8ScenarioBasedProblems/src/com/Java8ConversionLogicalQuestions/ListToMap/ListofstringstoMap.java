package com.Java8ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;
public class ListofstringstoMap {
	    public static void main(String[] args) {
	    	 List<String> list = Arrays.asList("java", "spring", "api");

	         Map<String, Integer> map =
	                 list.stream()
	                     .collect(Collectors.toMap(
	                             s -> s,        
	                             s -> s.length()  
	                     ));

	         System.out.println(map);
	     }
	 }
