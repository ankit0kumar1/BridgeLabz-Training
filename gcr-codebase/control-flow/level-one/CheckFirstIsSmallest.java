import java.util.*;
public class CheckFirstIsSmallest{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking inputs form the user 
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		System.out.print("Enter third number: ");
		int number3 = input.nextInt();
		
		//Checking and displaying the output.

			System.out.println(" Is the first number the smallest? " + (number1 < number2 && number1 < number3));
		
		
		input.close();//closing the scanner object.
		
		
	}
}