package day09.exam05;

//추상클래스 abstract (이 클래스로 객체 생성불가, 부모클래스만 될 수 있음)
public abstract class Phone {
	//추상 메소드는 추상 클래스에서만 생성 가능
	
	//필드선언
	String owner;
	
	//생성자 선언
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	//추상 메소드 선언
	public abstract void send(String message);
}
