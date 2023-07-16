package Lab1;
import java.util.Scanner;
public abstract class Shape {
	abstract void Calculatearea();
	Scanner sc =new Scanner(System.in);
	public static void main(String[]args) {
		//System.out.println("hi");
		Rectangle r=new Rectangle();
		Circle c =new Circle();
		r.Calculatearea();
		c.Calculatearea();
		}
}

   class Rectangle extends Shape{

	@Override
	void Calculatearea() {
	System.out.println("enter the length of rectangle");
	int length=sc.nextInt();
	System.out.println("enter the breath of rectangle");
	int breath=sc.nextInt();
	double area =length *breath;
	System.out.println("the area of triangle is :"+area);
		
	}
	
}
   
   class Circle extends Shape{

	@Override
	void Calculatearea() {
		// TODO Auto-generated method stub
		System.out.println("enter the radius");
		int radius = sc.nextInt();
		double area = Math.PI *(radius *radius);
		System.out.println("The area of the circle is "+area);
	}
	
	//
	
	
	   
   }