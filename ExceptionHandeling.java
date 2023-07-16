package Lab1;
import java.util.Scanner;

public class Exceptionhandling {
	
	Scanner s = new Scanner(System.in);
	int a;
	int b;
	int c;
	
	public void divid() {
		System.out.println("enter the divider");
		a=s.nextInt();
		System.out.println("enter the divider");
		b=s.nextInt();
		try {
			c=a/b;
		}
		catch(Exception e) {
			System.out.println("enter the number except 0");
		}
		System.out.println(c);
		}
	
	public static void main(String[]args) {
		Exceptionhandling d=new Exceptionhandling() ;
		
		d.divid();
		
	}

}