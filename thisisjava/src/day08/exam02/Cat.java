package day08.exam02;

public class Cat extends Animal {
	String name;
	int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		this.kind = "고양이";	
		}
	
	@Override //빈땅에 컨트롤 스페이스 하면 나옴(오버라이딩 제대로 작성했는지 검사해줌)
	public void sound() {
		
		System.out.println("야오옹~");
	}
}
