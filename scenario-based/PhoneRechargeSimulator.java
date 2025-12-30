/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/
import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        char choice;

        do {
            System.out.print("\nEnter Mobile Operator (Jio / Airtel / Vi): ");
            String operator = input.next();

            System.out.print("Enter Recharge Amount: ");
            double amount = input.nextDouble();

            balance += amount;

            System.out.println("\n--- Recharge Offers ---");

            switch (operator.toLowerCase()) {
                case "jio":
                    System.out.println("Jio Offer: 1.5GB/day + Unlimited Calls");
                    break;

                case "airtel":
                    System.out.println("Airtel Offer: 2GB/day + Free Wynk Music");
                    break;

                case "vi":
                    System.out.println("VI Offer: Weekend Data Rollover");
                    break;

                default:
                    System.out.println("Invalid Operator! No offer applied.");
            }

            System.out.println("Recharge Successful!");
            System.out.println("Current Balance: " + balance);

            System.out.print("\nDo you want to recharge again? (Y/N): ");
            choice = input.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for using Phone Recharge Simulator ");
        input.close();
    }
}
