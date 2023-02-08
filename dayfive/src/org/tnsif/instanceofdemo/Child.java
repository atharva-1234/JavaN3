package org.tnsif.instanceofdemo;

public class Child extends Person{
  private int age;
  //

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
  // default 

public Child() {
	super();
	// TODO Auto-generated constructor stub
}
// parameterized 

public Child(String name,String address,int age) {
	super();
	this.age = age;
}
// to string 

@Override
public String toString() {
	return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
}

}
