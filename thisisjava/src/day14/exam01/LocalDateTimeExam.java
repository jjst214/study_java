package day14.exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateTimeExam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LocalDateTime now = LocalDateTime.now();
		//날짜와 시간을 문자열 패턴으로 변환
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
//		System.out.println("현재 시간 : " + now.format(dtf));
//		
//		LocalDateTime result1 = now.minusDays(7);
//		System.out.println("7일 전의 시간: " + result1.format(dtf));
//		
//		LocalDateTime result2 = now.plusDays(50);
//		System.out.println("50일 후의 시간: " + result2.format(dtf));
		
		System.out.print("년도를 입력하세요: ");
		int year = in.nextInt();
		
		System.out.print("월을 입력하세요: ");
		int month = in.nextInt();
		
		System.out.print("일을 입력하세요: ");
		int day = in.nextInt();
		
		LocalDateTime targetDay = LocalDateTime.of(year, month, day, 0, 0);
		LocalDateTime day100 = targetDay.plusDays(100);
		System.out.println("100일은 : " + day100.format(dtf));
	}

}
