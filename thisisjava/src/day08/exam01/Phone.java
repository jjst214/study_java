package day08.exam01;

public class Phone {
	public String model;
	public String color;
	
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("phone() 생성자 실행");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println(message);
	}
	public void receiveVoice(String message) {
		System.out.println(message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
