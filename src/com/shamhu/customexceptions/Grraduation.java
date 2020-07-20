package com.shamhu.customexceptions;

class InvalidGpaException extends Exception{
	public InvalidGpaException(String s){
		super(s);
	}
}

class Graduate{
	double gpa;
	public Graduate(double gpa){
		this.gpa = gpa;
	}
	
	public void validateGpa() throws InvalidGpaException{
		if(this.gpa < 0.0 || this.gpa > 4.0)  throw new InvalidGpaException("Invalid GPA");
	}
	
	public double getGpa(){
		return this.gpa;
	}
}

public class Grraduation {
	public static void main(String[] args) {
		
		Graduate thomas = new Graduate(4.0);
		
		try{
			thomas.validateGpa();
			if(thomas.getGpa() <= 2.5) System.out.println("I'm sorry. You cannot graduate");
			else System.out.println("Congratulations. With your GPA of " + thomas.getGpa() + ", you can graduate");
		}catch(InvalidGpaException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Complete");
		}
		
	}

}
