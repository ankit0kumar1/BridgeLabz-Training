import java.util.Scanner;
public class PercentageAndGrade {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	
	// Taking input marks
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();
		
		if(physics< 0 || physics>100 || chemistry<0 ||chemistry >100 || maths <0 || maths >100){
			System.out.println("Please Enter valid Marks");
		}else{
		
			//calculate percentage
			double percentage = (physics +chemistry +maths)/3.0;
			
			String grade, remarks;
			
			if(percentage >=80){
				grade ="A";
				remarks = "Level 4, above agency-normalized standards";
			}else if(percentage >=70){
				grade ="B";
				remarks = "Level 3, at agency-normalized standards";
			}else if (percentage >= 60){
				grade = "C";
				remarks = "Level 2, below but apporaching agency-normalized standards";
			}else if (percentage >=50){
				grade = "D";
				remarks = "Level 1, well below agency-normalized standards";
			}else if (percentage >=40){
				grade = "E";
				remarks = "Level 1, too below agency-normalized standards";
			}else{
				grade = "R";
				remarks = "Remedial standards";
			}
		//displying the result
		System.out.println("\nResult: ");
		System.out.println("Percentage Marks: " + percentage);
		System.out.println("Grade: " + grade);
		System.out.println("Remarks: " + remarks);
		}
		
		
		input.close();
	}
	
}