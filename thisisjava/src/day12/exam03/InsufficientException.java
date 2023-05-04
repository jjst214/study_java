package day12.exam03;
//사용자 정의 예외(기존에 없던 예외클래스를 만듬)
//일반예외는 Exception을 상속받고 실행 예외는 RuntimeException을 상속받아야함
public class InsufficientException extends Exception {
	public InsufficientException() {
		
	}
	public InsufficientException(String message) {
		super(message); //예외 객체의 공통 메소드인 getMessage()의 리턴값으로 사용
	}
}
