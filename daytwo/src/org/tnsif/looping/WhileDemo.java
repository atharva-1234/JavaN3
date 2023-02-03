package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter number ");
		int n=s.nextInt();
		 // to print 1 to N
		int i=1;
		while ( i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
		i=n;
		  // to print N to 1
		while (i>=1)
		{
			System.out.print(i+" ");
			i--;
		}
	}

}
