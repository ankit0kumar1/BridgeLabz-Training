import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		System.out.print("Enter the number: ");
		double number = input.nextDouble();
		
		
		//adding the number until user gives input zero.
		while(number!=0){
			total += number;
			number= input.nextDouble();
		}
		
		//output
		System.out.println("The sum of the numbers is: " + total);
		
		input.close();
	}
}