package org.tnsif.thiskeyword;
class HR
{
	void display(HR obj)
	{
		System.out.println("human resource");
	}
	void accept()
	{
		display(this);
	}
}
public class ThisKeywordExecutor {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HR obj=new HR();
        obj.accept();
	}

}
