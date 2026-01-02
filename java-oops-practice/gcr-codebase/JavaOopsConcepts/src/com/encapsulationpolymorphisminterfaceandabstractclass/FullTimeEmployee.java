package com.encapsulationpolymorphisminterfaceandabstractclass;

//full time employee class
class FullTimeEmployee extends Employee implements Department {

	// constructor
	FullTimeEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}

	// calculating salary
	double calculateSalary() {
		return getBaseSalary();
	}

	// assigning department
	public void assignDepartment(String deptName) {
		department = deptName;
	}

	public String getDepartmentDetails() {
		return department;
	}
}
