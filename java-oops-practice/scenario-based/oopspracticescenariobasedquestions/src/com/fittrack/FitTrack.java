package com.fittrack;

import java.util.Scanner;

public class FitTrack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  User Profile Input 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter your fitness goal: ");
        String goal = sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, goal);

        //  Workout Input 
        System.out.print("\nEnter cardio workout duration (minutes): ");
        int cardioMinutes = sc.nextInt();

        System.out.print("Enter strength workout duration (minutes): ");
        int strengthMinutes = sc.nextInt();

        Workout w1 = new CardioWorkout(cardioMinutes);
        Workout w2 = new StrengthWorkout(strengthMinutes);

        
        w1.startWorkout();
        w1.calculateCalories();
        w1.stopWorkout();

        
        w2.startWorkout();
        w2.calculateCalories();
        w2.stopWorkout();

        
        System.out.print("\nEnter daily calorie target: ");
        int dailyTarget = sc.nextInt();

        
        int caloriesBurned = w1.getCaloriesBurned() + w2.getCaloriesBurned();
        int remaining = dailyTarget - caloriesBurned;

        System.out.println("\n----- Daily Summary -----");
        System.out.println("User: " + name);
        System.out.println("Goal: " + goal);
        System.out.println("Total Calories Burned: " + caloriesBurned);
        System.out.println("Remaining Calories to Target: " + remaining);

        sc.close();
    }
}
