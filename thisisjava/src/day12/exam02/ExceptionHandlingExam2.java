package day12.exam02;

public class ExceptionHandlingExam2 {
	public static void main(String[] args) {
		// Class.forName("패키지...클래스이름") classPath위치에서 주어진 클래스를 찾는 코드
		// 클래스를 찾지 못하면 ClassNotFoundException 예외 발생
		try {
			Class.forName("java.lang.String2");
			System.out.println("클래스가 존재합니다");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
