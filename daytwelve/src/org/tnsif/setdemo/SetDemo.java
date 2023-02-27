package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("atharva ");
		obj1.add(25.3f);
		System.out.println(" Set 1 elemetns are:"+obj1);
		
		//set 2
		Set<Object>obj2=new LinkedHashSet<>();
		obj2.add(10);
		obj2.add(" shirole");
		obj2.add(30.6f);
		System.out.println(" Set 2elements are :"+obj2);
		

	}

}
