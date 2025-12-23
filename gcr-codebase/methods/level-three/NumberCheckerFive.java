import java.util.*;
public class NumberCheckerFive {
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
    //method to reverse digits array
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
    //method to check if number is palindrome
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
    // method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    // method to check if a number is neon
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    // method to check if a number is spy
    public static boolean isSpyNumber(int[] digits) {
        int sum = 0;
        int product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }
    // method to check if a number is automorphic
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int n = countDigits(number);
        int lastDigits = square % (int)Math.pow(10, n);
        return lastDigits == number;
    }
    // method to check if a number is buzz
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = digitsArray(number);

		// calling method and display result
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Reversed digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is palindrome? " + isPalindrome(digits));
        System.out.println("Is duck number? " + isDuckNumber(digits));
        System.out.println("Is prime? " + isPrime(number));
        System.out.println("Is neon number? " + isNeonNumber(number));
        System.out.println("Is spy number? " + isSpyNumber(digits));
        System.out.println("Is automorphic number? " + isAutomorphicNumber(number));
        System.out.println("Is buzz number? " + isBuzzNumber(number));
        input.close();
		
    }
}