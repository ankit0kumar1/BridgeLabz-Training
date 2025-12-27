import java.util.*;
public class MetroSmartCard{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
	
		//intial balance
		double balance = 100;
		while (balance>0){
			System.out.println("Current balance : "+ balance);
			System.out.print("Enter the distance you want to travel in km(or -1 to quit) : " );
			int distance = input.nextInt();
			
			//exit condition
			if(distance == -1){
				System.out.println("Journey ended by user.");
				break;
				
			}
			//fare using ternary operator
			double fare = (distance<=5)?10:20;
			
			if(balance >= fare){
				balance-=fare;
				System.out.println("Fare deducted: " + fare);
			}else{
				System.out.println("Insufficient balance! Please Recharge.");
				break;
			}
			
		}
		System.out.println("Final Balance : " + balance);
		input.close();
	}
}