package com.constructorandaccessmodifier.level1;

public class Circle {
	
	Circle(){
		this(5.5);
		System.out.println("This is default constructor");
	}
	
	Circle(double radius){
		System.out.println(radius);
	}
	
public static void main(String[]args) {
	new Circle();
}

}
