package openpractice;

import java.util.Scanner;

public class Area_circle {
	public static void main(String[]args) {
		 Scanner obj = new Scanner(System.in);
		System.out.println("enter a number");
		 double radius =obj.nextInt();
		 
	
		 double area= Math.PI *(radius *radius);
		 System.out.println("area of the circle :" + area);
	}	 
}
