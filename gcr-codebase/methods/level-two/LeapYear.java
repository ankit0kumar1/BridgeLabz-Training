import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the year to check if it is a Leap Year or not: ");
        int year = input.nextInt();

        // Checking Gregorian calendar condition
        if (year >= 1582) {
            boolean result = isLeapYear(year);

            if(result){
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }else{
            System.out.println("Leap year calculation is valid only for year >= 1582");
        }

        input.close();
    }

    // Method to check leap year
    static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
