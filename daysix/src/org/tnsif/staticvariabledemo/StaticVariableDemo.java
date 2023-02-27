package org.tnsif.staticvariabledemo;

public class StaticVariableDemo {
	static int n=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=4;									
		System.out.println(" n value is:"+n);	//here they call recent variable n=4
	}
}
