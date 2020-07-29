package com.shamhu.threading;

class DocPrinter{
	public void startPrinting(String threadName, int numOfDocs){
		for(int i = 0; i < numOfDocs; i++){
			System.out.println("Printed docs from " + threadName + ": " + i);
		}
	}
}

class Thread1 extends Thread{
	DocPrinter dPrint;
	
	Thread1(DocPrinter p){
		dPrint = p;
	}
	
	public void run(){
		dPrint.startPrinting("Thread 1" , 10);
	}
}

class Thread2 extends Thread{
	DocPrinter dPrint;
	
	Thread2(DocPrinter p){
		dPrint = p;
	}
	
	public void run(){
		dPrint.startPrinting("Thread 2", 10);
	}
}

class Thread3 extends Thread{
	DocPrinter dPrint;
	
	Thread3(DocPrinter p){
		dPrint = p;
	}
	
	public void run(){
		dPrint.startPrinting("Thread 3", 10);
	}
}

public class ThreadingExpl3 {

	public static void main(String[] args) {
		DocPrinter printer = new DocPrinter();
		Thread1 Thread1 = new Thread1(printer);
		Thread2 Thread2 = new Thread2(printer);
		Thread3 Thread3 = new Thread3(printer);
		
		Thread1.setPriority(1);
		Thread2.setPriority(2);
		
		Thread1.start();
		Thread2.start();
		Thread3.start();
		
	}

}
