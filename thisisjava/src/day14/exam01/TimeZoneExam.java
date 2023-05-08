package day14.exam01;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {
		//지역 시간대 ID 출력하기(문자열 배열로 리턴)
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String a:availableIDs) {
			System.out.println(a);
		}
		//TimeZone 객체 생성 getTimeZone()
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar losnow = Calendar.getInstance(timezone);
		
		int hour = losnow.get(Calendar.HOUR);
		int minute = losnow.get(Calendar.MINUTE);
		int second = losnow.get(Calendar.SECOND);
		
		System.out.println("로스엔젤레스 시간은 : " + hour);
		System.out.println("로스엔젤레스 분은 : " + minute);
		System.out.println("로스엔젤레스 초는 : " + second);
	}

}
