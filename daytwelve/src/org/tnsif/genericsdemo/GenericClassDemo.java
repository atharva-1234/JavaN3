package org.tnsif.genericsdemo;

class GenericClass<t>
{
	t x;
	void display(t x )
	{
		this.x=x;
	}
	t accept()
	{
		return x;
		
	}
}






public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> obj1=new GenericClass<String> ();
		obj1.display("technoServe India");
		//obj1.display(11);
		System.out.println(obj1.accept());
		
	}

}
