package org.tnsif.apllication;

import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactroy;

public class GSShopFactory extends ShopFactroy {

	@Override
	public PrimeAcc getNewPrimeAcc(int Accno, String accnm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc p= new GSPrimeAcc(Accno, accnm, charges, isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAcc(int Accno, String accnm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc n=new GSNormalAcc(Accno,accnm,charges,deliveryCharges);
		return n;
	}

}
