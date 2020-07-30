package com.shamhu.StringManipulation;

public class DecToString {

	public static void main(String[] args) {
		double number = 123.456;
		String str = new StringBuilder().append(number).toString();
		System.out.println("After conversion: " + str);

	}

}
