package com.shamhu.exceptions;
import java.util.*;

public class NumFormatExcept {

	public static void main(String[] args) {
		System.out.println("Welcome to the adding program");
		int a, b;
		
		Scanner sc  = new Scanner(System.in);
		
		try{
			System.out.println("Enter 2 numbers");
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
			
			System.out.print("Answer is: ");
			System.out.println( a + b);
		}catch(NumberFormatException e){
			System.err.println(e.getMessage() + " - Invalid input. Please enter a number");
		}
		finally{
			sc.close();
		}

	}

}
