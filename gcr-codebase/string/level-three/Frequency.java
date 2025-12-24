import java.util.Scanner;
public class Frequency {

    //method to find and display frequency of all characters
    public static void findFrequency(String text) {

        int[] frequency = new int[256];
        // count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        //display character and its frequency
        System.out.println("Character \t Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println((char) i + " \t\t " + frequency[i]);
            }
        }
    }
    public static void main(String[] args) {

		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = input.nextLine();

		//call findFrequency method 
        findFrequency(text);
        input.close();
    }
}