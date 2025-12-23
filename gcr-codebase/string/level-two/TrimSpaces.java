import java.util.*;
public class TrimSpaces{
	//method to find firstLastNonSpaceChar
	public static int [] firstLastNonSpaceChar (String text){
		int index =0;
		int start =0;
		while(text.charAt(index)==' '){
			index++;
			
		}
		start = index;
		int end ;
		index = text.length()-1;
		while(text.charAt(index)== ' '){
			index--;
		}
		end = index+1;
		return new int[] {start,end};
		
	}
	//method to create substring
	public static String createSubstring(String text){
		String substring = "";
		int [] startLastIndex = firstLastNonSpaceChar(text);
		int startIndex = startLastIndex[0];
		int endIndex = startLastIndex[1];
		for(int i = startIndex; i<endIndex; i++){ 
			substring +=text.charAt(i);
		}
		return substring;
	}
	
	 // method to compare two string arrays
    public static boolean compareResults(String builtIn, String userDefined) {
        if (builtIn.equals(userDefined)) return true;
		
       
        return false;
    }

	
	
	//main method 
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		//Take input
		System.out.println("Enter a text: ");
		String text = input.nextLine();
		
		//call method to get trimed text 
		String userDefined = createSubstring(text);
		String builtIn = text.trim();
		
		//display trimed text
		System.out.println("User defined trim text : " + userDefined);
		System.out.println("Built-in trim text : " + builtIn);
		
		//compareResults
		if(compareResults(builtIn, userDefined)){
			System.out.println("Both are same ");
		}else{
			System.out.println("Both are different ");
		}
		
		
		
	}
}