package com.shamhu.threading;

import java.util.Scanner;

class Printer{
	public void produce() throws InterruptedException{
		synchronized(this){
			System.out.println("Produce function running");
			wait();
			System.out.println("Resumed");
			
		}
		
	}
	
	public void consume() throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		Thread.sleep(1000);
		synchronized(this){
			System.out.println("Waiting for you to press Enter");
			sc.next();
			System.out.println("Key Pressed");
			notify();	
		}		
	}
}

class ThreadOne extends Thread{
	Printer p = new Printer();
	
	public void run(){
		try{
			p.produce();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

class ThreadTwo extends Thread{
	Printer p = new Printer();
	
	public void run(){
		try {
			p.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



public class ThreadingExpl4 {

	public static void main(String[] args) throws InterruptedException {
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
