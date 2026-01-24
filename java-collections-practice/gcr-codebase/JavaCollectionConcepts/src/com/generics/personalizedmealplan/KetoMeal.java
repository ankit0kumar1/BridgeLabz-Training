package com.generics.personalizedmealplan;

class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void showPlan() {
        System.out.println("Keto Meal: Eggs, Cheese, Avocado");
    }
}

