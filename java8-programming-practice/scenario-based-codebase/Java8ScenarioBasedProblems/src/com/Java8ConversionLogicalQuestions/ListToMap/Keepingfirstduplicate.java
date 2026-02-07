package com.Java8ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;
public class Keepingfirstduplicate {

			    public static void main(String[] args) {
			    	 List<String> list = Arrays.asList("java", "java", "is", "a");

			         Map<String, Integer> map =
			                 list.stream()
			                 .collect(Collectors.toMap(s -> s,          
			                         String::length,    
			                         (a, b) -> a  
			                     ));

			         System.out.println(map);
			     }
			 }
 

