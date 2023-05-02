package day06.exam02;

public class Calculator {
	void powerOn() {
		System.out.println("�쟾�썝�쓣 耳��땲�떎.");
	}
	
	int plus(int x, int y) {
		powerOn();
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("�쟾�썝�쓣 �걬�땲�떎.");
	}
}
