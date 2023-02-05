package org.tnsif.looping;

public class ToCountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int count=0, num= 45602303;
      for(;num!=0;num/=10,++count)
      {
    	  System.out.println("Number of Digits:" +count);
      }
    	  
	}

}
