package com.shamhu.StringManipulation;

import java.util.Scanner;

public class StringAppend {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int count = 0;
		 String string = "";
		 
		 do{
			 System.out.print("Enter a string: ");
			 string = string.concat(sc.next());
			 count ++;
			 
		 }while(count < 10);
		 
		 System.out.println("Concatenated string: " + string);
		 sc.close();

	}

}
