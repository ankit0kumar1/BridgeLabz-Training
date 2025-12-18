import java.util.Scanner;

public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
		
		//checking the number is positive and less than 100
		if(number <= 0 && number >= 100){
			System.out.println("Enter a valid number ");
		}else{
		System.out.println("Multiples of " + number + " below 100:");
		
		//Loop to print the multiples
			for (int i = 100; i >= 1; i--){
				if(i % number ==0 ){
					System.out.println(i);
				}
			}
		}

        input.close();
    }
}
