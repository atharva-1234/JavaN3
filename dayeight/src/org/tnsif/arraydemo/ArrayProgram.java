package org.tnsif.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println(" enter th no of elements in the array");
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		// to allocate the value to an array
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("array is :");
		// to print the array element 
		
		for (int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"  ");
			
		}
		// to sort an array 
		 Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]+"     ");
        }
		System.out.println("stored element are:");
		for (int itr:arr)
		{
			System.out.println(itr+" ");
		}
		s.close();
	}

}
