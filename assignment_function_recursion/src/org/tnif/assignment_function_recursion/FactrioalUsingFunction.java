package org.tnif.assignment_function_recursion;

import java.util.Scanner;

public class FactrioalUsingFunction {

	static int Factorial(int num)
	{
		
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
			
			
			
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		System.out.println(" the factriol of num is:"+Factorial(num));
	}

}
