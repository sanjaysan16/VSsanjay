package Assign_1;
import java.util.Scanner;

public class Arithmetic_operaions {
	
	
	public int add( int n1, int n2)
	{
		int sum = n1+n2;
		System.out.println("the sum of val is:"+sum);
		return sum;
	}
	
	public int sub ( int n1, int n2)
	{
		int subval = n1-n2;
		System.out.println("the subracted val is :"+ subval);
		return subval;
	}
	
	public int mul(int n1, int n2)
	{
		int product = n1 * n2;
		System.out.println("the product of the val is :"+ product);
		return product;
		
	}
	
	
	public int divid (int n1,int n2)
	{
		int diff =n1/n2;
		System.out.println("the division val is :"+diff);
		return diff;
	}

	public int powercal( int n1,int n2)
	{
		int power =1;
		for(int i=1;i<=1;i++)
			power =power*n2;
		System.out.println("the power val is :"+power);
		return power;
	}
	
	public static void main(String[]args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the first num");
		int n1= input.nextInt();
		System.out.println("Enter the Second Number");
		int n2=input.nextInt();
		
		Arithmetic_operaions arthamatic= new Arithmetic_operaions();
		arthamatic.add(n1,n2);
		arthamatic.sub(n1,n2);
		arthamatic.mul(n1,n2);
		arthamatic.powercal(n1,n2);
		arthamatic.divid(n1,n2);
		
	}
	}