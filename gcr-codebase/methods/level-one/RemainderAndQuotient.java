import java.util.*;
public class RemainderAndQuotient{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Get user input from the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter divisor: ");
		int divisor = input.nextInt();
		
		//Displaying the output 
		int result[] = findRemainderAndQuotient(number, divisor);
		System.out.println("The remainder is : " + result[1] + " the quotient is : " + result[0]);
		
		input.close();
	}
	public static int [] findRemainderAndQuotient(int number, int divisor){
		int result[] = new int [2];
		result[0]= number/divisor;
		result[1] = number%divisor;
		return result;
	}
}