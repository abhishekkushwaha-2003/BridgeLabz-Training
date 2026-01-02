package com.encapsulationpolymorphisminterfaceandabstractclass;

//part time employee class
class PartTimeEmployee extends Employee implements Department {

	int workHours;
	double ratePerHour;

	// constructor
	PartTimeEmployee(int id, String name, int hours, double rate) {
		super(id, name, 0);
		this.workHours = hours;
		this.ratePerHour = rate;
	}

	// calculating salary based on hours
	double calculateSalary() {
		return workHours * ratePerHour;
	}

	// assigning department
	public void assignDepartment(String deptName) {
		department = deptName;
	}

	public String getDepartmentDetails() {
		return department;
	}
}
