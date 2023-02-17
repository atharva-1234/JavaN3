package org.tnsif.polymorphism;
// program on constructor overloading 
public class Hondacity {
  private int speed;
 private String colour;
 
 // getter and setter 
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
// constructor default
  public Hondacity() {
	  System.out.println("  honda city is good car");
  }
  // using field
public Hondacity(int speed, String colour) {
	super();
	this.speed = speed;
	this.colour = colour;
	System.out.println(" speed is "+speed+"and colur is"+colour);
}
  
  
}
