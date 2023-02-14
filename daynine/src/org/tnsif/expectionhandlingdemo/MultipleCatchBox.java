package org.tnsif.expectionhandlingdemo;

public class MultipleCatchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {101,23,45};
		
        try
        {
        	System.out.println(arr[3]); 
        	int res=12/0;
        	System.out.println(res);
        }
        catch(ArithmeticException   | ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Exception handling "+e);	
        }
        finally 
        {
         System.out.println("finally block");
        }
          // int res= 20/0;
       /* try
        {
        	int res=12/0;
        	System.out.println(res);
        }
        catch( ArithmeticException e)
        {
        	System.out.println("Exception handling"+e);
        	
        }
        finally 
        {
        	System.exit(0);
        }*/

	}

}
