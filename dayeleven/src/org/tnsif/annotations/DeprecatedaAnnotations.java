package org.tnsif.annotations;
class DeprecatedDemo
{
	@Deprecated
	public void display()
	{
		System.out.println(" Deprected class demo");
	}
}

public class DeprecatedaAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeprecatedDemo d=new DeprecatedDemo();
		d.display();
	}

}
