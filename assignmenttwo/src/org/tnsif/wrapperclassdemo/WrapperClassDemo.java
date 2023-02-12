package org.tnsif.wrapperclassdemo;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Autoboxing
				int x=18;
				Integer y=x;
				System.out.println(y);
				
				//UnBoxing
				Integer i=new Integer(10);
				System.out.println(i);
				int b=i.intValue();
				System.out.println(b);
	}

}
