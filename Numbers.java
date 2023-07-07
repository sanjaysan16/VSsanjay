package Closed_assign;


public class Numbers {
	 static void m1() {
		int num;
		int rev;
		
		num =11233;
		rev=0;
		 while(num!=0)
		 {
			 rev=rev*10 + num%10;
			 num=num /10;
		 }
		 System.out.println("reverse number is:"+ rev);	 
		 

	 }


static void m2() {
	int n =153;
	int s=0;
	
	while(n>0) {
		n=n%10;
		s=n*n*n;
		n=n/10;
	}
	if(n==s){
	
		System.out.println("the num is amstrong"+s);
	}
	else 
	{
		System.out.println("the num is not amstrong"+ s);
	}
	
}
	

public static void main(String[]args) {
	//Numbers num = new Numbers();
	m1();
	m2();
}
}