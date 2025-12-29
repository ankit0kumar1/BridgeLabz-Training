package com.consturctors.level1;

import java.util.Scanner;

public class Circle {
	private double radius;
	//Default constructor
	Circle(){
		//Constructor chaining
		this(5.0);
	}
	//Parameterized constructor
	Circle(double radius){
		this.radius = radius;
	}
	//Method to display radius 
	public double getRadius() {
		return this.radius;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//using default constructor
		Circle c1 = new Circle();
		System.out.println("Default radius: " +c1.getRadius());
		//using parameterized constructor.
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		Circle c2 = new Circle(r);
		System.out.println("User-provided radius: " + c2.getRadius());
		
		
		input.close();
	}

}
