package org.tnsif.arraydemo;

import java.util.Scanner;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the elements:");
       // declaring 2-D array with 2rows
		
		int arr[][]	=new int [2][];
		// frist array has 3 columns
		 arr [0]=new int [3];
		 // 2nd has 2 columns
		 arr[1]=new int [2];
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 arr[i][j]=s.nextInt();
			 }
		 }
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				System.out.println( arr[i][j]);
			 }
		 }
		 System.out.println();
		 s.close();
	 }

}
