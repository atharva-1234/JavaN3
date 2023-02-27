package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>obj=new Stack<>();
		obj.push("Rasika");
		obj.push("bhushan");
		obj.push("gauri");
		obj.push("om");

		System.out.println(" The element inside the stack:"+obj);
		obj.pop();
		System.out.println(" The element inside the stack:"+obj);
	}

}
