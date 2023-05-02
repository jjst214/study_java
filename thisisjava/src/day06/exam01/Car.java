package day06.exam01;

public class Car {
	//필드선언
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
//	생성자 선언 기본 생성자
//	생성자 오버로딩 : 매개 변수의 타입, 개수, 순서가 다른 생성자를 여러개 작성
//	목적 : 객체의 필드를 다양하게 초기화 할 수 있음
	public Car() {	// 1번 생성자
		
	}
	
	public Car(String model) {
		this(model, "흰색");
	}
	
	public Car(String model, String color) {
		this(model,color,200);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
