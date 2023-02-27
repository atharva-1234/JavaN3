package org.tnsif.annotations;
class Parent 
{
	void Print()
	{
		System.out.println(" Parent class Method");
	}
}
class Child extends Parent 
{
	@Override
	void Print()
	{
		super.Print();
		System.out.println(" Child class Method");
	}
}

public class OverrideAnnotationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.Print();
	}

}
