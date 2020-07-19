package com.shamhu.exceptions;
import java.util.*;

public class ArrExcept {

	public static void main(String[] args) {
		String[] names = new String[5];
		System.out.println("Insert Names");
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try{
			while(true){
				String name = sc.next();
				names[index] = name;
				index++;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println(e.getMessage() +" - Error occured. Cannot add more");
		}
		finally{
			System.out.println("People added where: ");
			for(int i = 0; i < names.length; i++){
				System.out.println(names[i]);
			}
		}

	}

}
