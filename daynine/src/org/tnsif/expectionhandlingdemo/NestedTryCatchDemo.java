package org.tnsif.expectionhandlingdemo;

import java.util.Scanner;

public class NestedTryCatchDemo {
	int arr[]=new int [] {1,2,3};
	try{
	
	  try
	  {
		System.out.println(arr[3]);
	   }
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("exception handled:"+e);
	}
	  try
	  {
		  int res=20/0;
			System.out.println(res);
	  }
	  catch(ArithmeticException  e)
		{
			System.out.println("exception handled"+e);
		}
	}

	
	
	

}
