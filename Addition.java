package openpractice;

import java.util.Scanner;
public class Addition{
	public static void main(String[]args) {
		 Scanner obj =new Scanner(System.in);
		int first=obj.nextInt();
		int second=obj.nextInt();
		int sum = first + second;
		System.out.println("sum of two num: " +sum);
	}
}
