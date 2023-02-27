package org.tnsif.staticvariabledemo;

public class StaticBlock {
	private int n;
	private static String name;
	//generate getter and setters
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		StaticBlock.name = name;
	}
	// static Block
	static
	{
		name="Rasika";
	}


}
