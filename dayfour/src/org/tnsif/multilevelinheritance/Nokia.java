package org.tnsif.multilevelinheritance;

public class Nokia {
  private int modelno;
  public  void display()
  {
	  System.out.println("the model no is :"+modelno);
  }
 // getter and setter 
public int getModelno() {
	return modelno;
}
public void setModelno(int modelno) {
	this.modelno = modelno;
}
  // default constructor
public Nokia() {
	System.out.println(" nokia class");
	// TODO Auto-generated constructor stub
}
public Nokia(int modelno) {
	super();
	this.modelno = modelno;
}
 

}
