import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();

        // Calculating bonus
        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Displaying the bonus
        System.out.println("The bonus amount is: " + bonus);

        input.close();
    }
}
