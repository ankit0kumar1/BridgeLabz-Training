package com.consturctors.level1;

public class Student {
	public int rollnumber;
	protected String name;
	private double cgpa;
	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
		
	}
	
	public double getCgpa() {
		return cgpa;
	}
	Student(int rollnumber, String name, double cgpa ){
		this.rollnumber = rollnumber;
		this.name = name;
		this.cgpa = cgpa;
		
	}
	
}
