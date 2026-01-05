package com.universitycourseenrollmentsystem;

//undergraduate student
class Undergraduate extends Student {

	// constructor
	Undergraduate(int id, String name) {
		super(id, name);
	}

	void displayStudentType() {
		System.out.println("Student Type: Undergraduate");
	}
}

