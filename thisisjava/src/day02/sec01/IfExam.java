package day02.sec01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세연 : ");
			
			int val1 = Integer.parseInt(in.nextLine());
			
			if(val1 % 2 == 1) {
				System.out.println("홀수입니다.");
			}
			else {
				System.out.println("짝수입니다.");
			}
			if(val1 == 100) {
				break;
			}
		}
	}

}
