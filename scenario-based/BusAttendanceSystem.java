/*
School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.*;
import java.time.*;
import java.time.format.*;
public class BusAttendanceSystem{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String [] names = {"Ankit", "Keshav", "Sanchit", "Ramvishal","Aryan","Ali","Joshep","Abuzar","Anupum","Vishal"};
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Date :"+ today.format(formatter));
		
		System.out.println("Bus Attendance");
		String [] attendance = new String[10];
		System.out.println("Enter 'P' for present and 'A or any character ' for absent");
		System.out.println("-------------------");
		for(int i =0; i < names.length; i++){
			System.out.print(names[i] +" ");
			char ch = input.next().charAt(0);
			if(Character.toLowerCase(ch) == 'p'){
				attendance[i] = "Present";
			}else{
				attendance[i] = "Absent";
			}
		}
		
		System.out.println("\nAttendance Report");
		System.out.println("+-----------------+------------+");
		System.out.printf("| %-15s | %-10s |%n", "Name", "Status");
		System.out.println("+-----------------+------------+");

		for (int i = 0; i < names.length; i++) {
		System.out.printf("| %-15s | %-10s |%n", names[i], attendance[i]);
		}

		System.out.println("+-----------------+------------+");

		
	}
}