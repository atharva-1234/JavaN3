package org.tnif.assignment_function_recursion;

import java.util.Scanner;

public class FactrioalUsingRecursion {

	// function definition 
	static int factrioal(int num){
		{
			if(num!=0)
				return num*factrioal(num-1);
			return 1;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=s.nextInt();
		System.out.println(" the factriol of num is:"+factrioal(num));
	}

}
