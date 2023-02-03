package org.tnsif.looping;

import java.util.Scanner;

// to demonstrate the example on " for loop"
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner (System.in);
		 System.out.println(" enter the numbers ");
		 int n=s.nextInt();
		 // to print 1 to N
		  for (int i=1;i<=n;i++)
		  {
			  System.out.print(i+ " ");
		  }
		  // to print N to 1
		  for( int i=n;i>0; i--)
		  {
			  System.out.print(i+" ");
		  }
	}
	
	

}
