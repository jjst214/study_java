package brushup;

public class Single {
	private static Single single1 = new Single();
	
	private Single() {}
	
	static Single getInstanceof() {
		return single1;
	}
}
