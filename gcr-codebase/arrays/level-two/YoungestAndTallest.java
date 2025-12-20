import java.util.*;
public class YoungestAndTallest{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int age[] = new int[3];
		int height[] = new int[3];
		
		//Taking the age and height of three friends 
		for(int i =0 ; i < 3 ; i++){
			System.out.print("Enter the age: " );
			age[i] = input.nextInt();
			
			System.out.print("Enter the height: " );
			height[i] = input.nextInt();
		}
		
		// Find youngest and tallest among 3 friends
		int youngest = Integer.MAX_VALUE;
		int tallest = Integer.MIN_VALUE;
		int youngestPerson=0;
		int tallestPerson =0;
		for(int i =0 ; i < 3 ; i++){
			if(age[i]<youngest ){
				youngest = age[i];
				youngestPerson =i+1;
				
				
			}if(height[i]>tallest){
				tallest = height[i];
				tallestPerson= i+1;
			}
		}
		if(youngestPerson==1){
			System.out.println("Amar is youngest.");
		}else if(youngestPerson==2){
			System.out.println("Akbar is youngest.");	
		}else{
			System.out.println("Anthony is youngest.");
		}
		if(tallestPerson==1){
			System.out.println("Amar is tallest.");
		}else if(tallestPerson==2){
			System.out.println("Akbar is tallest.");	
		}else{
			System.out.println("Anthony is tallest.");
		}
		
		
		
		input.close();
	}
}