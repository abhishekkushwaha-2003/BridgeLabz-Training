package com.encapsulationpolymorphisminterfaceandabstractclass;

public class EmploeeMain {
		public static void main(String[] args) {

			// employee reference (polymorphism)
			Employee e1 = new FullTimeEmployee(101, "Rohan", 30000);
			Employee e2 = new PartTimeEmployee(102, "Aman", 20, 500);

			// assigning departments
			((Department)e1).assignDepartment("HR");
			((Department)e2).assignDepartment("IT");

			// displaying details
			e1.displayDetails();
			e2.displayDetails();
		}
	}
