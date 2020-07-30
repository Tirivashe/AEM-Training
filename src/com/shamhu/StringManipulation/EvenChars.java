package com.shamhu.StringManipulation;

import java.util.Scanner;

public class EvenChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		 String input = sc.next();
		 
		 System.out.println("Characters at even places: ");
		 for(int i = 0; i < input.length(); i++){
			 if(i % 2 == 0) System.out.print(input.charAt(i));
		 }
		 sc.close();

	}

}
