package org.tnif.assignment_function_recursion;

import java.util.Scanner;

public class FibonacciUsingRecursion {
 static int n1=0,n2=1,n3=0;
 static void Fibonacci(int count)
 {
	 if (count>0)
	 {
		 n3=n1+n2;
		 n1=n2;
		 n2=n3;
		 System.out.print(" "+n3);
		 Fibonacci(count-1);
		 
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int count=s.nextInt();
		System.out.print(n1+" "+n2);
		Fibonacci(count-2);
		
	}

}
