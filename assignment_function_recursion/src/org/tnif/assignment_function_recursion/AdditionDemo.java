package org.tnif.assignment_function_recursion;

import java.util.Scanner;

public class AdditionDemo {

	 // function definition;
	static int addition (int x,int y) {
		int sum=x+y;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x=s.nextInt();
        int y=s.nextInt();
        // function calling 
        System.out.println(addition(x,y));
	}

}
