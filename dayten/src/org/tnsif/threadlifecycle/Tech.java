package org.tnsif.threadlifecycle;
// program for thread lifecycle
public class Tech extends Thread {
	public void run()
	{
		System.out.println("Java full stcak Training ");
		for (int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			try
			{
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.print("techincal session");
	}

}
