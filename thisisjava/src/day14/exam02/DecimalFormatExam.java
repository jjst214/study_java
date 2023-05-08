package day14.exam02;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 123456.789;
		// \u00A4 통화기호, %, .소수자리 , 단위구분
		// 형식 객체를 생성
		// 형식객체.format(숫자) >> 형식화된문자열을 리턴
		DecimalFormat df = new DecimalFormat("#, ###.#%");  //"#(10진수로 빈공간을 채우지말고),(구분기호는 ,로 하며) ###(정수 셋째자리마다 구분기호를 쓰고).#(소수점은 한자리까지만 나오게하며)%(퍼센트기호를 출력해라)"
		System.out.println(df.format(num));
	}

}
