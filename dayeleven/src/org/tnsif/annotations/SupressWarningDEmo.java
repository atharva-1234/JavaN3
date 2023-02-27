package org.tnsif.annotations;

import java.util.Scanner;

public class SupressWarningDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this warning is used to remove warning created at compile time 
       @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
       s.nextInt();
	}

}
