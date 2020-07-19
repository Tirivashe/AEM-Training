package com.shamhu.exceptions;
import java.util.*;

public class ArrStoExcept {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Number[] number = new Double[5];
		try{
			number[0] = 3.4;
		}catch(ArrayStoreException e){
			System.out.println(e.getMessage() + " - wrong input type");
		}finally{
			System.out.println(number[0]);
		}

	}

}
