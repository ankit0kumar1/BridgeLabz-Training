import java.util.Scanner;
public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check for valid input
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
        } else {
            int result = 1;
            int counter = 0;

            // Calculating power using while loop
            while (counter < power) {
                result *= number;
                counter++;
            }

            // Displaying the result
            System.out.println(number + " raised to the power "
                    + power + " is: " + result);
        }

        input.close();
    }
}
