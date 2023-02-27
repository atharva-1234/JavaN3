package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Deque<String>obj =new ArrayDeque<>();
   
    obj.add("atharva");
    obj.addFirst("ganesh");
    obj.addLast("shirole");
    System.out.println(" Array deque  elements are :"+obj);
    
    
    // for to extract element from deque.
    for(String itr:obj)
    {
    	System.out.println(itr+" ");
    }
    obj.remove();
    System.out.println(" Array deque  elements are :"+obj);
    obj.removeFirst();
    System.out.println(" Array deque  elements are :"+obj);
    obj.removeLast();
    System.out.println(" Array deque  elements are :"+obj);
	}

}
