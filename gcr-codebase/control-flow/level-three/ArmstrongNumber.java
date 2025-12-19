import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int originalNumber = number;

        //Use while loop to process each digit
        while (originalNumber != 0) {

            //Find the last digit using modulus
            int digit = originalNumber % 10;

            //Find the cube of the digit and add to sum
            sum = sum + (digit * digit * digit);

            //Remove the last digit using division
            originalNumber = originalNumber / 10;
        }

        //Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        input.close();
    }
}
