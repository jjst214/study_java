package day12.exam02;

public class ThrowsExam {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}
	public static void findClass() throws ClassNotFoundException { //여기서 try catch를 안쓰고 실행부에서 try catch를 쓸경우 여기서 throws로 실행부로 예외처리를 넘겨줌
		Class.forName("java.lang.String2");
	}
}
