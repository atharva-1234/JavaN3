package org.tnsif.client;

import org.tnsif.apllication.GSNormalAcc;
import org.tnsif.apllication.GSPrimeAcc;
import org.tnsif.apllication.GSShopFactory;
import org.tnsif.framework.ShopFactroy;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ShopFactroy f=new GSShopFactory();
		 GSPrimeAcc p=new GSPrimeAcc(1234, "atharva", 1050f, true);
		 GSNormalAcc n=new GSNormalAcc (1134, "omkar",1050f,60f);
		 // prime account 
		 System.out.println(" prime acc");
		 System.out.println(p);
		p.bookProduct(p.getCharges());
		 
		 // normal account 
		 System.out.println("normal account ");
		 System.out.println(n);
		 n.bookProduct(n.getCharges());
	}

}
