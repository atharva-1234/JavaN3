package org.tnsif.interfacedemo;

public class RX implements Bike {

	@Override
	public void milage(int speed) {
		// TODO Auto-generated method stub
		System.out.println("speedis "+speed);
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println(" 250cc");
	}

}
