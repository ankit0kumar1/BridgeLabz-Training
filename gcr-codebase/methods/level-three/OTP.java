import java.util.Scanner;
public class OTP{
	//method for generating six digit otp
	public static int sixDigit(){
		int result = (int)((Math.random()*900000)+1000000);
		return result;
	}
	//method that validate otp
	public static boolean validateOtp(int[] otps){
		for(int i = 0; i < otps.length ; i++){
			for(int j = 0 ; j < otps.length ; j++){
				if(otps[i] == otps[j] && i != j){
					return false;
				}
			}
		}
		return true;		
	}
	public static void main(String [] args){
		
		int [] otpArray = new int[10];
		//storing the random opts in otpArray
		for(int index = 0 ; index < 10 ;index++){
			otpArray[index] = sixDigit();
		}
		boolean result = validateOtp(otpArray);
		
		//print the result
		System.out.println(result ? "Yes, the OTPs is unique." : "No, the OTPs is unique.");
		
	}
	
}