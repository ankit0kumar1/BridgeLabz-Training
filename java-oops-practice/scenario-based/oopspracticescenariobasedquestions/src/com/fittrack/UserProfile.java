package com.fittrack;

public class UserProfile {
	
	 private String name;
	 private int age;
	 private double weight;  
	 private String goal;

	 //constructor with default goal
	 public UserProfile(String name, int age, double weight) {
	     this.name = name;
	     this.age = age;
	     this.weight = weight;
	     this.goal = "Stay Fit";
	 }
	 //constructor with custom goal
	 public UserProfile(String name, int age, double weight, String goal) {
	     this.name = name;
	     this.age = age;
	     this.weight = weight;
	     this.goal = goal;
	 }
	 //getter/setter
	 public double getWeight() {
	     return weight;
	 }
	 public void setWeight(double weight) {
	     if (weight > 0)
	         this.weight = weight;
	 }
	 public String getGoal() {
	     return goal;
	 }
	}