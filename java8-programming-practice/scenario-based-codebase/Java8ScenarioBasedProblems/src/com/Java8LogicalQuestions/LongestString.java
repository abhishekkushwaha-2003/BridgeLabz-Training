package com.Java8LogicalQuestions;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
public class LongestString {

					    public static void main(String[] args) {
					    	   List<String>list=List.of("java","microservices","api");
						String str= list.stream().max(Comparator.comparing(String::length))
								.get();
						System.out.println(str);
					    }

					}