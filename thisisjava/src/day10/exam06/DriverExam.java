package day10.exam06;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
		
		ride(bus);
	}
	//메소드
	public static void ride(Vehicle vehicle) {
		//만약 버스타입이면 버스타입으로 캐스팅
		if(vehicle instanceof Bus) {
			Bus bus2 = (Bus) vehicle;
			bus2.checkFare();
		}
		vehicle.run();
	}
}
