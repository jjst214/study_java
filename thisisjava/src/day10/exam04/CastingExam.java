package day10.exam04;

public class CastingExam {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.checkFare();
		bus1.run();
		
		//자동 타입변환
		Vehicle bus2 = new Bus(); // Vehicle 타입으로 만들었기 때문에 Bus클래스만 가지고 있는 메소드 사용불가
		bus2.run();
		
		//강제 타입변환
		Bus bus3 = (Bus) bus2;
		bus3.checkFare();
	}

}
