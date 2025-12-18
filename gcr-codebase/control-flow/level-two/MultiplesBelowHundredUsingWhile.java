import java.util.Scanner;
public class MultiplesBelowHundredUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check for valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");

            int counter = 100;

            // Finding multiples using while loop
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        input.close();
    }
}
