package day11.exam01;

import day11.exam01.A.C;

public class AExam {

	public static void main(String[] args) {
		A a = new A();
		
		// A객체가 먼저 만들어져야 A내부에 있는 B객체 생성가능
		A.B b = a.new B();
		b.method1();
		a.method();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		System.out.println(c.field1);
		c.method1();
		System.out.println(A.C.field2);
		A.C.method2();
	}

}
