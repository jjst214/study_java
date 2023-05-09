package day15.exam01;

public class Car {
	private String model;
	private String name;
	private int age;
	
	public Car() {
		
	}
	
	public Car(String model, String name, int age) {
		this.model = model;
		this.age = age;
		this.name = name;
	}
	
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setName(String name) {
		this.name = name;
	}
}
