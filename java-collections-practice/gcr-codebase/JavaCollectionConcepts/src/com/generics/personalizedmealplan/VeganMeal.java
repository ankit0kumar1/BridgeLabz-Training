package com.generics.personalizedmealplan;

class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void showPlan() {
        System.out.println("Vegan Meal: Fruits, Vegetables, Nuts");
    }
}


