import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking inputs form the user
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();
		
		//Calculating quotient and remainder.
		int quotient = number1/number2;
		int remainder = number1%number2;
		
		// Displaying the output.
		System.out.print(" The Quotient is " + quotient +" and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
		
		input.close();//closing scanner object.
	}
}