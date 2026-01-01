package com.inheritance.multilevelinhertance;

//Subclass OnlineCourse (extends Course)
class OnlineCourse extends Course {

	// additional attributes
	String platform;
	boolean isRecorded;

	// constructor
	OnlineCourse(String courseName, int duration,
	             String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}

	// overriding displayCourse()
	void displayCourse() {
		super.displayCourse();
		System.out.println("Platform: " + platform);
		System.out.println("Recorded Course: " + isRecorded);
	}
}
