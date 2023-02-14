package org.tnsif.expectionhandlingdemo;

import java.util.Scanner;

public class ArithemticExeceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println(" enter the value of x and y:");
         int x=s.nextInt();
         int y=s.nextInt();
         // try block contain expection code 
         try {
        	 int res=x/y;
        	 System.out.println(res);
         }
         //catch block handle exception
         catch(Exception e) {
        	 System.out.println(" exception handling :"+e); 
         }
         finally 
         {
        	 System.out.println("finally block");
         }
        s.close(); 
	}

}
