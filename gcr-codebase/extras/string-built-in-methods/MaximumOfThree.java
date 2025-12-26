import java.util.Scanner;
public class MaximumOfThree {
    // Method to take input from user
    public static int takeInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }
    //method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
		
		//create Scanner object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
		System.out.println("Enter the three number: ");
        int num3 = input.nextInt();
        int max = findMaximum(num1, num2, num3);

		//print result
        System.out.println("Maximum number is: " + max);
        input.close();
    }
}