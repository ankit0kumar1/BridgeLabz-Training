import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking age inputs
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Taking height inputs
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        // Finding youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest friend.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest friend.");
        } else {
            System.out.println("Anthony is the youngest friend.");
        }

        // Finding tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest friend.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest friend.");
        } else {
            System.out.println("Anthony is the tallest friend.");
        }

        input.close();
    }
}
