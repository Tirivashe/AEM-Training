package com.shamhu.customexceptions;
import java.util.*;

class WrongWeightException extends Exception{
	public WrongWeightException(String s) {
		super(s);
	}
}

public class WeightExcept {

	public static void main(String[] args) {
		System.out.println("Welcome to the UFC weight class assigner");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		int weight = sc.nextInt();
		
		try{
			assignWeightClass(weight);
		}catch(WrongWeightException e){
			e.printStackTrace();
		}
		finally{
			sc.close();
			System.out.println("Program closed");
		}
	}
	
	public static void assignWeightClass (int weight) throws WrongWeightException{
		if(weight < 115) throw new WrongWeightException("Weight entered is too low");
		else if(weight >= 115 && weight < 125) System.out.println("You are Strawweight");
		else if(weight >= 125 && weight < 135) System.out.println("You are Flyweight");
		else if(weight >= 135 && weight < 145) System.out.println("You are Bantamweight");
		else if(weight >= 145 && weight < 155) System.out.println("You are Featherweight");
		else if(weight >= 155 && weight < 165) System.out.println("You are Lightweight");
		else if(weight >= 165 && weight < 170) System.out.println("You are Super lightweight");
		else if(weight >= 170 && weight < 175) System.out.println("You are Welterwieght");
		else if(weight >= 175 && weight < 185) System.out.println("You are Super welterweight");
		else if(weight >= 185 && weight < 195) System.out.println("You are Middleweight");
		else if(weight >= 195 && weight < 205) System.out.println("You are Super middleweight");
		else if(weight >= 205 && weight < 225) System.out.println("You are Light heavyweight");
		else if(weight >= 225 && weight < 265) System.out.println("You are Cruiserweight");
		else if(weight >= 265 && weight < 280) System.out.println("You are Heavyweight");
		else throw new WrongWeightException("Weight entered is too high");
		
	}
}
