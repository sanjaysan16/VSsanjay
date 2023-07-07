package openpractice;

public class Swap {
	public static void main(String[]args) {
		int n1=2 ,n2=3;
		System.out.println("befor swap");
		System.out.println(n1);
		System.out.println(n2);
		
		int temp = n1;
		
		n1 = n2;
		n2 = temp;
		
		System.out.println("after swap");
		System.out.println(n1);
		System.out.println(n2);
	}

}
