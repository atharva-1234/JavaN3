package org.tnsif.superkeyword;

public class Lotus extends Flower{
	 private String name;
// getter and setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 // default

	public Lotus() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// parameterized 

	public Lotus(String name) {
		super();
		this.name = name;
	}
	public void display() {
		
		System.out.println(name);
		super.setName("flower");
		System.out.println(super.getName());
	}
	
	

}
