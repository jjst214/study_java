package day01.exam03;

public class PrintExam {

	public static void main(String[] args) {
		System.out.print("hi");
		System.out.print("hi");
		System.out.print("hi");
		
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");

		String str = "김그린";
		int int1 = 28;
		System.out.printf("내 이름은 %s 입니다. 나이는 %d이다.\n", str, int1);
		System.out.printf("이름 : %2$d, 나이 : %1$s\n", "abc", 20);
		System.out.printf("이름 : %10s, 나이 : %06d\n", "abc", 20);
		System.out.printf("%-10.2f", 12.123456);
	}

}