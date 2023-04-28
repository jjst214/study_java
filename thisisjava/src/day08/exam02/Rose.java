package day08.exam02;

public class Rose extends Flower {
	String color;
	
	public void method1() {
		System.out.println("rose에 추가된 메소드");
	}
	
	@Override
	public void overMethod() {
		
		System.out.println("자식에서 오버라이딩된 메소드입니다.");
	}

	public Rose() {};
	public Rose(String name, int cost, String color) {
		super(name, cost);
		this.color = color;
	}
	
}
