package day10.exam03;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		defMethod3();
	}
	default void defaultMethod2() {
		defMethod3();
	}
	//private메소드
	private void defMethod3() {
		System.out.println("defaultMethod코드");
		System.out.println("중복1");
		System.out.println("중복2");
	}
	
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod코드");
		staticCommon();
	}
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("중복1");
		System.out.println("중복2");
	}
}
