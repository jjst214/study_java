package day01.exam03;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
//		String str = scan.nextLine();
//		System.out.println(str);
		String str1 = "22";
		int int1 = 10;
		int result = Integer.parseInt(str1) + int1;
//		int result = str1 + int1;
		System.out.println(result);
	}

}
