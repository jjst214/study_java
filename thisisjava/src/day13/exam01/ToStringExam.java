package day13.exam01;

public class ToStringExam {

	public static void main(String[] args) {
		Object obj = new Object();
		//Object의 toString 메소드는 객체의 문자정보를 리턴
		//클래스명@16진수 해시코드
		System.out.println(obj.toString());
		String str = "green";
		System.out.println(str.toString());
	}

}
