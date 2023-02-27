package org.tnsif.staticvariabledemo;

public class StaticMethod {
	private static double salary=12345.5;
	//static method
	public static void display()
	{
		System.out.println(" the salary is :"+salary);
	}
	//generate getter and setter
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
