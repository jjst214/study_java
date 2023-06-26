package brushup;

public class Tire {
	public int maxRotation;
	public int accumuletedRoation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumuletedRoation;
		if(accumuletedRoation<maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation-accumuletedRoation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
