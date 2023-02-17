package org.tnsif.polymorphism;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the resolution and slottype"+"of a cellphone");
		int resulotion=s.nextInt();
		s.nextLine();
		String slottype=s.nextLine();
		
             Smartphone sp=new Smartphone();
             sp.setResulotion(resulotion);
             sp.setSlottype(slottype);
             sp.display(resulotion);
             sp.display(resulotion, slottype);
             
             Multiplication m=new Multiplication();
             System.out.println(m.mul(10,2));
             System.out.println(m.mul( 5.3f,10));
	}
	
	

}
