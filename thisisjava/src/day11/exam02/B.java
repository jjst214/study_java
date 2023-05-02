package day11.exam02;

public class B {
	//B의 인스턴스 필드, 메소드
	int field1;
	void method1() {
		
	}
	
	//B의 정적 필드, 메소드
	static int field2;
	static void method2() {
		
	}
	
	//인스턴스 멤버 클래스
	class C{
		void method() {
			//B의 필드와 메소드 전부 사용가능
			field1 = 10;
			method1();
			field2 = 10;
			method2();
		}
	}
	
	//정적 멤버 클래스
	static class D{
		void method() {
			//정적 멤버 클래스에서는 인스턴스 필드,메소드 사용불가
			//field1 = 20;
			//method1();
			field2 = 20;
			method2();
		}
	}
}
