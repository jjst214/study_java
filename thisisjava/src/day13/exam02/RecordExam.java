package day13.exam02;

public class RecordExam {

	public static void main(String[] args) {
		Member m = new Member("winter", "눈송이", 25);
		Member m2 = new Member("winter", "눈송이", 25);
		//Member 클래스에 id,name,age값을 받아오는 메소드를 만들지 않았지만
		//레코드 선언 때문에 getter 메소드가 자동으로 생성되어 사용이 가능함
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		
		//toString도 레코드덕에 재정의 됨(원래 16진수 hash값이 나와야함)
		System.out.println(m.toString());
		
		//hashCode, equals도 재정의 됨
		System.out.println(m.hashCode() == m2.hashCode());
		System.out.println(m.equals(m2));
	}

}
