package org.tnsif.arraydemo;

import java.util.Scanner;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the elemnets:");
		int n=s.nextInt();
		int m=s.nextInt();
		
            int [][]a=new int [n][m];
            for (int i=0; i<n;i++)
            {
            	for (int j=0;j<n;j++)
            	{
            		a [i][j]=s.nextInt();
            	}
            	
            	
            }
            for (int i=0;i<m;i++)
            {
            	for(int j=0;j<m;j++) {
            	System.out.println(a[i][j]+" ");
            	}
            }
          System.out.println();  
       s.close();     
	}

}
