import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the year to check if it is a Leap Year or not ");
        int year = input.nextInt();
		
		
		if(year >= 1582 &&(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0))){
			
			System.out.println("Year is Leap Year");
			
		}else if (year >= 1582) {
		
            System.out.println("Year is not a Leap Year");
			
        } else {
		
            System.out.println("Leap year calculation is valid only for year >= 1582");
			
        }

        input.close();
    }
}
