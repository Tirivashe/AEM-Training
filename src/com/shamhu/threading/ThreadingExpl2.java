package com.shamhu.threading;

class MyThread2 implements Runnable{

	public void run(){
		for(int i = 0; i <= 10; i++){
			System.out.println("Ran thread operation " + i);
		}
	}
	
}

public class ThreadingExpl2 {

	public static void main(String[] args) {
		
		Runnable obj2 = new MyThread2();
		Thread process = new Thread(obj2);
		process.start();
	}

}
