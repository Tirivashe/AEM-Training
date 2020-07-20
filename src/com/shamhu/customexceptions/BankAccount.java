package com.shamhu.customexceptions;
import java.util.*;

class InvalidAmountException extends Exception{
	public InvalidAmountException(String s){
		super(s);
	}
}

class Account {
	
	int balance;
	public Account(int balance){
		this.balance = balance;
	}
	
	public void deposit(int amount) throws InvalidAmountException{
		if(amount < 0) throw new InvalidAmountException("Invalid Amount");
		else balance += amount;
		System.out.println("Your new balance is: " + balance);
	}
	
	public void withdraw(int amount) throws InvalidAmountException{
		if(amount > balance) throw new InvalidAmountException("Insufficient funds in your account");
		else if(amount < 0) throw new InvalidAmountException("Invalid Amount");
		else balance -= amount;
		System.out.println("Your new balance is: $" + balance);
	}
}

public class BankAccount {

	public static void main(String[] args) {
		
		Account checking = new Account(5000);
		try{
			checking.deposit(1250);
			checking.withdraw(30);
		}catch(InvalidAmountException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Done");
		}

	}

}
