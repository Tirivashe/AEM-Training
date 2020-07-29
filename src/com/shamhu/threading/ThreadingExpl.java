package com.shamhu.threading;

class MyThread extends Thread{

	public void run(){
		for(int i = 0; i <= 10; i++){
			System.out.println("Ran thread operation " + i);
		}
	}
}


public class ThreadingExpl {

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();
		
	}

}
