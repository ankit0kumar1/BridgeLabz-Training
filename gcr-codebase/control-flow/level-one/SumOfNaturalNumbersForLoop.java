import java.util.Scanner;
public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check for natural number
        if (n >= 0) {

            // Sum using for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display both results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);

            // Comparing both results
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("The computations are not equal.");
            }

        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        input.close();
    }
}

