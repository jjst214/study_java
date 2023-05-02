package day07.package2;

import day07.package1.A;

public class C {
	A a1 = new A(true);
	
//	A a2 = new A(2); default 속성 생성자는 다른 패키지에서 호출 불가
	String aName = a1.name; // public 속성을 달아줘야 사용가능
}
