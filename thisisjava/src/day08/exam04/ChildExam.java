package day08.exam04;

public class ChildExam {

	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;
		Parent parent2 = new Parent();
		parent.method1();
		parent2.method1();
	}

}
