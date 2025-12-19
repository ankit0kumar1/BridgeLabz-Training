import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0;

        // Handle the special case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            //Loop until number becomes 0
            while (number != 0) {
                number = number / 10;
                count++;
				
            }
        }

        //Display the result
        System.out.println("Number of digits: " + count);

        input.close();
    }
}
