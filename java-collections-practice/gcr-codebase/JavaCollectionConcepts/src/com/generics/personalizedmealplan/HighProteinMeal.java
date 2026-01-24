package com.generics.personalizedmealplan;

class HighProteinMeal implements MealPlan {

	@Override
	public String getMealType() {
		return "High Protein";
	}

	@Override
	public boolean isValid() {
		return true;
	}

	@Override
	public void showPlan() {
		System.out.println("High Protein Meal: Chicken, Eggs, Lentils");
		
	}
}
