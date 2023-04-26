package day07.package1;

public class B {
	A a1 = new A(true);
	A a2 = new A(2);
	String aName = a1.name;
	// A a3 = new A("그린"); private 생성자는 다른 파일(외부)에서 호출 불가
	
	int aspeed = a1.getSpeed();
}
