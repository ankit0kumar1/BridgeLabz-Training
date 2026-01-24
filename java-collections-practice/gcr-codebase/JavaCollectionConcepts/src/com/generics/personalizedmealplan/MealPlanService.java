package com.generics.personalizedmealplan;

class MealPlanService {

    public static <T extends MealPlan> void generateMealPlan(
            Meal<T> meal) {

        if (meal.getMealPlan().isValid()) {
            System.out.println(
                "Meal Plan Generated for " +
                meal.getUserName() +
                " → " +
                meal.getMealPlan().getMealType()
            );

            // polymorphism + generics working together
            meal.getMealPlan().showPlan();
            System.out.println();

        } else {
            System.out.println("Invalid meal plan selected");
        }
    }
}


