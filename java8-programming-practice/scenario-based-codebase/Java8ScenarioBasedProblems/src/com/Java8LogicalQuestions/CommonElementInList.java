package com.Java8LogicalQuestions;

import java.util.List;
import java.util.*;
import java.util.stream.*;
public class CommonElementInList {

	    public static void main(String[] args) {
	    	   List<Integer>list1=List.of(1,2,3,4);
	    	   List<Integer>list2=List.of(3,4,5,6);
		List<Integer>list= list1.stream().filter(list2::contains).collect(Collectors.toList());
		 System.out.println(list);
	    }

	}
