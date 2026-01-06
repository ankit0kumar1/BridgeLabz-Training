package com.fittrack;

public class CardioWorkout extends Workout {

	 public CardioWorkout(int duration) {
	     super("Cardio", duration);
	 }

	 void calculateCalories() {
	     caloriesBurned = duration * 10;
	 }
}
