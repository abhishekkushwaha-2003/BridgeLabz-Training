package com.Java8LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
public class SortMapByValue {

				    public static void main(String[] args) {
				    	   Map<String ,Integer>list=Map.of(
				                   "A", 3,
				                   "B", 1,
				                   "C", 2
				           );
					      list.entrySet()
							   .stream()
							   .sorted(Map.Entry.comparingByValue())
							   .forEach(System.out::println);	
					}

				}