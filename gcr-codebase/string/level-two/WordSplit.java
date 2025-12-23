import java.util.*;
public class WordSplit{

	//method to find length of string
	public static int getLength(String text){
		int count =0;
		int index =0;
		try{
			
			while(true){
				text.charAt(index++);
				count++;
				
			}
		}catch (StringIndexOutOfBoundsException e) {
			//
		}
		
		return count;
	}
	
	//method for number of spaces 
	public static int spaceCount(String text){
		int count =0;
		for(int i =0; i< text.length(); i++){
			if(text.charAt(i)==' ') count++;
		}
		return count;
	}
	
	
	//method to store spaceIndex
	public static int [] spaceIndex(String text){
		int count = spaceCount(text);
		int [] spaceIndex = new int[count];
		int j =0;
		for(int i =0; i< text.length(); i++){
			if(text.charAt(i)==' ') spaceIndex[j++]=i;
		}
		return spaceIndex;
		
	}
	
	//method to split the string 
	public static String[] toSplit(String text) {
		int spaceCount = spaceCount(text);
		int noOfWords = spaceCount + 1;

		String[] words = new String[noOfWords];
		int[] spaceIndex = spaceIndex(text);

		int start = 0;

		for (int i = 0; i < noOfWords; i++) {
			if (i < spaceCount) {
				words[i] = text.substring(start, spaceIndex[i]);
				start = spaceIndex[i] + 1;
			} else {
				// last word
				words[i] = text.substring(start);
			}
		}
		return words;
	}
	
	 // method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }


	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//take input 
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		
		System.out.println("User-defined method");
		String [] words = toSplit(text);
		for(String word : words){
			System.out.println(word);
		}
		
		System.out.println("Built-in method");
		String[] builtInSplit = text.split(" ");
		for(String word : builtInSplit){
			System.out.println(word);
		}
		
		// compare results
        boolean result = compareArrays(words, builtInSplit);

        System.out.println("Comparison Result:");
        if (result) {
            System.out.println("Both string arrays are SAME ");
        } else {
            System.out.println("Both string arrays are DIFFERENT");
        }
		
		
		
		
		input.close();
	}
}