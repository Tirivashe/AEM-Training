package com.shamhu.StringManipulation;

import java.util.Scanner;

public class OddChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = sc.next();
		StringBuilder string = new StringBuilder(input);
		
		 
		 for(int i = 0; i < string.length(); i++){
			 if(i % 2 != 0) string.deleteCharAt(i);
		 }
		 System.out.println("After removal: " + string);
		 sc.close();

	}

}
