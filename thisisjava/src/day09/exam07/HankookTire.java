package day09.exam07;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		//누적 회전수를 1씩 증가
		++accumulatedRotation;
		//누적 회전수가 최대 회전수보다 작으면 true, 아니면 false 반환
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 한국 Tire수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("*** " + location + "한국 Tire펑크 ***");
			return false;
		}
	}
	
}
