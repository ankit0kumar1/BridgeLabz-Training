import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        double result;

        // Calculator using switch case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
