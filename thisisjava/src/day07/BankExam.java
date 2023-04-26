package day07;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		Account bank = new Account();
		BankApplication apli = new BankApplication();
		Scanner in = new Scanner(System.in);
		String scan;
		while(bank.run_bank) {
			System.out.println("===========================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("===========================================");
			System.out.println("선택> ");
			scan = in.nextLine();
			
			if(scan.equals("1") | scan.equals("2") | scan.equals("3") | scan.equals("4") | scan.equals("5")) {
				
				if(scan.equals("1")) { // 계좌생성
					System.out.println("--------");
					System.out.println("계좌생성");
					System.out.println("--------");
					System.out.print("계좌번호: ");
					bank.setAccount(in.nextLine());
					System.out.println();
					System.out.print("계좌주: ");
					bank.setName(in.nextLine());
					System.out.println();
					System.out.print("초기입금액: ");
					bank.setBalance(in.nextInt());
					in.nextLine();
					System.out.println();
					if(bank.getBalance() < Account.MIN_BALANCE) {
						System.out.println("0원 미만으로는 입금 할 수 없다");
					}else {
						
					}
				}
				else {
					System.out.println("1~5번 중 한개만 입력하세요.");
				}
			}
		}
	}

}
