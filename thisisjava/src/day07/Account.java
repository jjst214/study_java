package day07;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <= Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			balance = this.balance;
		}
		//삼항 연산자 이용
//		this.balance = balance >= Account.MIN_BALANCE
//				&& balance <= Account.MAX_BALANCE
//				? balance : this.balance;
	}
}
