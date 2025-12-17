import java.util.Scanner;
public class CalculateTotalPrice{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input form the user
		System.out.print("Enter the unit price of an item: ");
		double unitPrice = input.nextDouble();
		System.out.print("Enter the quantity of the item: ");
		int quantity = input.nextInt();
		
		//Calculating the total price
		double totalPrice = unitPrice * quantity;
		
		//Displaying the output
		System.out.print("The total purchase price is INR " + totalPrice +" if the quantity " + quantity + " and unit price is INR " + unitPrice);
		
		input.close();//Closing the Scanner object.
	}
}