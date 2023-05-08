package day14.exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam {

	public static void main(String[] args) {
		//2023년 1월 1일 2023년 12월 31일 객체
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime endDay = LocalDateTime.of(2022, 12, 31, 0, 0, 0);
		LocalDateTime startDay = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
		
		if(startDay.isAfter(endDay)) {
			
		}
		
		long remainYears = startDay.until(endDay, ChronoUnit.YEARS);
		long remainMonths = startDay.until(endDay, ChronoUnit.MONTHS);
		long remainDays = startDay.until(endDay, ChronoUnit.DAYS);
		
		System.out.println("남은 해는 : " + remainYears);
		System.out.println("남은 월은 : " + remainMonths);
		System.out.println("남은 일은 : " + remainDays);
		
		LocalDateTime birth = LocalDateTime.of(1996, 8, 10, 0, 0);
		LocalDateTime now = LocalDateTime.now();
		
		long untilDay = birth.until(now, ChronoUnit.DAYS);
		System.out.println("내가 태어난지 " + untilDay + "일이 지났음");
	}

}
