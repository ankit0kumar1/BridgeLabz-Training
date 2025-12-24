import java.util.Scanner;

public class UniqueCharacter {

    // Method to find length without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop
        }
        return length;
    }

    // Method to find unique characters using charAt()
    public static char[] findUnique(String text) {

        int len = findLength(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean isUnique = true;

            // check only previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = text.charAt(i);
            }
        }

        // create exact-sized array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = input.next();

        char[] result = findUnique(text);

        System.out.print("Unique characters: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        input.close();
    }
}
