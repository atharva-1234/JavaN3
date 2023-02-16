package org.tnsif.multithreading;

public class MultithreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(" current Thread :"+t);
		try 
		{
			Thread.sleep(1);
		}
		catch (InterruptedException e)
		{
			System.out.print("main thread interputted");
		}
		

	}

}
