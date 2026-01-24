package com.generics.personalizedmealplan;

public class MealPlanner {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>("Ankit", new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>("Nitin", new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>("Aryan", new KetoMeal());

        MealPlanService.generateMealPlan(vegMeal);
        MealPlanService.generateMealPlan(veganMeal);
        MealPlanService.generateMealPlan(ketoMeal);
    }
}
