/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/
import java.util.Scanner;

public class TicketBookingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Movie Ticket Booking");
            System.out.println("1. Gold Seat");
            System.out.println("2. Silver Seat");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int seatChoice = input.nextInt();

            if (seatChoice == 3) {
                System.out.println("Thank you for using Ticket Booking App");
                break;
            }

            switch (seatChoice) {

                case 1:
                    System.out.println("Gold ticket booked successfully.");
                    break;

                case 2:
                    System.out.println("Silver ticket booked successfully.");
                    break;

                default:
                    System.out.println("Invalid seat choice.");
                    continue;
            }

            // Snacks option
            System.out.println("Do you want snacks?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice: ");
            int wantSnacks = input.nextInt();

            if (wantSnacks == 1) {

                System.out.println("Choose Snacks:");
                System.out.println("1. Popcorn");
                System.out.println("2. Sandwich");
                System.out.println("3. Cold Drink");
                System.out.print("Enter option: ");

                int snackOption = input.nextInt();

                switch (snackOption) {
                    case 1:
                        System.out.println("You ordered Popcorn");
                        break;
                    case 2:
                        System.out.println("You ordered Sandwich");
                        break;
                    case 3:
                        System.out.println("You ordered Cold Drink");
                        break;
                    default:
                        System.out.println("Snack option not available.");
                }

            } else {
                System.out.println("No snacks selected.");
            }

            System.out.println("-----------------------------");
        }

        input.close();
    }
}
