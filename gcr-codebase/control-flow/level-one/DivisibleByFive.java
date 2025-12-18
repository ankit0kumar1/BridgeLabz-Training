import java.util.*;
public class DivisibleByFive{
	public static void main(String [] args ){
		Scanner input = new Scanner(System.in);
		
		//Taking input form the user.
		System.out.print("Enter a number to check if it is divisible by 5 or not: ");
		int number = input.nextInt();
		
		//Checking the number is divisible by 5 or not 
		System.out.print("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
		
		input.close();
		
		
	}
}