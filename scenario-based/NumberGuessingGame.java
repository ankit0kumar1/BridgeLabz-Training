import java.util.*;
public class NumberGuessingGame{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0to 100");
		int userNumber = input.nextInt();
		int generatedNumber= getGeneratedNumber();
		int count =0;
		do{
			if(userNumber<generatedNumber){
				System.out.println("Too low");
				
				count++;
				userNumber = input.nextInt();
			}else if (userNumber> generatedNumber){
				System.out.println("Too high");
				count++;
				userNumber = input.nextInt();
			}else{
				System.out.println("Gussed correct.");
				break;
			}
		}while(count!=5);
		if(count==5){
			System.out.println("You have exceed the limit of guess , Number is: " + generatedNumber);
		}
	}
	public static int getGeneratedNumber(){
		int computerGenerated = (int)(Math.random()*100)+1;
		return computerGenerated;
		
	}
}