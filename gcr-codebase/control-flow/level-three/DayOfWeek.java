public class DayOfWeek{
	public static void main(String [] args){
	
	//taking input from the user in commmand line
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        String dayName;
        switch (d) {
            case 0: dayName = "Sunday"; 
			break;
            case 1: dayName = "Monday"; 
			break;
            case 2: dayName = "Tuesday"; 
			break;
            case 3: dayName = "Wednesday"; 
			break;
            case 4: dayName = "Thursday"; 
			break;
            case 5: dayName = "Friday"; 
			break;
            case 6: dayName = "Saturday"; 
			break;
            default: dayName = "Invalid";
        }
		
		// print the dayName
        System.out.println("Day is: " + dayName);
		
	
		
	}
}