package com.classandobject.level1;

public class AreaOfCircle {

		
		//non-static variables
		double radius;
		
		//constructors
		AreaOfCircle(double radius){
			this.radius=radius;
		}
		
		//Creating method for calculating area of circle
		public void areaCircle() {
			System.out.printf("Area of circle: %.4f",(Math.PI*radius*radius));
		}
		
		//Creating method for calculating circumference of circle
		public void circumferenceCircle() {
			System.out.printf("\nCircumference of circle: %.4f ",(2*Math.PI*radius));
		}
		
		public static void main(String[] args) {
		AreaOfCircle circle = new AreaOfCircle(2.5);//constructor invoke
		
		circle.areaCircle();//area method calling
		
		circle.circumferenceCircle();//circumference method calling
		}
	}
