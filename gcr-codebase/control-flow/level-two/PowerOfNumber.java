import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers.");
        } else {
            int result = 1;

            // Calculating power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            // Displaying the result
            System.out.println(number + " raised to the power "
                    + power + " is: " + result);
        }

        input.close();
    }
}
