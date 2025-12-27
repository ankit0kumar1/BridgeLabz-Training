import java.util.*;
public class BMIFitnessTracker{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
	
		//Inputs from the user
		System.out.print("Enter your height in meters: ");
		double height = input.nextDouble();
	
		System.out.print("Enter your weight in kg: ");
		double weight = input.nextDouble();
	
		double bmi = weight/(height *height);
		//display BMI
		System.out.print("Your BMI is : " + bmi);
	
	
		//display BMI Category
		if(bmi < 18.5){
			System.out.println("BMI Category: Underweight");
		} else if(bmi >= 18.5 && bmi < 25){
			System.out.println("BMI Category: Normal");
		} else{
			System.out.println("BMI Category: Overweight");
		}
	
	
		input.close();
	}
		
}