package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the name and age ");
		String name=s.nextLine();
		String adress=s.nextLine();
		int age=s.nextInt();
         Child c=new Child();
         Child c1=new Child( name,adress,age) ;
         c1.setName(name);
         c1.setAddress(adress);
         c1.setAge(age);
         System.out.println(c1);
         System.out.println( c instanceof  Person );
         System.out.println( c1 instanceof Child );
         s.close();
	}

}
