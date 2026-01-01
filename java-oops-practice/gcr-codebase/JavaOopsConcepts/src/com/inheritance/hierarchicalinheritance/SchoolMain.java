package com.inheritance.hierarchicalinheritance;

public class SchoolMain {
	public static void main(String[] args) {

		Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
		Student s = new Student("Amit", 16, "10th");
		Staff st = new Staff("Ramesh", 45, "Administration");

		t.displayDetails();
		t.displayRole();
		System.out.println();

		s.displayDetails();
		s.displayRole();
		System.out.println();

		st.displayDetails();
		st.displayRole();
	}
}
