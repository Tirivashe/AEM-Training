package com.shamhu.exceptions;
import java.util.*;

public class NegArrayExpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size");
		int numbers[] = null;
		
		int a = sc.nextInt();
		
		try{
			numbers = new int[a];
		}catch(NegativeArraySizeException e){
			System.err.println(e.getMessage() +  " - Cannot have a negative size array");
		}
		finally{
			sc.close();
			for(int i = 0; i < a; i++){
				System.out.print("Enter a number: ");
				numbers[i] = sc.nextInt();
			}
			
			System.out.println("Numbers entered where: ");
			for(int i = 0; i < a; i++){
				System.out.println(numbers[i]);
			}
		}

	}

}
