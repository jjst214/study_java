package brushup;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumuletedRoation;
		if(accumuletedRoation<maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation-accumuletedRoation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
