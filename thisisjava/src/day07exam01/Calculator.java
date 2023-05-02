package day07exam01;

public class Calculator {
	//정적멤버선언 static
	static double pi = 3.14159;
	static String company = "Mycompany";
	static String model = "LCD";
	static String info;
	//복잡한 값으로 정적 필드를 초기화할때
	//정적블럭을 사용
	static {
		info = company + "-" + model;
	}
	int plus(int x, int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	int divide(int x, int y) {
		return x / y;
	}
}
