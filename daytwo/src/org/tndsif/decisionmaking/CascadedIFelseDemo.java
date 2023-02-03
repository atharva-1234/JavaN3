package org.tndsif.decisionmaking;
 import java.util.Scanner;
public class CascadedIFelseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      
      if (a>b && a>c)
    	  System.out.println(" a is Greater :");
      else if (b>a && b>c)
    	  System.out.println(" b is Greater :"); 
      else 
    	  System.out.println(" c is greater :");
	}

}
