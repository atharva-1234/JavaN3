package org.tnif.encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter th pin:");
		
      HDFC h=new HDFC();
      h.setPin(1234567);
      System.out.println(h.getPin());
      h.accept();
      
	}

}
