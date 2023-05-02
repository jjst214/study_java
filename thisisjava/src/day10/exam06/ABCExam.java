package day10.exam06;

public class ABCExam {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
		//둘 다 가능(위에 구문은 java 12부터 사용가능)
//		if(a instanceof C) {
//			C c = new C();
//			c.method2();
//		}
	}
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

}
