package org.tnsif.singleton;

public class Singleton {
	//Eager initialization
		private static final Singleton INSTANCE = new Singleton();
		
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
			return INSTANCE;
			
		}

}
