package day14.ex;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class exam565p_15 {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2023, 12,31,0,0,0);
		
		long days = start.until(end, ChronoUnit.DAYS);
		
		System.out.println("올해 12월 31일까지 " + days + "일 남음");
		
	}

}
