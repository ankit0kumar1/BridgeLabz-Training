import java.util.*;

public class VowelsAndConsonantsTwo {
    // Method to check character type
    public static String checkCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to convert uppercase to lowercase using ASCII
    public static String convertToLowerCase(String text) {
        String lowerCase = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                lowerCase += (char) (ch + 32);
            } else {
                lowerCase += ch;
            }
        }
        return lowerCase;
    }

    // Method to find vowels and consonants and return 2D array
    public static String[][] findCharacterTypes(String text) {
        String lowerText = convertToLowerCase(text);
        int length = text.length();

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = lowerText.charAt(i);
            result[i][0] = String.valueOf(text.charAt(i)); // original character
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Call user-defined methods
        String[][] result = findCharacterTypes(text);
        displayTable(result);

        input.close();
    }
}
