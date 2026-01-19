package com.JavaGenerics.PersonalizedMealPlanGenerator;

//T must be a MealPlan type
class Meal<T extends MealPlan> {

 private T mealPlan;

 // Constructor
 public Meal(T mealPlan) {
     this.mealPlan = mealPlan;
 }

 public T getMealPlan() {
     return mealPlan;
 }
}
