package Lab1;

public class Bank2 {
	public static void main(String[]args) {
		BankAccount  b=new BankAccount() ;
		b.setAccountnuber(111);
		b.setBalance(222);
		b.setCustomername("sanjay");
		BankAccount b1=new BankAccount(222,"kala",400);
		BankAccount b2=new BankAccount(333,"deeraj",0.0);
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		System.out.println(b.getAccountnuber()+" "+b.getCustomername()+" "+b.getBalance());
	}

}
