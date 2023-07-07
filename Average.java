package Closed_assign;
import java.util.Scanner;
public class Average {
	static void m1() {
		System.out.println("Enter the count of num");
		Scanner sc =new Scanner(System.in);
		int count ;
		count =sc.nextInt();
		System.out.println("Enter the numbers");
		int number,sum=0;
		float average=0;
		Scanner num = new Scanner(System.in);
		
		for( int i=0;i<count;i++) {
			number =num.nextInt();
			sum = sum+number;
			
		}
			average = sum/ count;
			System.out.println("averge og num is:"+average);
	
	}
	
	
	
	
	
	public static void main(String[]args) {
			m1();
	}

}
