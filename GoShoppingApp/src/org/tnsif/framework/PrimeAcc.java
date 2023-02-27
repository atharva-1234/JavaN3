package org.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	// constructor 
   public PrimeAcc(int acccno, String accnm, float charges, boolean isPrime) {
		super(acccno, accnm, charges);
		// TODO Auto-generated constructor stub
	}
   private static final float deliveryCharges=0.0f;
   
   @SuppressWarnings("static-access")
public void bookProduct(float charges)
   {
	   System.out.println("Acc no"+this.getAcccno()+" "+"acc name:"+this.getAccnm()+" "+"deliverychagres:"+this.getCharges()
	   +" "+(this.getCharges()+this.deliveryCharges));
   }

@Override
public String toString() {
	return "PrimeAcc [isPrime=" + isPrime + "]";
}
   
}
