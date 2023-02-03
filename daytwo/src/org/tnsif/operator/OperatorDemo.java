package org.tnsif.operator;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("enter the value of x and y");
      int x=s.nextInt();
      int y=s.nextInt();
      System.out.println(x+y);
      System.out.println(x-y);
      System.out.println(x*y);
      System.out.println(x/y);
      
      boolean res =x>y;
      System.out.println(res);
      //assignment opertor 
      x*=y;
      System.out.println(x);
      
    // logical operator 
       boolean res2=(5==5)&&(5>3); //true
       boolean res3=(5==3) || (5>7); //true 
       boolean res4= !(5==4);
       System.out.println(res2);
       System.out.println(res3);
       System.out.println(res4);
       
       //bitwise 
       int a=12 & 5;
       int b=12 | 5;
       int c=12^ 5;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       
       // ternary operator 
       
     String res5=(13%2==0)? "even":"odd";
       System.out.println(res5);
       
       //increment and decrement 
       int p= x++;
       int q= --x;
       System.out.println(q);
       }

}
