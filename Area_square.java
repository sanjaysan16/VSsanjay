package openpractice;

import java.util.Scanner;

public class Area_square {
	public static void main(String[]args) {
		 Scanner obj = new Scanner(System.in);
		System.out.println("enter a number");
		 int side =obj.nextInt();
		 
	
		 int area= (side * side);
		 System.out.println("area of the square :" + area);
		 
		}

	

}
