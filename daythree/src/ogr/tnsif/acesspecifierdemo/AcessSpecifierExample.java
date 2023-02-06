package ogr.tnsif.acesspecifierdemo;

public class AcessSpecifierExample {
    //data members 
	private String name;
	public void display()
	{
		System.out.println("  welcome "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
