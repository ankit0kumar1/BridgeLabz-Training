import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a natural number.");
        } else {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        }

        input.close();
    }
}
