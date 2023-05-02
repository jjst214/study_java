package day09.exam04;

public class DriverExam {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		//매개변수 다형성 전달방법1
		driver.drive(new Bus());
		
		//매개변수 다형성 전달방법2
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
