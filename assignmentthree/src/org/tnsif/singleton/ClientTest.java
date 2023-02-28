package org.tnsif.singleton;

public class ClientTest {
public static void main(String[] args) {
		
		/**
		 * Calling getInstance() method many times
		 * returns same hashcode that proves that
		 * Singleton class creates only one instance
		 */
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		
	}
}
