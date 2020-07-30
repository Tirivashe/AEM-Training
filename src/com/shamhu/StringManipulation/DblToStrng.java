package com.shamhu.StringManipulation;

public class DblToStrng {

	public static void main(String[] args) {
		double number = 123.456;
		String str = new StringBuilder().append(number).toString();
		System.out.println("After conversion from double to string: " + str);
		
		double num = Double.parseDouble(str);
		System.out.println("After conversion to double from string: " + num);

	}

}
