import java.util.Scanner;
public class NumberCheck {
	//check whether number is positive or negative
	public static boolean isPositive(int number){
		return number >= 0;
	}
	//check whether number is even or odd
	public static boolean isEven(int number){
		return number % 2 == 0;
	}
	//compare two numbers
	public static int compare(int num1, int num2){
		if(num1 > num2){
			return 1;
		}else if(num1 == num2){
			return 0;
		}else{
			return -1;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[5];
		//taking input
		for(int i = 0; i < numbers.length; i++){
			System.out.println("Enter number " + (i + 1) + ": ");
			numbers[i] = input.nextInt();
		}
		//checking positive/negative and even/odd
		for(int i = 0; i < numbers.length; i++){
			if(isPositive(numbers[i])){
				if(isEven(numbers[i])){
					System.out.println(numbers[i] + " is Positive and Even");
				}else{
					System.out.println(numbers[i] + " is Positive and Odd");
				}
			}else{
				System.out.println(numbers[i] + " is Negative");
			}
		}
		//comparing first and last elements
		int result = compare(numbers[0], numbers[numbers.length - 1]);
		
		//print result
		if(result == 1){
			System.out.println("First element is greater than last element");
		}else if(result == 0){
			System.out.println("First element is equal to last element");
		}else{
			System.out.println("First element is less than last element");
		}
		
		
		input.close();
		
	}
}