package day09.exam01;

public class ChildExam {

	public static void main(String[] args) {
		//class의 자동타입변환과 강제타입변환
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new Child();
		Child child1 = new Child();
		
		parent2.field1 = "안녕";
//		parent2.field2 = "안녕"; (field2는 parent에 없는 필드라 불가능)		
		
		//강제타입변환
		Child child2 = (Child) parent2;
//		Child child3 = (Child) parent1; parent1은 자동타입변환을 하지 않았기 때문에 코드줄에선 오류가 안나지만 실행시 오류 발생
		child2.field2 = "ㅎㅇ";
		child2.method3();
		System.out.println(child2.field2);
		typeChange(parent3);
		
		//instanceof  (연산자 객체 instanceof 클래스타입)
		System.out.println(parent2 instanceof Parent);
		System.out.println(parent2 instanceof Child);
		System.out.println(parent1 instanceof Child);
		System.out.println(parent1 instanceof Parent);
		
	}
	// Parent 타입 객체를 전달받아 Child 타입으로 강제 타입변환 해주는 메소드
	public static void typeChange(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("강제타입 변환됨");
		}else {
			
		}
		
	}
}
