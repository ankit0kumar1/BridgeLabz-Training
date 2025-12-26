import java.util.Scanner;
public class PalindromeChecker {
    // method to take input from user
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    // method to check if string is palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // method to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println( str + " is not a palindrome.");
        }
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
        String num = input.next();
        boolean result = isPalindrome(num);
		
		//print result
        displayResult(num, result);
        input.close();
    }
}