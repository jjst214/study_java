package day18.exam01;

public class Person {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//객체 비교를 위한 인자값 오버라이딩
//	@Override
//	public int compareTo(Person o) {
//		if(age < o.age) {
//			return -1;
//		}else if(age == o.age) {
//			return 0;
//		}else {
//			return 1;
//		}
//	}
	
	
}
