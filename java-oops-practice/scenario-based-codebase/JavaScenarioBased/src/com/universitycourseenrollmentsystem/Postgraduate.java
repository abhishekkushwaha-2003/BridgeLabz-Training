package com.universitycourseenrollmentsystem;

//postgraduate student
class Postgraduate extends Student {

	// constructor
	Postgraduate(int id, String name) {
		super(id, name);
	}

	void displayStudentType() {
		System.out.println("Student Type: Postgraduate");
	}
}
