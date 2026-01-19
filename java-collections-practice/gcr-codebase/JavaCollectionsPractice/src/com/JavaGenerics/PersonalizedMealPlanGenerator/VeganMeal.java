package com.JavaGenerics.PersonalizedMealPlanGenerator;

class VeganMeal implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1700;
    }
}
