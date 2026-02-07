package com.Java8LogicalQuestions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class RemoveEmptyString {

	    public static void main(String[] args) {
	    	   List<String>list=List.of("java","","spring","","boot");
		List<String>newList= list.stream().filter(e->!e.isEmpty()).collect(Collectors.toList());
		 System.out.println(newList);
	    }

	}