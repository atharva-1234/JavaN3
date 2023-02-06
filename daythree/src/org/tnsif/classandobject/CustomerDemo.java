package org.tnsif.classandobject;

import java.util.Scanner;

public class CustomerDemo {
//driver class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter the values ");
		 int id;
		 String city,custname;
		
		 id=s.nextInt();
		 s.nextLine();
		 
		 city=s.nextLine();
		 custname=s.nextLine();
		 
		Customer c=new Customer();
		c.setId(id);
		c.setCustname(custname);
		c.setCity(city);
		
		c.display();
		s.close();
	}

}
