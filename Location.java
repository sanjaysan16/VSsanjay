package Closed_assign;
import java.util.Scanner;
public class Location {
	public static void main(String[]args) {
		int array[] = {1,2,3,4,5,6};
		int location;
		System.out.println("enter the location");
		Scanner sc = new Scanner(System.in);
		location = sc.nextInt();
		
		for(int i=0;i<array.length;i++) 
		{
			if(location==array[i])
			{
			System.out.println("the location is:"+i);
			break;
		}
			else {
				System.out.println("location not found");
				break;
			}
	}
            
}
}
