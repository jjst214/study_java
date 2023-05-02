package day08.exam03;

class A{
	int age;
	String name = "이름";
}
class B extends A{
	String color;
}
class C extends A{
	
}
class D extends B{
	String black;
	String name = "김그린";
}
class E extends C{
	
}

public class PromotionExam {
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = new B();
		A a3 = d;
		A a4 = b;
		A a5 = b;
		
	}
	
}
