package com.universitycourseenrollmentsystem;

//faculty class
class Faculty {

	private String facultyName;

	Faculty(String name) {
		this.facultyName = name;
	}

	void displayFaculty() {
		System.out.println("Faculty Name: " + facultyName);
	}
}

