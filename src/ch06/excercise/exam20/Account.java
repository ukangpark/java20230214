package ch06.excercise.exam20;

public class Account {
	String accountNumber;
	String accountName;
	int accountBalance;
	
//	private Account () {
//		
//	}	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void setAdd(int add) {
		accountBalance += add;
	}
	public void setMinus(int minus) {
		accountBalance -= minus;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	public int getAccountBalance() {
		return this.accountBalance;
	}
	

}
