package com.consturctors.level1;

public class Course {
	private String courseName;
	private int duration;
	private double fee;
	
	private static String instituteName = "Default institute";
	
	private void displayCourseDetails(){
		System.out.println("The name of the course is: " + courseName + "\n The duration is: "
							+duration + " Months "+ "\nFee is: "+fee+ "\nInstitute name is : "+instituteName);
	}
	private void updateInstituteName( String newInstituteName ) {
		instituteName = newInstituteName;
	}
	Course(String courseName , int duration , double fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	public static void main(String[] args) {
		
		Course c1 = new Course("machine learning" , 8 , 20000);
		c1.displayCourseDetails();
		System.out.println("the name of institute is: "+instituteName);
		c1.updateInstituteName("ABCD institute");
		System.out.println("the name of institute is: "+instituteName);
	}
}
