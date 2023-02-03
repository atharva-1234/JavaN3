package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NastedIFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter the age and weight");
		int age=s.nextInt();
		int weight=s.nextInt();
		if (age>=12)
		{
			if(weight>=40)
			{
				if(weight<120)
				{
					System.out.println("Eligiable for jumping ");
					
				}
				else
				{
					System.out.println("extra Ropes will added");
				}
			}
				else 
				{
					System.out.println(" not eligiable ");
				}
		}
				else 
				{
					System.out.println(" not eligiable for jumppimg ");
				}
			}
		
	}












