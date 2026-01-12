package AdvancedJavaConcepts;

public class MultithreadingUsingThreadClass extends Thread {
	
	public void run() {
		System.out.println("Code");
	}
	
	public static void main(String args[]) {
		MultithreadingUsingThreadClass ms=new MultithreadingUsingThreadClass();
		ms.start();
	}
	

}
