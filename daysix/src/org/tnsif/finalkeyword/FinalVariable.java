package org.tnsif.finalkeyword;

public class FinalVariable {
	final static int x=15;
	//final int y;
	public static void print()
	{
		// here we can't change the value of x because x is final
		//x=18;
		System.out.println(" The value of X is:"+x);
	}
	public static void main(String args[])
	{
		FinalVariable.print();
	}


}
