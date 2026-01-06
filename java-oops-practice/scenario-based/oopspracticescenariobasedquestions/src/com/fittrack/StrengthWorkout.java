package com.fittrack;

public class StrengthWorkout extends Workout {

	 public StrengthWorkout(int duration) {
	     super("Strength", duration);
	 }

	 void calculateCalories() {
	     caloriesBurned = duration * 7;
	 }
}
