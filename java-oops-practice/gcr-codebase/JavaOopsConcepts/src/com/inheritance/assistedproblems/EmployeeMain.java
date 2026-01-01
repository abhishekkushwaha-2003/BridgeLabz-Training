package com.inheritance.assistedproblems;

public class EmployeeMain {
		public static void main(String[] args) {

			// parent reference child objects (polymorphism)
			Employee e1 = new Manager("Rohan", 101, 80000, 5);
			Employee e2 = new Developer("Ankit", 102, 60000, "Java");
			Employee e3 = new Intern("Aman", 103, 15000, 6);

			e1.displayDetails();
			System.out.println();

			e2.displayDetails();
			System.out.println();

			e3.displayDetails();
		}
	}

