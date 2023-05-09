package day15.ex;

public class Container<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t; 
	}
}
