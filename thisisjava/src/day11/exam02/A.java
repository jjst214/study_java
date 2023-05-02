package day11.exam02;

public class A {
	
	void method(int arg) {
		int var = 100;
		//로컬 클래스 선언(생성자 안에 클래스를 생성하면 로컬 클래스, 클래스안에 클래스 작성하면 멤버 클래스)
		class B{
			int field1 = 1;
			static int field2 = 2;
			B(){
				System.out.println("B-생성자 실행");
			}
			void method1() {
				//로컬 변수 읽기
				System.out.println("var : " + var);
				System.out.println("arg : " + arg);
				System.out.println("B-method1 실행");
				//로컬 변수 수정안됨
				//var = 50;
				//arg = 200;
			}
			static void method2() {
				System.out.println("B-method2 실행");
			}
		}
		//로컬 객체 생성
				B b = new B();
				//로컬 객체의 인스턴스 필드와 메소드 사용
				System.out.println(b.field1);
				b.method1();
				//로컬 클래스의 정적 필드와 정적 메소드 사용
				System.out.println(B.field2);
				B.method2();
	}
	
	//생성자
	A(){
		
		
	}
	
	
}
