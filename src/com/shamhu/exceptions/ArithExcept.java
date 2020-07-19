package com.shamhu.exceptions;
import java.util.*;

public class ArithExcept {

	public static void main(String[] args) {
		int x = 3, y = 5, z = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the division calculator");
		System.out.print("Enter your first number: ");
		int first = sc.nextInt();
		
		System.out.print("Enter your second number: ");
		int second = sc.nextInt();
		
		try{
			result = first/second;
			System.out.println("Your answer is: " + result);
		}catch(ArithmeticException e){
			System.err.println("Caught an error, can't divide by zero");
		}
		finally{
			System.out.println("Calculation complete");
		}

	}

}
