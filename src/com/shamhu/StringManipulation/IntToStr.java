package com.shamhu.StringManipulation;

public class IntToStr {

	public static void main(String[] args) {
		Integer number = new Integer(123);
		String str = new StringBuilder().append(number).toString();
		System.out.println("After conversion: " + str);

	}

}
