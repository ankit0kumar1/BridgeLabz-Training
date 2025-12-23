import java.util.*;

public class WordSplitTwo {

    // Method to find string length without using length()
    public static int getLength(String text){
        int count = 0;
        int index = 0;
        try{
            while (true) {
                text.charAt(index++);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
			
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int spaceCount = 0;

        // count spaces
        for (int i = 0; i < getLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= getLength(text); i++) {
            if (i == getLength(text) || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // User-defined methods
        String[] words = splitText(text);
        String[][] table = wordWithLength(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t\t" + length);
        }

        input.close();
    }
}
