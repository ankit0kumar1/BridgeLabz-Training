import java.util.Scanner;
public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        //Simple loop from 5 to sqrt(n)..
        for (int i = 5; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
		
		//create object of Scanner;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
        input.close();
    }
}