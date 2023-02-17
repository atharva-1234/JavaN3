package org.tnsif.usingrunnable;
// program for runnable interface for a thread 
public class Marathon implements Runnable{
	
	
	private int speed ;
	private  String city;
	
	
	

	
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}


// runnable class
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" speed of participant:"+speed +" the city is: "+city);
	}
   
}
