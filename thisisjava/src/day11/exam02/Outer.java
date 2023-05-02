package day11.exam02;

public class Outer {
	String field = "Outer 필드";
	
	void method() {
		System.out.println("바깥 메소드");
	}
	
	class Inclass{
		String field = "In 필드";
		void method() {
			System.out.println("In 메소드");
		}
		void print() {
			// * 바깥 객체와 안의 객체 필드명과 메소드명이 겹칠 경우 호출방법
			//바깥 객체의 필드와 메소드 사용
			System.out.println(Outer.this.field);
			Outer.this.method();
			
			//In 객체의 필드와 메소드 사용
			System.out.println(this.field);
			this.method();
		}
	}
	
	//인스턴스 메소드
	void useIn() {
		Inclass inc = new Inclass();
		inc.print();
	}
}
