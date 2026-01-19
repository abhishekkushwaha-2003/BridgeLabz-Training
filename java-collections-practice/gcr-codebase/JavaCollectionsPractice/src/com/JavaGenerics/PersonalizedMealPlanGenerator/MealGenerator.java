package com.JavaGenerics.PersonalizedMealPlanGenerator;

class MealGenerator {

    // Generic method to generate meal safely
    public static <T extends MealPlan> void generateMeal(T meal) {

        // Simple validation
        if (meal.getCalories() < 1500) {
            System.out.println("Meal plan not sufficient");
            return;
        }

        System.out.println("Meal Type: " + meal.getMealType());
        System.out.println("Calories: " + meal.getCalories());
        System.out.println("Meal Plan Generated Successfully");
    }
}
