package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add and offer method are used to insert method 
		Queue<Integer>obj=new PriorityQueue<>();
		obj.offer(6);
		obj.add(10);
		obj.offer(91);
		obj.add(15);
		System.out.println(" queue element are :"+obj);
		//obj.remove();
		//System.out.print(" queue element are :"+obj);
       /* obj.poll();
        obj.poll();
        obj.oll();
        obj.poll();*/
		obj.remove();
		System.out.println(" head element is :"+obj.peek());
        System.out.println(" queue element are :"+obj);
	}

}
