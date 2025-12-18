import java.util.Scanner;
public class CountDown{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//get user input for the counter
		System.out.print("Enter the countdown number: ");
		int counter = input.nextInt();
		
		//start countdown
		while(counter != 0){
		System.out.println(counter);
		counter--;
			
		}
		
		input.close();
	}
}