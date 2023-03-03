package ch06.excercise.exam19;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public void setBalance(int money) {
		if (money >= MIN_BALANCE && money <= MAX_BALANCE) {
			balance = money;
		} else {
			money = balance;
		}
	}

	public int getBalance() {
		return balance;
	}

}
