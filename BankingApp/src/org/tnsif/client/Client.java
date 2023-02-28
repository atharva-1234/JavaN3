package org.tnsif.client;

import java.util.Scanner;

import org.tnsif.apllication.MMBankFactory;
import org.tnsif.apllication.MMCurrentAcc;
import org.tnsif.apllication.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		 MMBankFactory f=new  MMBankFactory ();
		 MMSavingAcc s=new MMSavingAcc(20000, "atharva", 5000, true);
		 MMCurrentAcc c=new MMCurrentAcc(230202, "omkar", 5000, 600);
		 
		 
		 
		  //Saving account 
		 System.out.println("SAVING aCCOUNT ");
		 System.out.println(s);
		
		 s.withdraw(s.getAccBal());
		 // current account 
		 System.out.println(" CURRENT ACCOUNT");
		 System.out.println(c);
		 //s.deposite(s.getAccBal());
		 c.withdraw(c.getAccBal());
		 
	}

}
