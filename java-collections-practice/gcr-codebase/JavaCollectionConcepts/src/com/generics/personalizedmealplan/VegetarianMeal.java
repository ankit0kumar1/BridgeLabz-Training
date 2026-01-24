package com.generics.personalizedmealplan;

class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void showPlan() {
        System.out.println("Vegetarian Meal: Dal, Rice, Vegetables");
    }
}

