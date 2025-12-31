/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/
import java.util.*;
public class CurrencyConverter{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		char convert;
		System.out.println("Welcome to Currency Converter: ");
		
		do{
			//take INR and target currency as input
			System.out.println("Enter the amount in INR:");
			double inr = input.nextDouble();
			System.out.println("Choose the target currency: \n 1.Yen \n 2.USD \n 3.Euro ");
			int target = input.nextInt();
			switch(target){
				case 1 :  System.out.printf("Your INR in YEN is: %.2f%n" ,(1.74*inr));
					break;
				case 2 : System.out.printf("Your INR in USD is:  %.2f%n" , (0.011*inr));
					break;
				case 3 : System.out.printf("Your INR in Euro is:  %.2f%n" , (0.0095*inr));
					break;
				default : System.out.println("Choose a valid option!");	
			}
			System.out.print("Want to continue (y/n): ");
			
			convert = input.next().charAt(0);
		}while(convert == 'y' || convert == 'Y');
		
		input.close();
	}
}