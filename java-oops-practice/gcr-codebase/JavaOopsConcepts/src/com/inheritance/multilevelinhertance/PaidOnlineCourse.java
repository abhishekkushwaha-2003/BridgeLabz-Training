package com.inheritance.multilevelinhertance;

//Subclass PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {

	// additional attributes
	double fee;
	double discount;   // in percentage

	// constructor
	PaidOnlineCourse(String courseName, int duration,
	                 String platform, boolean isRecorded,
	                 double fee, double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	// overriding displayCourse()
	void displayCourse() {
		super.displayCourse();
		System.out.println("Course Fee: " + fee);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Final Fee: " + (fee - (fee * discount / 100)));
	}
}

