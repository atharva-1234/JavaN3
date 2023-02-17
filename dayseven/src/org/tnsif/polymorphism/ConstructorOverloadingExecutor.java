package org.tnsif.polymorphism;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println(" enter the speed and colour of a hondacity");
         int speed =s.nextInt();
         s.nextLine();
         String colour=s.nextLine();
         Hondacity c=new Hondacity();
         Hondacity c1=new Hondacity(speed,colour);
	}

}
