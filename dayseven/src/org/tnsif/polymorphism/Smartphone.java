package org.tnsif.polymorphism;
// program to demonstrate on method overloading 
public class Smartphone {
	private int resulotion;
	private String slottype;
	
	//  method overloading in terms by pasiing no of agrugment 
      void display(int resulotion)
      {
    	  System.out.println(" camrer resolution:"+resulotion);
      }
      void display(int resolution,String slottype)
      {
    	 System.out.println(" Camera resolution:"+resulotion+" slottype"+slottype); 
      }
	public int getResulotion() {
		return resulotion;
	}
	public void setResulotion(int resulotion) {
		this.resulotion = resulotion;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}

}
