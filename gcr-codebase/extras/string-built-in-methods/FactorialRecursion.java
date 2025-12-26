import java.util.Scanner;
public class FactorialRecursion {
    // method to take input from user
    public static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    // Recursive method that calculate factorial..
    public static long factorial(int n) {
        if (n == 0 || n == 1) {  
            return 1;
        }
        return n * factorial(n - 1); 
    }
    // Function to display output
    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }
    public static void main(String[] args) {
		
		//create Scanner object
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
        int number = input.nextInt();
		
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }
        input.close();
    }
}