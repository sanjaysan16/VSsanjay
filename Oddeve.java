package openpractice;
import java.util.Scanner;
public class Oddeve {
	public static void main(String[]args) {
		int num;
		System.out.println("enter a number :");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		
		if(num % 2==0)
			System.out.println("num is even");
		else
			System.out.println("num is odd");
	}

}
