package com.shamhu.StringManipulation;

import java.util.Scanner;

class CTS { 
	public static String camelToSnake(String str) { 
		String regex = "([a-z])([A-Z]+)"; 
		String replacement = "$1_$2"; 
		str = str .replaceAll(regex, replacement).toLowerCase(); 
		return str; 
	} 
}


public class CamelToSnake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Camel Case String");
		String string = sc.next();
		System.out.println(CTS.camelToSnake(string));
		sc.close();
	}
}
