package org.tnsif.staticvariabledemo;

public class StaticVariable {
private String name;
	
	public static String companyname="TNS";

	public StaticVariable(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "]";
	}
	
	

}
