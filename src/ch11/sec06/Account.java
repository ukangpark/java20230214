package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficienetException {
		if (balance < money) {
			throw new InsufficienetException("잔고 부족: " + (money-balance) + "모지람");
		}
		
		balance -= money;
	}

}
