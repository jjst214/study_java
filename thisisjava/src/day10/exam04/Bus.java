package day10.exam04;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	//인터페이스에 없는 추가 메소드
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
	
}
