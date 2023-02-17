package org.tnsif.multilevelinheritance;
// child class 2
public class Iphone extends Android  {
 
	private String slottype;
	public void slot()
	{
		System.out.println(" slottype is :"+slottype);
	}
	// getter and setter 
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	// constructor default 
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	// constructor using parameters
	public Iphone(int modelno,String version,String slottype) {
		super();
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
	
	
	
}
