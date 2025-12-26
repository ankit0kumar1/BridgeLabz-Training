import java.util.Scanner;
public class GuessingGame{
	public static void findNumber(){
		Scanner input = new Scanner(System.in);
		int turns = 0;
		//generate a random number from 1 to 100
		int computerGuessNumber = (int)(Math.random()*90+10);
		while(true){
			System.out.println("Enter number from 1 to 100: ");
			int number = input.nextInt();
			if(computerGuessNumber == number){
				System.out.println("Both number are equal, you guess in "+turns+" turns.");
				break;
			}
			else if(number > computerGuessNumber){
				System.out.println("you guess higer number. ");
			}
			else{
				System.out.println("you guess lower number. ");
			}
			turns++;
		}
	}
	public static void main(String [] args){
	
		findNumber();	
		
	}
}