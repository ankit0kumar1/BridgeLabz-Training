import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
		
		int greatestFactor = 1;
		
		//Finding the greatestFactor 
        for(int i = number-1 ; i>=1 ; i--){
			if(number%i == 0){
				greatestFactor =i;
				break;
			}
		}
		//displaying the output
		System.out.println("The GreatestFactor of the given number " + number + " is: " + greatestFactor);

        input.close();
    }
}
