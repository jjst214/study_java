package day07;

import java.util.Scanner;
	
public class BankApplication {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//길이가 100인 Account2[] 배열로 관리
		Account2[] accounts = new Account2[100];
		String getCreateNum;
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			String selectNum = in.nextLine();
			
			if(selectNum.equals("1")) {
				
				System.out.println("------------------");
				System.out.println("계좌생성");
				System.out.println("------------------");
				
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

				
				
			}else if(selectNum.equals("2")) {
				System.out.println("------------------");
				System.out.println("계좌목록");
				System.out.println("------------------");
				
				for(Account2 a:accounts) {
					if(a == null) {break;}
					System.out.println(a.getAccountNum() + "    " + a.getAccountName() + "    " + a.getBalance());
				}
				
			}else if(selectNum.equals("3")) {
				System.out.println("------------------");
				System.out.println("예금");
				System.out.println("------------------");
				System.out.println("계좌번호 : ");
				String accountN = in.nextLine();
				System.out.println("예금액 : ");
				int price = Integer.parseInt(in.nextLine());
				
				//계좌번호에 해당하는 계좌가있을경우 잔고에서 금액을 더해준다
				for(Account2 a: accounts) {
					//각 계좌의 계좌번호와 입력한 계좌번호가 일치하는지
					//일치하면 그 계좌에 있는 잔고에서 입력한 금액을 더해서 변경
					if(a.getAccountNum().equals(accountN)) {
						a.setBalance(a.getBalance() + price);
						System.out.println("결과 : 예금이 성공되었습니다.");
						break;
					}else {
						System.out.println("존재하지 않는 계좌입니다.");
					}
				}
				
			}else if(selectNum.equals("4")) {
				System.out.println("------------------");
				System.out.println("출금");
				System.out.println("------------------");
				System.out.println("계좌번호 : ");
				String accountN = in.nextLine();
				System.out.println("출금액 : ");
				int price = Integer.parseInt(in.nextLine());
				
				//계좌번호에 해당하는 계좌가있을경우 잔고에서 금액을 더해준다
				for(Account2 a: accounts) {
					//각 계좌의 계좌번호와 입력한 계좌번호가 일치하는지
					//일치하면 그 계좌에 있는 잔고에서 입력한 금액을 더해서 변경
					if(a.getAccountNum().equals(accountN)) {
						a.setBalance(a.getBalance() - price);
						System.out.println("결과 : 출금이 성공되었습니다.");
						break;
					}else {
						System.out.println("존재하지 않는 계좌입니다.");
					}
				}
			}
			else if(selectNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println();
			}
		}
	}//main method 끝
}
