package org.tnsif.herichicalinherticance;

import java.util.Scanner;

public class hierachicalInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the type and version");
		String type=s.nextLine();
		int version =s.nextInt();
		int vesrion1=s.nextInt();
		SnowCone s1=new SnowCone();
		s1.setType("vivo");
	
		s1.setVersion(version);
		
		
	}

}
