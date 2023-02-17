package org.tnsif.polymorphism;
// child class
public class SBI  extends RBI{
	 float getinterest()
	    {
		 System.out.println(super.getinterest());
	    	return 12.5f;
	    }
}
