package com.Java8LogicalQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JoinStrings {
				public static void main(String[] args) {
				   List<String>list=List.of("Java","Spring","Boot");
String str= list.stream().collect(Collectors.joining(","));
			  System.out.println(str);
				}
			}