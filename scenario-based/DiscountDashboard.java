/*
 Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/
import java.util.*;
public class DiscountDashboard{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item prices (or -1 to get total bill)");
		double total =0;
		double totaldiscount=0;
		double price;
		do{
			System.out.println("Item price: ");
			 price = input.nextDouble();
			if(price <100 ){
				double discount = 0.05;
				total +=(price-(price*discount));
				totaldiscount += price*discount;
			}else if (price<250 ){
				double discount = 0.075;
				total +=(price-(price*discount));
				totaldiscount += price*discount;
			}else if (price<500 ){
				double discount = 0.10;
				total +=(price-(price*discount));
				totaldiscount += price*discount;
			}else if (price<1000 ){
				double discount = 0.15;
				total +=(price-(price*discount));
				totaldiscount += price*discount;
			}else if(price>=1000){
				double discount = 0.20;
				total +=(price-(price*discount));
				totaldiscount += price*discount;
			}
			
		}while(price!=-1 );
		System.out.println("Total Bill: " + total);
		System.out.println("Total Discount : "+ totaldiscount);
	}
}