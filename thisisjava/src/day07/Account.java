package day07;

public class Account {
//	private int balance;
//	static final int MIN_BALANCE = 0;
//	static final int MAX_BALANCE = 1000000;
//
//	public int getBalance() {
//		return balance;
//	}
//
//	public void setBalance(int balance) {
//		if(balance <= MIN_BALANCE || balance > MAX_BALANCE) {
//			balance = this.balance;
//		}
//		else {
//			this.balance = balance;
//		}
//	}
	
	boolean run_bank = true;
	private String name;
	private String account;
	private int balance;
	static final int MIN_BALANCE = 0;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAccount() {
		return account;
	}



	public void setAccount(String account) {
		this.account = account;
	}

	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	Account(){}
	
	
	
	void plus(int value) {
		if(value <= MIN_BALANCE) {
			System.out.println("입금액을 1원 이상 입력하세요");
		}else {
			this.balance += value;
		}
	}
	
	void minus(int value) {
		if(value <= MIN_BALANCE) {
			System.out.println("출금액을 1원 이상 입력하세요");
		}else if(this.balance - value < MIN_BALANCE){
			System.out.println("잔액보다 많이 출금 할 수 없습니다.");
		}else {
			System.out.println("결과: 출금이 성공되었습니다.");
			this.balance -= value;
		}
	}

}
