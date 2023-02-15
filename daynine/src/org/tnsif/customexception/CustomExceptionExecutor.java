package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.print(" enter the id and password ");
        String id=s.nextLine();
        String password =s.nextLine();
        //if(id!=" athrvashirole@gmail.com" && password!=" abc@123")
        try 
        {
        	if(id.equals(" athrvashirole@gmail.com") && password.equals(" abc@123")) {
        		throw new LoginCredential ("invalid Credential");
        	}
        	else 
        		throw new LoginCredential("invalid ");
        	
        }
        catch (LoginCredential e)
        {
        	System.out.print(" excepention handdled "+e);
        }
        s.close();
	}
	

}
