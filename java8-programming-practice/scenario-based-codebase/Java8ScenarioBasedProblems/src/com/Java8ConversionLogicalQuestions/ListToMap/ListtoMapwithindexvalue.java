package com.Java8ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;
public class ListtoMapwithindexvalue {

			    public static void main(String[] args) {
			    	 List<String> list = Arrays.asList("java", "is", "a", "programming", "language");

			         Map<Integer, String> map =
			                 IntStream.range(0,list.size()).boxed()
			                     .collect(Collectors.toMap(c->c, c->list.get(c)));
			                    
			         System.out.println(map);
			     }
			 }

