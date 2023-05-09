package day15.ex;

public class Container2<A,B> {
	private A a;
	private B b;
	
	public void set(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getKey() {
		return a;
	}
	
	public B getValue() {
		return b;
	}
}
