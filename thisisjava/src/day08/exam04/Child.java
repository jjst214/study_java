package day08.exam04;

public class Child extends Parent{

	@Override
	public void method1() {
		
		System.out.println("자식메소드1");
	}

	@Override
	public void method2() {
		
		System.out.println("자식메소드2");
	}
	
	public void method3() {
		System.out.println("자식메소드3");
	}
}
