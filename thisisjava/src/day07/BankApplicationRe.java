package day07;

import java.util.Scanner;

public class BankApplicationRe {
	
	static Scanner in = new Scanner(System.in);
	//길이가 100인 Account2[] 배열로 관리
	static Account2[] accounts = new Account2[100];
	static String getCreateNum;
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			String selectNum = in.nextLine();
			
			if(selectNum.equals("1")) {
				printTitle("계좌생성");
				createAccount();
			}else if(selectNum.equals("2")) {
				printTitle("계좌목록");
				accountList();
			}else if(selectNum.equals("3")) {
				balanceIO("예금");
			}else if(selectNum.equals("4")) {
				balanceIO("출금");
			}
			else if(selectNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println();
			}
		}
	}//main method 끝
	
	//출력 method
	public static void printTitle(String str){
		System.out.println("------------------");
		System.out.println(str);
		System.out.println("------------------");
	}
	
	//계좌생성 method
	private static void createAccount() {
		Account2 account = new Account2();
		System.out.println("계좌번호 : ");
		account.setAccountNum(getCreateNum = in.nextLine());
		System.out.println("계좌주 : ");
		account.setAccountName(in.nextLine());
		System.out.println("초기입금액 : ");
		account.setBalance(Integer.parseInt(in.nextLine()));
		

		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}else {
				if(accounts[i].getAccountNum().equals(getCreateNum)) {
					System.out.println("중복계좌 입니다.");
					break;
				}
			}
		}
		
	}
	//계좌목록 method
	private static void accountList() {
		for(Account2 a:accounts) {
			if(a==null) { break; }
			System.out.println(a.getAccountNum() + "    " + a.getAccountName() + "    " + a.getBalance());
		}
	}
	// 예금 출금 IO
	private static void balanceIO(String text){
		printTitle(text);
		System.out.println("계좌번호 : ");
		String accountN = in.nextLine();
		System.out.println(text + "액 : ");
		int price = Integer.parseInt(in.nextLine());
		
		//계좌번호에 해당하는 계좌가있을경우 잔고에서 금액을 더해준다
		Account2 account = findAccount(accountN);
		if(account==null) {
			System.out.println("없는 계좌 입니다.");
			return;
		}
//		int balance;
//		if(text.equals("예금") && price <= 0) {
//			System.out.println("0원 이하의 금액은 입금할 수 없습니다.");
//		}else if(text.equals("출급"){
//			balance = account.getBalance() + price;
//		}
		
//		int balance = text.equals("예금") ? account.getBalance() + price : account.getBalance() - price;
//		account.setBalance(balance);
		System.out.println("결과 : "+ text + "이 성공되었습니다.");
	}
	//aacounts 배열에서 일치하는 계좌번호가 있으면 해당하는 account 객체를 리턴해주는 method
	//findAccount의 리턴값이 null이면 없는 계좌
	private static Account2 findAccount(String accountNum) {
		Account2 account = null;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				if(accounts[i].getAccountNum().equals(accountNum)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}
}
