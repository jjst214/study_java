package day13.exam05;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		//split, StringTokenizer 둘 다 String타입 문자열을 배열로 만드는 메소드임.
		//split은 구분자가 2개이상 일 때 사용하고 StringTokenizer는 구분자가 하나일때 사용함 
		String data1 = "홍길동&이수홍, 박연수";
		String[] arr = data1.split("&|,");
		for(String a : arr) {
			System.out.println(a);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
