package org.tnsif.mutable;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();  
        System.out.println(sb.capacity());
        sb.append("Hive");  
        System.out.println(sb.capacity());
        sb.append("Java is my favourite language"); 
        System.out.println(sb.capacity());
	}

}
