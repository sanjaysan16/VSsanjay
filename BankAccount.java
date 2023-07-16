package Lab1;

public class BankAccount {
	private int Accountnuber;
	private String Customername;
	private double Balance;
	
	BankAccount(){
		
	}
	public BankAccount(int accountnuber, String customername, double balance) {
		super();
		Accountnuber = accountnuber;
		Customername = customername;
		Balance = balance;
	}
	public int getAccountnuber() {
		return Accountnuber;
	}
	public void setAccountnuber(int accountnuber) {
		Accountnuber = accountnuber;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [Accountnuber=" + Accountnuber + ", Customername=" + Customername + ", Balance=" + Balance
				+ "]";
	}
	
	

}
