import java.util.Scanner;

public class CentimetersToFeetAndInches{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user inputs 
		System.out.print("Enter height in centimeters: ");
		double heightInCentimeters = input.nextInt();
		//convert centimeters to inches and feet
		double heightInInches = heightInCentimeters/2.54;
		double heightInFeet = heightInInches/12;
		
		//displaying the output
		System.out.println("Your Height in cm is " + heightInCentimeters + "  while in feet is " + heightInFeet + " and inches is " +heightInInches );
		
		input.close();//closing the scanner object.
	}
}