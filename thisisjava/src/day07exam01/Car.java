package day07exam01;

public class Car {
	//인스턴스 필드 선언
	int speed;
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	//정적 메소드 선언
	static void simulate() {
//		speed == 200;  << 인스턴스 필드는 객체를 생성하기 전에 사용할 수 없음(오류)
		
		//정적메소드에서 인스턴스 필드, 메소드를 사용하려면 아래처럼 객체를 만들어야 사용이 가능함
		Car car1 = new Car();
		car1.speed = 200;
		car1.run();
	}
	public static void main(String[] args) {
		simulate();
	}
}
