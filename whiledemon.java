package openpractice;
import java.util.Scanner;
public class whiledemon {
	public static void main(String[]args) {
		int number,sum =0;
		System.out.println("enter a numberbelow 10");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	   	while(number <=10){
	   		sum=sum +number;
	   		number++;
	   	}
	   		System.out.format(" Sum of the Numbers From the While  Loop is: %d ",sum );
	   	}
	}



