import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int greatestFactor = 1;

        // Counter starts from number - 1
        int counter = number - 1;

        // Finding the greatest factor using while loop
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Displaying the result
        System.out.println("The greatest factor of the given number "
                + number + " is: " + greatestFactor);

        input.close();
    }
}
