import java.util.Scanner;
public class FibonacciSequence {
    //method to calculate and print Fibonacci sequence
    public static void printFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
		
		//create Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(n);
        }
        input.close();
    }
}