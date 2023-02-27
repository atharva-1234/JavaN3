package org.tnsif.finalkeyword;

public class Child extends Parent{
	private int price;
	//
	/*void display()
	{
		System.out.println(" Gauri ");
	}*/
	
	// the parent class method we can not override in final keyword
	// but we overload
	final void display(int price)
	{
		System.out.println(" the price is: "+price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
