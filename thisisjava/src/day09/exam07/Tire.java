package day09.exam07;

public class Tire {
	//필드
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulatedRotation; //누적 회전수
	public String location;			//타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		//누적 회전수를 1씩 증가
		++accumulatedRotation;
		//누적 회전수가 최대 회전수보다 작으면 true, 아니면 false 반환
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("*** " + location + "Tire펑크 ***");
			return false;
		}
	}
}
