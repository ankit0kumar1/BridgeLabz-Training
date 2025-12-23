import java.util.*;
public class SplitAndFindShortestAndLongest{
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
	
	// Method to find shortest and longest string.
	public static String [] getShortestAndLongest(String [][] wordWithLength){
		String smallest = wordWithLength[0][0];
		String longest = wordWithLength[0][0];
		
		for(int i =1; i< wordWithLength.length; i++){
			
			if(Integer.parseInt(wordWithLength[i][1]) < smallest.length()){
				smallest =wordWithLength[i][0];
			}if(Integer.parseInt(wordWithLength[i][1])>longest.length()){
				longest =wordWithLength[i][0];
			}
			
		}
		
		return new String []{smallest, longest};
	}
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a text: ");
        String text = input.nextLine();

        // User-defined methods
        String[] words = splitText(text);
        String[][] table = wordWithLength(words);
		String[] smallestLongestWord = getShortestAndLongest(table);
		
		System.out.println("\nShortest\tLongest");
		System.out.println(smallestLongestWord[0]+"\t\t"+ smallestLongestWord[1]);
		
	}

}