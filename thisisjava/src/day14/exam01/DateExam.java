package day14.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sdf.format(now));
	}

}
