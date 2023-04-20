package day02.sec01;
import java.util.Scanner;
public class OperatorExam04 {

	public static void main(String[] args) {
		int charCode = 'D';
		if(charCode >= 65 && charCode<=90) {
			System.out.println("대문자이다.");
		}
		if(charCode >= 97 && charCode<=122) {
			System.out.println("소문자이다.");
		}
		
		Scanner in = new Scanner(System.in);
		
//		int a = in.nextInt();
//		if(a%2 == 0 && a%3 == 0) {
//			System.out.println("2와 3의 배수이다");
//		}
//		if(a%2 == 0 || a%3 == 0) {
//			System.out.println("2또는 3의 배수이다");
//		}
//		if(a%4 == 0 && a%5 == 0) {
//			System.out.println("4와 5의 배수이다");
//		}
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		int score = 85;
		char grade = score > 90 ? 'A' : score > 80 ? 'B' : 'C';  //score가 90보다 크면 A, 아니면 score가 80보다 크면 B 아니면 C
		System.out.println(grade);
	}

}
