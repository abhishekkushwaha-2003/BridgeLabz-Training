package com.JavaGenerics.PersonalizedMealPlanGenerator;

class HighProteinMeal implements MealPlan {

    public String getMealType() {
        return "High Protein";
    }

    public int getCalories() {
        return 2200;
    }
}
