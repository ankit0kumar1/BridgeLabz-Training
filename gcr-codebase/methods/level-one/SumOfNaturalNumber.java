import java.util.Scanner;
public class SumOfNaturalNumber{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		//Get input from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		int result = findSum(number);
		
		// displaying the result
		System.out.println("The sum of natural number is: "+ result);
		
		
		input.close();
	}
	
	static int findSum(int number){
		int sum = 0;
		for(int num = 1 ; num <= number ; num++){
			sum = sum + num;
		}
		return sum;
	}
}