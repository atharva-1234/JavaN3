package org.tnsif.multilevelinheritance;

public class Android extends Nokia{
	
	private String version;
	@SuppressWarnings("unused")
	public void accept() {
		System.out.println(" the andoird vesrion name is :"+version);
		
	}
	// getter and setter 
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	// constructor default
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	// constructor parameterized
	public Android(String version) {
		super();
		this.version = version;
	}
	
	
	
}
