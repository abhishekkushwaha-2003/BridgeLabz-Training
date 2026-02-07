package com.Java8ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;
public class ListofintegerstoMap {

		    public static void main(String[] args) {
		    	 List<Integer> list = Arrays.asList(1, 5, 8, 2);

		         Map<Integer, Integer> map =
		                 list.stream()
		                     .collect(Collectors.toMap(
		                             s-> s,        
		                             s -> s*s  
		                     ));

		         System.out.println(map);
		     }
		 }

