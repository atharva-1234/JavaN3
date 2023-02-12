package org.tnif.stringdemo;
//program on string creations
import java.util.Scanner;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using string literal
        Scanner s=new Scanner(System.in);
        System.out.println("enter the frist string:");
        String str1=s.nextLine();
        System.out.println("first string is:"+str1);
        
        // using new keyword
        System.out.println("enter the second string:");
        String str2=new String(s.nextLine());
        System.out.println("second string is:"+str2);
        if (str1.equals(str2))
        {
        	System.out.println("same");
        }
        else
        {
        	System.out.println("different");
        }
        char c[]= {'a','t','h','a','r','v','a'};
        String srt3=new String(c);
        System.out.println(srt3);
	}

}
