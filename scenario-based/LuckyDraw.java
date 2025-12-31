/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/
import java.util.Scanner;

public class LuckyDraw{
	public static int getRandomNumber(){
		return (int)((Math.random()*90)+10);
	}
	public static int getRandomIndex(){
		return (int)((Math.random()*9)+1);
	}
	public static void main(String [] args){
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		String [] items = {"apple", "banana", "carrot", "dates", "eggplant", "fig", "grape", "honeydew", "iceberg lettuce", "jackfruit", "kiwi"};
		char ch = 'y';
		System.out.println("Welcome to diwali win win luck draw..");
		do{
			System.out.println("Click any button and enter to get you lucky number.");
			input.next();
			int luckyNumber = getRandomNumber();
			if(luckyNumber%5 == 0 || luckyNumber%3 == 0){
				String price = items[getRandomIndex()];
				System.out.println("Congrats, you won "+price);
			}else{
				System.out.println("Better luck next time");
			}
			System.out.println("Enter y if you want to play otherwise anyother key:");
			ch = input.next().charAt(0);
		}	
		while(ch == 'y');
		
		System.out.println("Thanks you for playing the game. ");
	}
}