package openpractice;
import java.util.Scanner;
public class Area_triangle {
	public static void main(String[]args) {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("enter the length of triangle");
	 int base =obj.nextInt();
	 System.out.println("enter the width of triangle");
	 int height = obj.nextInt();
	 
	 int area= (base * height)/2;
	 System.out.println("area of the triangle :" + area);
	 
	}

}
