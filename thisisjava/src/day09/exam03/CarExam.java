package day09.exam03;

public class CarExam {
	public static void main(String[] args) {
		//Car 객체
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		//한국타이어 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//금호타이어 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
