import java.util.*;
public class CoffeeCounterChronicles{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		double GST_RATE = 0.05; //5% GST_RATE
		while (true){
			System.out.print("Enter coffee type (Expresso/Latte/Cappuccino) or type 'exit' : ");
			String coffeeType = input.next();
			if(coffeeType.equalsIgnoreCase("exit")){
				System.out.println("Thank you! Visit again.");
				break;
			}
			System.out.print("Enter quantity:");
			int quantity = input.nextInt();
			double price ;
			
			
			switch (coffeeType.toLowerCase()){
				case "expresso" : 
					price = 120;
					break;
				case "latte" :
					price = 150;
					break;
				case "cappuccino":
					price = 180;
					break;
				default : 
					System.out.println("Invalid coffee type! ");
					continue;
			}
			
			double total = price *quantity;
			double gst = total*GST_RATE;
			double finalAmount = total+gst;
			
			System.out.println("--------Bill--------");
			System.out.println("Coffee Type   : "+ coffeeType);
			System.out.println("Quantity      : "+ quantity);
			System.out.println("Base Amount   : "+ total);
			System.out.println("GST (5%)      : "+ gst);
			System.out.println("Total Payable : "+ finalAmount);
			
		}
		input.close();
	}
}