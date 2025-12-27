import java.util.*;
public class  ElectionBoothManager{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int vote ;
		// loop for multiple voters
		while (true){
		
			//user input
			System.out.print("Enter age of voter (or -1 to exit.) : ");
			int age = input.nextInt();
			
			if(age== -1){
				System.out.print("Polling closed. ");
				break;
			}
			
			if(age>=18){
				System.out.print ("Elegible to vote.");
				System.out.println("Enter your vote (1,2, or 3): ");
				vote = input.nextInt();
				
				if(vote==1 || vote ==2 || vote ==3){
					System.out.println("Vote recoreded successfully.");
				}else{
					System.out.println("Invalid vote! vote not recoreded.");
				}
				
				
			}else{
				System.out.println("Not elegible to vote.");
			}
		}
		input.close();
	}
} 