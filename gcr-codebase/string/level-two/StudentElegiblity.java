import java.util.*;
public class StudentElegiblity{
	public static int [] generateAge(int noOfStudents){
		int [] age = new int[noOfStudents];
		for(int i =0; i< age.length; i++){
			age[i] = (int)(Math.random()*90)+10;
			
		}
		return age;
	}
	//method to return true and false with age 
	public static String[][] checkElegiblity (int [] age){
		
		String [][] checkElegiblity = new String [age.length][2];
		for(int i =0; i<age.length; i++){
			checkElegiblity[i][0] = String.valueOf(age[i]);
			if(age[i]>=18){
				checkElegiblity[i][1] = "true";
			}else{
				checkElegiblity[i][1] = "false";
			}
		}
		return checkElegiblity;
	}  
	
	
	//main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students");
		int noOfStudents = input.nextInt();
		int [] age = generateAge(noOfStudents);
		String [][] result = checkElegiblity(age);
		System.out.println("Age\tElegible");
		System.out.println("-----------------");
		for(int i =0; i< noOfStudents; i++){
			
			System.out.println(result[i][0]+"\t"+ result[i][1]);
		}
		
		
		
		
		input.close();
	}
}