import java.util.Scanner;
public class SumOfnNaturalNumbers{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//get input form the user.
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if (number >= 0){
		
		//Formula to calculate the sum of n natural numbers
		int sumFormula = number * (number + 1) / 2;
		int sumWhile =0;
		
		//While loop to calculate sum of n natural numbers.
		while(number != 0){
		sumWhile+=number;
		number--;
		}
		
		System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);
		
		//Comparing the results 
			if (sumWhile == sumFormula) {
                System.out.println("Both gives same result.");
            } else {
                System.out.println("The result is not same.");
            }
			
			
		}else{
			System.out.println("The number " + number + " is not a natural number.");
		}
		input.close();
	}
}