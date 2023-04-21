package day03.exam01;

import java.util.Scanner;

public class KeyControlExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		boolean run = true;
//		int speed = 0;
//		
//		while(run) {
//			System.out.println("----------------------");
//			System.out.println("1.증속 | 2.감속 | 3.중지");
//			System.out.println("----------------------");
//			System.out.print("선택 : ");
//			String strNum = in.nextLine();
//			if(strNum.equals("1")) {
//				speed++;
//				System.out.println("현재 속도 : " + speed);
//			}else if(strNum.equals("2")) {
//				speed--;
//				System.out.println("현재 속도 : " + speed);
//			}else if(strNum.equals("3")){
//				run = false;
//			}else {
//				System.out.println("1,2,3 중 하나만 입력하세요");
//			}
//			System.out.println("프로그램 종료");
//		}
		
		//실습문제1
//		int sum = 0;
//		for(int i=0; i<100; i++) {
//			if(i%3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		
		//실습문제2
//		while(true) {
//			int a = (int)(Math.random()*6)+1;
//			int b = (int)(Math.random()*6)+1;
//			if(a+b == 5) {
////				System.out.println("(눈" + a + ",눈" + b + ")");
//				System.out.printf("(눈%d,눈%d)", a,b);
//				break;
//			}
//			else {
//				System.out.println("(눈" + a + ",눈" + b + ")");	
//			}
//		}
		
		//실습문제3
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				int result = (4 * x) + (5 * y);
				if(result == 60) {
					System.out.println("(" + x + ", " + y + ")" );
				}
			}
		}
		
		//실습문제4
		boolean run = true;
		int money = 0;
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			String val = in.nextLine();
			
			if(val.equals("1")) {
				System.out.println("선택>" + val);
				System.out.println("예금액>");
				int addMoney = Integer.parseInt(in.nextLine());
				money += addMoney;
			}else if(val.equals("2")) {
				System.out.println("선택>" + val);
				System.out.println("출금액>");
				int minMoney = Integer.parseInt(in.nextLine());
				//잔액보다 출금액이 더크면
				if(money < minMoney) {
					System.out.println("잔액보다 출금하는 금액이 더 큽니다.");
				}else {
					money -= minMoney;
				}
			}else if(val.equals("3")) {
				System.out.println("선택>" + val);
				System.out.println("잔고>" + money);
				
			}else if(val.equals("4")) {
				System.out.println("선택>" + val);
				System.out.println("프로그램 종료");
				run = false;
			}else {
				System.out.println("1, 2, 3, 4 중 한개만 입력하세요");
			}
		}
	}
}
