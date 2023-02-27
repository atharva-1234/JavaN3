package org.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				//list 1
				Collection<Object>obj=new ArrayList<>();
				obj.add(101);	
				obj.add(101.7f);	
				obj.add('c');	
				System.out.println(" First list is:"+obj);
				
				// list 2
				List<Object>obj1=new ArrayList<>();
				obj1.add(101);	
				obj1.add(101.7f);	
				obj1.add('c');	
				obj1.addAll(obj);
				System.out.println(" Second list is:"+obj);
				
				System.out.println("The SIZE OF LIST ONE IS:"+obj.size());
				
				//list 3 using integer
				List<Integer>obj2=new ArrayList<>();
				obj2.add(41);
				obj2.add(58);
				obj2.add(90);
				System.out.println(" third list is:"+obj2);
				Collections.sort(obj2);
				System.out.println(" third list is in asecding :"+obj2);
				
	}

}
