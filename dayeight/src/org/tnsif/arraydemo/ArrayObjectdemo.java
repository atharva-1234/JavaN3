package org.tnsif.arraydemo;

import java.util.Scanner;

public class ArrayObjectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student arr[];
         Scanner s=new Scanner(System.in);
         System.out.println("enter the no of elememts:");
         int n=s.nextInt();
         arr=new Student[n];
         int i=0;
         while(i<n)
         {
        	 arr[i]=new Student(s.nextInt(),s.next(),s.nextFloat());
        	 i++;
        	 
         }
         for(int j=0;j<n;j++)
         {
        	System.out.println((arr[j].getRollno()+ " "+arr[j].getName()+" "+arr[j].getPercentange()) );
         }
         
        s.close();
         
        
          
	}

}
