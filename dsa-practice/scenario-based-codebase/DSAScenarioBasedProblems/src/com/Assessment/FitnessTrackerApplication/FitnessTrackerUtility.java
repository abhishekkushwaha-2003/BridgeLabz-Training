package com.Assessment.FitnessTrackerApplication;

public class FitnessTrackerUtility {
	 public boolean activityNameValid(String activityName) throws FitnessCalorieException {
		 if(!(activityName.equals("Walking") || activityName.equals("Running") || activityName.equals("Cycling"))) {
			 throw new FitnessCalorieException("Error : Invalid "+activityName);
		 }
		 return true;
	 }
	 
	 public boolean durationInHoursIntensityValid(double durationInHours, int intensityLevel) throws FitnessCalorieException {
		 if(durationInHours < 1 || intensityLevel < 1 || intensityLevel > 9) {
			 throw new FitnessCalorieException("Error : Invalid "+durationInHours + " or " + intensityLevel);
		 }
		 return true;
	 }
	 public boolean weightValid(double weight) throws FitnessCalorieException {
		 if(weight <= 0) {
			 throw new FitnessCalorieException("Error : User weight is invalid.");
		 }
	 return true;
}
	 public boolean inputFormatValid(String [] parts) throws FitnessCalorieException{
		if(parts.length != 3 || !parts[0].matches("^[a-zA-Z]+$") || !parts[1].matches("^[0-9]+(\\.[0-9]+)?$") || !parts[2].matches("^\\d+$")) {
			throw new FitnessCalorieException("Error : Invalid activity date format");
		}
		return true;
	 
	 }
	 
	 public double totalCalFind(double durationInHours, int intensityLevel, String activityName, double weight) {
		 int calPerMin = 0;
		 switch(activityName) {
		 case "Walking":
			 calPerMin = 3;
			 break;
			 
		 case "Running":
			 calPerMin = 7;
			 break;
			 
		 case "Cycling":
			 calPerMin = 5;
			 break;
			 
		 }
		 return (calPerMin * durationInHours * intensityLevel * 60)/weight;
	 }
}
