import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerThree {
    //method to count the number of digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n !=  0) {
            n /= 10;
            count++;
        }
        return count;
    }
    // method to store digits in array
    public static int[] digitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = number;
        for (int index =  count - 1; index >=0 ; index--) {
            digits[index] = n % 10;
            n /= 10;
        }
        return digits;
    }
    // method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    // method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    // method to check if number is palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }
    // method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = digitsArray(number);

		// calling methods and print result
        System.out.println("digits array : " + Arrays.toString(digits));
        System.out.println(" Count of digits: " + countDigits(number));
        System.out.println("reversed digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("is palindrome ? " + isPalindrome(digits));
        System.out.println("Is duck number? " + isDuckNumber(digits));
        input.close();
		
    }
}