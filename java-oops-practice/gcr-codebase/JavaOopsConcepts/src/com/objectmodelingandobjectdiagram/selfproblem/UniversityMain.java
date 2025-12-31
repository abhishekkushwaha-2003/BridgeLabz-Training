package com.objectmodelingandobjectdiagram.selfproblem;

public class UniversityMain {

	    public static void main(String[] args) {

	        // creating faculty (independent objects)
	        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
	        Faculty f2 = new Faculty("Dr. Mehta", "Mathematics");

	        // creating university
	        University uni = new University("Global University");

	        // adding faculty to university (aggregation)
	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        // adding departments to university (composition)
	        uni.addDepartment("Engineering");
	        uni.addDepartment("Science");

	        // displaying university details
	        uni.showUniversity();

	        // deleting university
	        uni = null;

	        // faculty still exists
	        System.out.println("\nFaculty exists even after University deletion:");
	        f1.showFaculty();
	        f2.showFaculty();
	    }
	}

