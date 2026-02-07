package com.Java8LogicalQuestions;

import java.util.stream.Collectors;
import java.util.*;
public class GroupingOfaString {

 public static void main(String[] args) {
	List<String>list=List.of("a","bb","ccc","dd");
		Map<Integer, List<String>>newList=list.stream()
				.collect(Collectors.groupingBy(String::length));
				 System.out.println(newList);
			    }
	}
		