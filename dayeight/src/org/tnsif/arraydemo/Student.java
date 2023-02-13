package org.tnsif.arraydemo;
// program to demostrate on array object
public class Student {
  private int rollno;
  private String name;
  private float percentange;
  // getter and setter 
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPercentange() {
	return percentange;
}
public void setPercentange(float percentange) {
	this.percentange = percentange;
}
    //parameterized constructor
public Student(int rollno, String name, float percentange) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.percentange = percentange;
}

}
