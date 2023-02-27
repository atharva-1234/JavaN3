package org.tnsif.framework;

public abstract class ShopFactroy {
       public abstract PrimeAcc getNewPrimeAcc(int Accno, String accnm, float charges ,boolean isPrime);
       public abstract 	NormalAcc getNewNormalAcc(int Accno, String accnm, float charges ,float deliveryCharges);
}
