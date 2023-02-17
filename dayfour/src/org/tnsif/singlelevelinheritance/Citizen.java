package org.tnsif.singlelevelinheritance;
// to demonstrate single inheritance 
public class Citizen {

	  private String  name;
	  private String adharno;
	  private String city;
	  private long  mbno;
	  //getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	// default constructor
	public Citizen() {
		System.out.println(" Parent class");
	}
	//parameterized 
	public Citizen(String name, String adharno, String city, long mbno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mbno = mbno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mbno=" + mbno + "]";
	}
	  
	
}
