package org.tnsif.instanceofdemo;
// parent class
// to demonstrate instance of operator
public class Person {
 private String name;
 private String address;
 //getter and setter 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
//default 
public Person() {
	System.out.println(" parent class");;
	// TODO Auto-generated constructor stub
}
//parameterized 
public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
// to string method
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + "]";
			 
}

 
 
}
