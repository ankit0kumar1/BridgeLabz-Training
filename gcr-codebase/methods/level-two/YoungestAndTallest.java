import java.util.Scanner;

public class YoungestAndTallest{

    // Method to find the youngest friend
    public static void findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }

        System.out.println(names[index] + " is the youngest friend.");
    }

    // Method to find the tallest friend
    public static void findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        int index = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }

        System.out.println(names[index] + " is the tallest friend.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking age input
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = input.nextInt();
        }

        // Taking height input
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter " + names[i] + "'s height: ");
            heights[i] = input.nextInt();
        }

        // Method calls
        findYoungest(names, ages);
        findTallest(names, heights);

        input.close();
    }
}
