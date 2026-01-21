package com.flipkeylogicalproblem;

import java.util.Scanner;

public class PasswordGenerator {
	
	
	public static String cleanseAndInvert(String input) {
		String str = input.toLowerCase();
		if(str.length() <6) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(int i =0; i< str.length(); i++) {
			
			
			char ch = str.charAt(i);
			if(ch ==' ') {
				return "";
			}
			int ascii = (int)ch;
			if(ascii >=95 && ascii <=122 ) {// a-95 z-122
				if(ascii %2 != 0) {
					sb.append(ch);
					
				}
			}else {
				return "";
			}
			
 
		}
		for(int i =0; i< sb.length(); i++) {
			if(i%2==0) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
		}
		return sb.reverse().toString();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ");
		String input = sc.nextLine();
		String result = cleanseAndInvert(input);
		if(result.length()!=0) {
			System.out.println("The generated key is - " + result);
		}else {
			System.out.println("Invalid output");
		}
	}
}
