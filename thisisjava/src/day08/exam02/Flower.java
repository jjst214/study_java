package day08.exam02;

public class Flower {
	String name;
	int cost;
	
	public void flowerInformation() {
		System.out.println(name + " 1송이의 가격은" + cost + "원 입니다.");
	}
	
	public Flower(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
}
