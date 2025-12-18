import java.util.Scanner;
public class SumOfNumbersUntilNegativeInput{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		System.out.print("Enter the number: ");
		double number = input.nextDouble();
		
		
		//adding the number until user gives input zero.
		while(true){
		if(number == 0 || number< 0){
		break;
		}
			total += number;
			number= input.nextDouble();
		}
		
		//output
		System.out.println("The sum of the numbers is: " + total);
		
		input.close();
	}
}