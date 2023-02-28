package org.tnsif.singletonLazyInitialization;

public class Singleton {
	private static Singleton INSTANCE = null;
	 
	/*
	 * private constructor so that
	 * preventing instance creation from other class
	 */
	private Singleton() {
 
	}
 
	/**
	 * This method has global access to return
	 * Single instance within JVM
	 * @return Singleton Instance
	 */
	public static Singleton getInstance() {
		//If Instance is null then only instantiate
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
 
	}
}
