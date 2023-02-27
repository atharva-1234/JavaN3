package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {
	
	final private float deliverCharges;
	// constructor 
 public NormalAcc(int acccno, String accnm, float charges,float deliverCharges) {
		super(acccno, accnm, charges);
		this.deliverCharges=deliverCharges;
		// TODO Auto-generated constructor stub
	}
 
@Override
public String toString() {
	return "NormalAcc [deliverCharges=" + deliverCharges + "]";
}
public void bookProduct(float charges)
{
	   System.out.println("Acc no"+this.getAcccno()+" "+"acc name:"+this.getAccnm()+" "+"deliverychagres:"+this.getCharges()
	   +" "+(this.getCharges()+this.deliverCharges));
}
}
