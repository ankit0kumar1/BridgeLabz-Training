import java.util.*;
public class LargestOfThree{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input form the user
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		System.out.print("Enter third number: ");
		int number3 = input.nextInt();
		
		//Checking the largest number and displaying the output 
		System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
		System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
		System.out.println("Is the third number the largest? "(number3 > number1 && number3 > number2));
		
		input.close();
		
		
	}
}