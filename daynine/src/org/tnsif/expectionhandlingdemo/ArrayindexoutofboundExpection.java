package org.tnsif.expectionhandlingdemo;

public class ArrayindexoutofboundExpection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(" First line  ");
           System.out.println(" Second line   ");
           try
           {
        	   int [] myIntArray=new int[] {1,2,2};
        	   System.out.println(myIntArray);
           
	        }
           catch(Exception e)
           {
        	   System.out.println(  "  Exception"+e);
           }
           System.out.println(" third line ");
  
}
	public static void print(String[] args) {
	}
	
	}

