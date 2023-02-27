package org.tnsif.genericsdemo;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class GenericsAdvantageDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. type safety 
		// without generics 
		
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println(" without generics:"+obj);
		// whith generic
		
		ArrayList<Integer> obj1=new ArrayList<>();
		obj1.add(15);
		//obj1.add("15");
		System.out.println(" without generics:"+obj1);
		
		
		// 2.Typecasting is not allowed in generics 
		ArrayList obj2=new ArrayList<> ();
		obj2.add("met");
		// typecasting 
		String str=(String)obj2.get(0);
		System.out.println(str);
		// with  generic ,typecasting not allowed 
		ArrayList<String> obj3=new ArrayList<>();
		obj3.add("met");
		String str1=obj3.get(0);
		System.out.println(obj3);
		
		

	}

}
