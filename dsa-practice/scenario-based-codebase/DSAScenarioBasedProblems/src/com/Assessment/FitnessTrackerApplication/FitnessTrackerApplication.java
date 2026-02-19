package com.Assessment.FitnessTrackerApplication;
import java.util.Scanner;
public class FitnessTrackerApplication {
	public static void main(String [] args) {
		
		FitnessTrackerUtility fu = new FitnessTrackerUtility();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter activity in format Activity:Duration:Intensity : ");
		String input = sc.nextLine();
		try {
		
		String [] parts = input.split(":");
		String activityName = parts[0];
		double durationInHours = Double.parseDouble(parts[1]);
		int intensityLevel = Integer.parseInt(parts[2]);
		
		System.out.println("Enter your weight in kilogram : ");
		double weight = sc.nextDouble();
		fu.activityNameValid(activityName);
		fu.durationInHoursIntensityValid(durationInHours, intensityLevel);
		fu.weightValid(weight);
		fu.inputFormatValid(parts);
		double totalCalories = fu.totalCalFind(durationInHours, intensityLevel, activityName, weight);
		System.out.print("Total Calories : "+totalCalories);
		}
		catch(FitnessCalorieException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

}
