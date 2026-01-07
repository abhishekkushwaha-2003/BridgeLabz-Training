package com.sortingalgorithm.heapsort.sortjobapplicantsbysalary;

public class HeapSortSalaryMain {
	public static void main(String[] args) {

        int[] salaries = {45000, 70000, 30000, 60000, 50000};
        
        HeapSortSalary hs = new HeapSortSalary(); 
        
        System.out.println("Before Sorting:");
        hs.display(salaries);

        HeapSortSalary.heapSort(salaries);

        System.out.println("After Sorting (Ascending):");
        hs.display(salaries);
    }

}
