package day12.exam03;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	//출금메소드인데 잔고보다 많이 출금하려할때 예외를 발생시킴
	public void withdraw(int money) throws InsufficientException{ //예외 발생시 InsufficientException 클래스로 처리를 넘김
		if(balance < money) {
			throw new InsufficientException("잔고 부족 : " + (money-balance) + "원 모자람"); //예외처리 클래스 매개변수 message에 "잔고 부족 : " + (money-balance) + "원 모자람"<<이 전송됨
		}
		balance -= money;
	}
}
