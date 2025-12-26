import java.util.Scanner;
public class GCDLCMCalculator {

    //method to take input from user.
    public static int takeInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }
    //  method to calculate GCD 
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //method to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    // method to display results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
        int num1 = input.nextInt();
		System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

		//display output
        displayResult(num1, num2, gcd, lcm);
        input.close();
    }
}