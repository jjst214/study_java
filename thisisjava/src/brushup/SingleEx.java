package brushup;

public class SingleEx {

	public static void main(String[] args) {
		Single s1 = Single.getInstanceof();
		Single s2 = Single.getInstanceof();
		
		if(s1 == s2) {
			System.out.println("참조객체 동일함");
		}
	}

}
