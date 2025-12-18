import java.util.Scanner;
public class CountDownUsingForLoop{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//get user input for the counter
		System.out.print("Enter the countdown number: ");
		int counter = input.nextInt();
		
		//start countdown
		for(int i = counter; i >0 ; i--){
		System.out.println(i);
		}
		
		input.close();
	}
}