package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecutor {
	
	 public static void addStudent(Set<Student>obj)
	 
	 {
	    Student student1=new Student(101,"atharva",87.65f);
	    Student student2=new Student(102,"omkar",88.65f);
	    Student student3=new Student(103,"nikhil",89.65f);
	    Student student4=new Student(104,"ganesh",90.65f);
	    Student student5=new Student(105,"chavan",91.65f);
	    Student student6=new Student(106,"shirole",92.65f);
	    
	    
	    obj.add(student1);
	    obj.add(student2);
	    obj.add(student3);
	    obj.add(student4);
	    obj.add(student5);
	    obj.add(student6);
	    
	    
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student>obj=new LinkedHashSet<>();
		     addStudent(obj);
           System.out.println("   "+obj);
           for(Student itr: obj) {
        	   System.out.println("   "+itr);
           }
	}

}
