package org.tnif.assignment_function_recursion;

import java.util.Scanner;

public class SumOfDigitUsingRecursion {

	//function definition
	static int Sumofdigit(int n)
	{
		if(n==0)
			return 0;
		return (n % 10+Sumofdigit(n/10));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		int result= Sumofdigit(num);
		
		System.out.print("sum of digit is:" +result);
	}

}
