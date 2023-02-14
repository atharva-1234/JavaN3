package org.tnsif.expectionhandlingdemo;
// program to demonstrate on when the finally 
public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int arr[]=new int[] {101,23,45};
            try
            {
            	System.out.println(arr[3]);
            	
            }
            catch(Exception e)
            {
            	System.out.println("Exception handling "+e);
            	
            }
            finally 
            {
            
            	
            	System.exit(0);
            	System.out.println("finally block");
            }
	}

}
