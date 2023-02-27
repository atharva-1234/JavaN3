package org.tnsif.apllication;

import org.tnsif.framework.NormalAcc;

public  class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accnm, float charges, float deliverCharges) {
		super(accno, accnm, charges, deliverCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	

}
