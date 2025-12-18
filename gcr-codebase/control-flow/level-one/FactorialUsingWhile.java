import java.util.Scanner;
public class FactorialUsingWhile{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input form the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//checking the number is positive 
		if(number >0){
		int factorial =1;
		int i =1;
		while(i<=number){
		factorial *= i;
		i++;
		
		}
		System.out.println("The factorial of " + number + " is " + factorial);
		
		}else {
		System.out.println("The factorial number " + number +" is not defined.");
		}
		
		input.close();
		
	}
}