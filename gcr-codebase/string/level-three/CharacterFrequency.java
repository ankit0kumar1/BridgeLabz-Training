import java.util.Scanner;
public class CharacterFrequency {
    //method to find character frequencies
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        //calculate frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        //count unique characters
        int count = 0;
        for (char c : chars) {
            if (c != '0') {
                count++;
            }
        }
        //store result in 1D  String array
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
		
		//create Scanner object 
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string: ");
        String text = input.nextLine();
        String[] output = findFrequency(text);

		// print the result
        System.out.println("\nCharacter Frequencies:");
        for (String s : output) {
            System.out.println(s);
        }
        input.close();
    }
}