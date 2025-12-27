import java.util.Scanner;

public class ResultGenerator{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int totalMarks = 0;
        int subjects = 5;

        // Taking input for 5 subjects 
        for(int i = 1; i <= subjects; i++){
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        // Calculate average
        int average = totalMarks/subjects;
        System.out.println("Average Marks: " + average);

        // Assign grade using switch-case
        switch(average / 10){
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        input.close();
    }
}