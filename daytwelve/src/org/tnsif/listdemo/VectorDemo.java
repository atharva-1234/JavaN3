package org.tnsif.listdemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object>obj1=new Vector<>();
		obj1.add(101);	
		obj1.add(101.7f);	
		obj1.add('c');	
		obj1.add(30.8f);	
		//obj1.addAll(obj);
		System.out.println("first list is:"+obj1);
		
		System.out.println("The SIZE OF LIST ONE IS:"+obj1.size());
		
		System.out.println("The list is empty:"+obj1.isEmpty());
		
		//obj1.remove(101);
		
		System.out.println("first list is:"+obj1);
		System.out.println("the list contains:"+obj1.contains(101));
		System.out.println("first list is:"+obj1.get(1));
		
		System.out.println("index of character:"+obj1.indexOf('c'));
		
		System.out.println("index of float number:"+obj1.indexOf(30.8f));
		
		
		
		/*list 3 using integer
		List<Integer>obj2=new Array
		yList<>();
		obj2.add(41);
		obj2.add(58);
		obj2.add(90);
		System.out.println(" third list is:"+obj2);
		Collections.sort(obj2);
		System.out.println(" third list is in asecding :"+obj2);*/
	}

}
