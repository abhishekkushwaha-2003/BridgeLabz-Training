package com.Java8LogicalQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class StringToUppercase {

		public static void main(String[] args) {
		   List<String>list=List.of("java", "spring", "boot");
	  List<String>newList= list.stream().map(e->e.toUpperCase()).toList();
	  System.out.println(newList);
		}
	}
