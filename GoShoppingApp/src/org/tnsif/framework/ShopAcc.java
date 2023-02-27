package org.tnsif.framework;

public abstract class ShopAcc {
	
   private int acccno;
   private String accnm;
   private float charges;
// getters and setters 
public int getAcccno() {
	return acccno;
}
public void setAcccno(int acccno) {
	this.acccno = acccno;
}
public String getAccnm() {
	return accnm;
}
public void setAccnm(String accnm) {
	this.accnm = accnm;
}
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges = charges;
}

// parameterized constructor 
public ShopAcc( int acccno, String accnm, float charges) {
	super();
	
	this.acccno = acccno;
	this.accnm = accnm;
	this.charges = charges;
}

@Override
public String toString() {
	return "ShopAcc [acccno=" + acccno + ", accnm=" + accnm + ", charges=" + charges + "]";
}
   abstract void bookProduct(float charges);
  public void items (float chagres)
{
	System.out.println(charges);
}

   
   
   
}
