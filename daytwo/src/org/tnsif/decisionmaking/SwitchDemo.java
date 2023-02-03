package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the song number ");
		 int songno=s.nextInt();
		 switch(songno)
		 {
		 case 1:
			 System.out.println("kesriya  "); 
			 break;
		 case 2:
			 System.out.println(" atharva  ");
			 break;
		 case 3:
			 System.out.println(" jingat ");
			 break;
		 case 4:
			 System.out.println(" blue eyes ");
			 break;
		default:
			System.out.println(" invalid input ");
			
		 }
		 
	}

}
