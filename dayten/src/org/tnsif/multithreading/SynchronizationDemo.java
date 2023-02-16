package org.tnsif.multithreading;

public class SynchronizationDemo {
	synchronized void print(int num) throws InterruptedException
       {
    	   for (int i=1;i<=5;i++)
    	   {
    		   System.out.print(" num*i");
    		   
    	   }
       }
}
// thread 1
class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	 public void run()
	{
		 
		try {
			d.print(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
// thread 2
class ThreadTwo extends Thread
{
	SynchronizationDemo d;

	public ThreadTwo(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	 public void run()
	{
		try {
			d.print(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
}
