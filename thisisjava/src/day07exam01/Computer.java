package day07exam01;

public class Computer {
	//메소드 선언
	int sum(int ...values) { //덧셈을 받을 갯수를 모를때
		//sumNum 변수 선언
		int sumNum = 0;
		for(int i=0; i<values.length; i++) {
			sumNum += values[i];
		}
		return sumNum;
	}
	int add(int x, int y) {
		return x+y;
	}
	double add(double x, double y) {
		return x+y;
	}
	
	//정사각형의 넓이 + 메소드 오버로딩(같은 이름의 메소드를 만들지만 반환 타입이 다를때)
	double areaRectangle(double width) {
		return width * width;
	}
	int areaRectangle(int width) {
		return width * width;
	}
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	int areaRectangle(int width, int height) {
		return width * height;
	}
}
