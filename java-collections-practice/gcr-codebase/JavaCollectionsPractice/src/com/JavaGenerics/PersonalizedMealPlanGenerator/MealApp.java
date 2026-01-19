package com.JavaGenerics.PersonalizedMealPlanGenerator;

class MealApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                new Meal<>(new HighProteinMeal());

        // Generate meals
        MealGenerator.generateMeal(vegMeal.getMealPlan());
        System.out.println();

        MealGenerator.generateMeal(veganMeal.getMealPlan());
        System.out.println();

        MealGenerator.generateMeal(ketoMeal.getMealPlan());
        System.out.println();

        MealGenerator.generateMeal(proteinMeal.getMealPlan());
    }
}
