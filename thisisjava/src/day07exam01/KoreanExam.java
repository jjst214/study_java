package day07exam01;

public class KoreanExam {

	public static void main(String[] args) {
		Korean kor = new Korean("123456-1234567", "김그린");
		
		kor.name = "이그린";
		// final필드는 값 변경 불가능
//		kor.nation = "미국";
//		kor.ssn = "12345677";
		System.out.println(kor.nation);
	}

}
