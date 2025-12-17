import java.util.Scanner;
public class UniversityDiscount{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the University Fees: ");
		double fee = input.nextDouble();
		
		System.out.print("Enter the Discount Percent: ");
		int discountPercent = input.nextInt();
		
		double discountAmount = fee*(discountPercent/100.0);
		
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + (fee-discountAmount));
		
		input.close();
		
		
	}
}