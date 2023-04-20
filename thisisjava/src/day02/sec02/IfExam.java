package day02.sec02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		System.out.print("숫자를 입력 하세용 : ");
//		int number = in.nextInt();
//		if(number%3 == 0) {
//			System.out.println(number + "는 3의 배수입니다.");
//		}
//		else if(number%5 == 0) {
//			System.out.println(number + "는 5의 배수입니다.");
//		}
//		else {
//			return;
//		}
		
		System.out.print("아이디를 입력 하세용 : ");
		String userId = in.nextLine();
		
		System.out.print("비밀번호를 입력 하세용 : ");
		String userPs = in.nextLine();
		
		if(userId.equals("green") && userPs.equals("1234")) {
			System.out.println("로그인 됐습니다.");
		}
		else {
			System.out.println("잘못 입력했어용");
		}
		
	}

}
