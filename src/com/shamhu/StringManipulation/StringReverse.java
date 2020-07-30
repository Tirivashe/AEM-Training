package com.shamhu.StringManipulation;

public class StringReverse {
	
	public static void main(String[] args) {
		reversePrint("MYHOMEISJEWEL");
	}
	
	private static void reversePrint(String S) {
		StringBuilder sb = new StringBuilder(S);
		StringBuilder reversedString = new StringBuilder();

		CharSequence sub1 = sb.subSequence(0, 2);
		CharSequence sub2 = sb.subSequence(2, 6);
		CharSequence sub3 = sb.subSequence(6, 8);
		CharSequence sub4 = sb.subSequence(8, 13);
		
		reversedString.append(sub4).append(sub3).append(sub1).append(sub2);
		
		System.out.println(reversedString);

	}

}
