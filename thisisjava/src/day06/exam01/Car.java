package day06.exam01;

public class Car {
	//필드
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	

	public Car() {
		
	}
	
	public Car(String model) {
		this(model, "빨강");
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