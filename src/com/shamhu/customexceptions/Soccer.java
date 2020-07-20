package com.shamhu.customexceptions;
import java.util.*;

class InvalidSoccerPositionException extends Exception{
	public InvalidSoccerPositionException(String s){
		super(s);
	}
}

class SoccerPlayer{
	String position;
	
	public SoccerPlayer(String position){
		this.position = position;
	}
	
	public String getPlayerPosition(){
		return this.position;
	}
	
	public void confirmation(){
		System.out.println("Congrats. You play " + getPlayerPosition());
	}
}


public class Soccer {

	public static void main(String[] args) {
		System.out.print("Enter your position: ");
		Scanner sc = new Scanner(System.in);

		String position = sc.next();
		
		String[] positions = {"LW", "CF", "SS", "RW", "CAM", "CM", "LM", "RM", "CDM", "LB", "CB", "RB", "GK"};
		
		try{
			validatePosition(position, positions);
			SoccerPlayer ronaldo = new SoccerPlayer(position);
			ronaldo.confirmation();
			
		}catch(InvalidSoccerPositionException ex){
			ex.printStackTrace();
		}

	}
	public static void validatePosition(String position, String[] positions) throws InvalidSoccerPositionException{
		int found = 0;
		for(int i = 0; i < positions.length; i++){
			if(positions[i].equals(position)) found = 1;
		}
		if(found == 1){
			System.out.println("Position valid");
		}else{
			throw new InvalidSoccerPositionException("Position doesn't exist");
		}
	}
}
