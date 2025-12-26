import java.util.Scanner;
public class BasicCalculator {
    //method for addition 
    public static double add(double a, double b) {
        return a + b;
    }
    // method for subtraction 
    public static double subtract(double a, double b) {
        return a - b;
    }
    //method for multiplication 
    public static double multiply(double a, double b) {
        return a * b;
    }
    // method for division
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println("The result is: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("The result is: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("The result is: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("The result is: " + divide(num1, num2));
                    break;
            }
        } else {
            System.out.println("Invalid input! Please select a valid operation.");
        }
        scanner.close();
    }
}