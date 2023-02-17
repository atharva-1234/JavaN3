package org.tnsif.singlelevelinheritance;
//parent class 
public class Student extends Citizen {
	
    private int rollno;
    private String studentname;
    // getter and setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	// default 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Student(String name,String adharno,String city, long mbno, int rollno, String studentname) {
		super();
		this.rollno = rollno;
		this.studentname = studentname;
	}
	// to string method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentname=" + studentname + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
	
    
    
    
    
    
}
